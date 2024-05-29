package com.taeheon.service;

import com.taeheon.domain.Coupon;
import com.taeheon.producer.CouponCreateProducer;
import com.taeheon.repository.CouponCountRepository;
import com.taeheon.repository.CouponRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ApplyService {

    private final CouponRepository couponRepository;

    private final CouponCountRepository couponCountRepository;

    private final CouponCreateProducer couponCreateProducer;

    public ApplyService(CouponRepository couponRepository, CouponCountRepository couponCountRepository, CouponCreateProducer couponCreateProducer) {
        this.couponRepository = couponRepository;
        this.couponCountRepository = couponCountRepository;
        this.couponCreateProducer = couponCreateProducer;
    }

    // @Transactional
    public void apply(Long userId) {
        // 10:01 1번 사용자
        // 10:02 1번 발급완료
        // 2,3,4는 10:02분 이후에 발급이 가능하게 된다.
        // long count = couponRepository.count(); // DB Count
        Long count = couponCountRepository.increment();
        if (count > 100) {
            return;
        }

        // 직접 쿠폰을 생성하는 로직 삭제
        // couponRepository.save(new Coupon(userId));

        // 토픽에 User의 Id를 전송하도록 설정
        couponCreateProducer.create(userId);
    }
}
