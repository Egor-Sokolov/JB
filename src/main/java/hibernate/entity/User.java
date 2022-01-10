package hibernate.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "user_data", schema = "todolist", catalog = "postgres")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false, length = -1)
    private String email;

    @Column(name = "userpassword", nullable = false, length = -1)
    private String password;

    @Column(name = "username", nullable = false, length = -1)
    private String username;


}
