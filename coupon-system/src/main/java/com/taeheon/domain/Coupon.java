package com.taeheon.domain;

import jakarta.persistence.*;

@Entity
public class Coupon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

//    @Version
//    private Long version;

    public Coupon() {

    }

    public Coupon(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }
}
