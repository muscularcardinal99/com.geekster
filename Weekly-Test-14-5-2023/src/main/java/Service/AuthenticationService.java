package Service;

import DAO.ITokenRepo;
import Model.AuthenticationToken;
import Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    ITokenRepo tokenRepo;
    public void saveToken(AuthenticationToken token){
        tokenRepo.save(token);
    }
    public AuthenticationToken getToken(Users users){
        return tokenRepo.findByUser(users);
    }
    public boolean authenticate(String userEmail, String token){
        AuthenticationToken auth =tokenRepo.findFirstByToken(token);
        String expectedEmail = auth.getUsers().getEmail();
        return expectedEmail.equals(userEmail);
    }
}
