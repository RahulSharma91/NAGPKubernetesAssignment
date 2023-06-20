package nagp.microservicedemo.domain;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
