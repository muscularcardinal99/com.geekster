package DAO;

import Model.AuthenticationToken;
import Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findByUser(Users users);

    AuthenticationToken findFirstByToken(String token);
}
