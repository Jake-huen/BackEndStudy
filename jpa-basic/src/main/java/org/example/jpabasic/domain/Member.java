package org.example.jpabasic.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter // setter는 고민할 필요 -> 유지보수를 위해서
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID") // member_id 데이터베이스와 java 쓰는방법이 다름
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    public Member() {}

}
