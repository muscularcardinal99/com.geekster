package Service;

import DAO.IUserRepo;
import Model.AuthenticationToken;
import Model.Users;
import dto.SignInInput;
import dto.SignInOutput;
import dto.SignUpInput;
import dto.SignUpOutput;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
@Transactional

public class UserService {
    @Autowired
    IUserRepo userRepo;

    @Autowired
    AuthenticationService authenticationService;
    public SignUpOutput signUp(SignUpInput signUpInput) {
        Users u = userRepo.findByUsersEmail(signUpInput.getUserEmail());
        if(u!=null){
            throw new IllegalStateException("User Already present, sign in pleas!!!!");
        }

        String password=null;
        try{
            password=encryptPassword(signUpInput.getUserPassword());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
       u = new Users(signUpInput.getAge(),
               signUpInput.getUserFirstName(),
               signUpInput.getUserLastName(),
               signUpInput.getUserEmail(),signUpInput.getUserContact(),password

       );
        userRepo.save(u);
        AuthenticationToken  token = new AuthenticationToken(u);
        return new SignUpOutput("User regestred ","User created Sucessfully!!!!" );
    }

    private String encryptPassword(String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(userPassword.getBytes());
        byte[] digested =  md5.digest();

//        String hash = DatatypeConverter.printHexBinary(digested);
        String hash = new String(digested);
        return hash;
    }

    public SignInOutput signIn(SignInInput signInInput) {
        Users user = userRepo.findFirstByEmail(signInInput.getUserEmail());
        if(user==null){
         throw new IllegalStateException("Invalid user , Pleas Signup");
        }
        String password =null;
        try{
            password = encryptPassword(signInInput.getUserPassword());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        boolean isValid = password.equals(user.getPassword());

        if(!isValid){
            throw new IllegalStateException("Invalid user , Pleas Signup");
        }
        AuthenticationToken auth= authenticationService.getToken(user);

        return  new SignInOutput("Authtenticaten Successfull",auth.getToken());

    }

    public String updateUser(Integer userId, Users users) {
        if(userRepo.existsById(userId)){
            userRepo.save(users);
        }
        else return "user does not Exists";
        return "user Data up Dated";
    }
}
