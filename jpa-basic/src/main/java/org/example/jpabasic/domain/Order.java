package org.example.jpabasic.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime orderDate; // DB저장 : ORDER_DATE, order_date

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Order(){}
}
