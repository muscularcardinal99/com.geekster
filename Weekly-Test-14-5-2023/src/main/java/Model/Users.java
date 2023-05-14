package Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String firstName;
    private String lastName;
    private Integer age;
    @Column(nullable = false)
    @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$")
    private String email;
    private String phoneNumber;
    private String password;

    public Users(Integer age, String userFirstName, String userLastName, String userEmail, String userContact, String password) {
        this.age=age;
       firstName=userFirstName;
        lastName=userLastName;
        email=userEmail;
        phoneNumber=userContact;
        this.password=password;
    }
}
