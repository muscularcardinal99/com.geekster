package Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String token;
    private LocalDate tokenCreationDate;

    @OneToOne()
    @JoinColumn(nullable = false,name = "fk_user_id")
    private Users users;

    public AuthenticationToken(Users u){
        users =u;
        this.tokenCreationDate=LocalDate.now();
        this.token= UUID.randomUUID().toString();
    }
}
