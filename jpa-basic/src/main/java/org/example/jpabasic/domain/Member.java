package org.example.jpabasic.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter // setter는 고민할 필요 -> 유지보수를 위해서
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @OneToOne
    private Delivery delivery;

    public Member() {}

}
