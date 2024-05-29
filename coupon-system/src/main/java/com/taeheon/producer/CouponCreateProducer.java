package com.taeheon.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

// 카프카 템플릿을 사용해서 토픽의 데이터를 전송할 프로듀서 만들기
@Component
public class CouponCreateProducer {

    private final KafkaTemplate<String, Long> kafkaTemplate;

    public CouponCreateProducer(KafkaTemplate<String, Long> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // 토픽에 유저의 아이디를 전달할 것이기 때문에 유저의 아이디를 매개변수로 가지는 메소드 생성
    public void create(Long userId) {
        kafkaTemplate.send("coupon_create", userId);
    }
}
