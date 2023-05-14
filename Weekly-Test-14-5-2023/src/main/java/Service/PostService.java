package Service;

import DAO.IPostRepo;
import Model.Post;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PostService {
    @Autowired
    IPostRepo postRepo;
    public void savePost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPost() {
      return  postRepo.findAll();
    }
}
