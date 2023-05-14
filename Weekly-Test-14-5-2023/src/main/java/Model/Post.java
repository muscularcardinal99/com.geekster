package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Post {

    private Integer postId;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private String postData;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
}
