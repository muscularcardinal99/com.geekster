package Controller;

import Model.Users;
import Service.UserService;
import dto.SignInInput;
import dto.SignInOutput;
import dto.SignUpInput;
import dto.SignUpOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpInput){
        return userService.signUp(signUpInput);
    }
    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInInput){
        return userService.signIn(signInInput);
    }
    @PutMapping("/UpdateUser")
    public String updateUser(@RequestParam Integer userId,@RequestBody Users users){
        return userService.updateUser(userId, users);
    }


}
