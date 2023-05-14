package Controller;

import Model.Post;
import Service.AuthenticationService;
import Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("/savePost")
    public void savePost(@RequestBody Post post){
        postService.savePost(post);
    }

    @GetMapping("/getPost")
   public ResponseEntity<List<Post>> getAllPost(@RequestParam String userEmail,@RequestParam String token){
        HttpStatus s=null;
        List<Post> posts=null;
        if(authenticationService.authenticate(userEmail,token)){
            posts = postService.getAllPost();
            s=HttpStatus.OK;
        }else{
            s=HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<>(posts,s);
    }

}
