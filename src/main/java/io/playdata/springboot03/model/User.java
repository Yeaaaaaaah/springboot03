package io.playdata.springboot03.model;

import lombok.*; // 패치지명.* -> 그 안에 있는 모든 요소를 불러오기함.

import javax.persistence.*;

@Entity // JPA에서 인식하는 객체가 되게해줌 = 사용하는 대상이 됨
@Table(name = "account") // SQL에 들어갈 테이블 -> user 이름이 예약어므로 account로 씀
@Getter @Setter
@NoArgsConstructor // 클래스이름 그자체로 호출하는 생성자 = 인자 x
@AllArgsConstructor //
@ToString // 멤버변수값을 보여주는 스트링 값 생성.
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동생성하게 해줌
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;
}
