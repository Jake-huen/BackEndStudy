package com.taeheon.service;

import com.taeheon.domain.Coupon;
import com.taeheon.repository.CouponCountRepository;
import com.taeheon.repository.CouponRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplyService {

    private final CouponRepository couponRepository;

    private final CouponCountRepository couponCountRepository;

    public ApplyService(CouponRepository couponRepository, CouponCountRepository couponCountRepository) {
        this.couponRepository = couponRepository;
        this.couponCountRepository = couponCountRepository;
    }

    // @Transactional
    public void apply(Long userId) {
        // 10:01 1번 사용자
        // 10:02 1번 발급완료
        // 2,3,4는 10:02분 이후에 발급이 가능하게 된다.
        // Long count = couponRepository.count(); // 여기서
        Long count = couponCountRepository.increment();
        if (count > 100) {
            return;
        }
        couponRepository.save(new Coupon(userId));
    }
}
