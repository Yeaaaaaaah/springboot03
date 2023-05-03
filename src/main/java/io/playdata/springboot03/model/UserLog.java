package io.playdata.springboot03.model;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name="user_log")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString
public class UserLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String action;
    @Column(nullable = false)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}