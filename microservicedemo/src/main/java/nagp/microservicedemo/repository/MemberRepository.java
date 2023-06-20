package nagp.microservicedemo.repository;

import nagp.microservicedemo.domain.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, String> {
    List<Member> findByName(String name);
}