package com.taeheon.service;

import com.taeheon.domain.Coupon;
import com.taeheon.producer.CouponCreateProducer;
import com.taeheon.repository.CouponCountRepository;
import com.taeheon.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplyService {

    private final CouponRepository couponRepository;

    private final CouponCountRepository couponCountRepository;

    private final CouponCreateProducer couponCreateProducer;

    // @Transactional
    public void apply(Long userId) {
        // 10:01 1번 사용자
        // 10:02 1번 발급완료
        // 2,3,4는 10:02분 이후에 발급이 가능하게 된다.
        // long count = couponRepository.count(); // DB Count

        // Redis는 싱글 스레드 기반으로 동작하기 때문에 첫번째 쓰레드가 작업이 끝날 때까지 기다린다.
        // 그래서 언제나 최신 count를 가져가기 때문에 쿠폰이 더 많이 생성될 일이 없다.
        Long count = couponCountRepository.increment();
        log.info("count = {}", count);
        if (count > 100) {
            return;
        }

        // 직접 쿠폰을 생성하는 로직 삭제
        // couponRepository.save(new Coupon(userId));

        // 토픽에 User의 Id를 전송하도록 설정
        couponCreateProducer.create(userId);
    }
}
