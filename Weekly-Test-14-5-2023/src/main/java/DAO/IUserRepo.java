package DAO;

import Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo  extends JpaRepository<Users,Integer> {
    Users findByUsersEmail(String userEmail);

    Users findFirstByEmail(String userEmail);
}
