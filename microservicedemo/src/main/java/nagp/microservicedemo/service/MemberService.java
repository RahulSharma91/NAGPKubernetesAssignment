package nagp.microservicedemo.service;

import lombok.extern.slf4j.Slf4j;
import nagp.microservicedemo.domain.Member;
import nagp.microservicedemo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import  java.util.ArrayList;
import java.util.Collections;
import  java.util.List;

@Service
@Slf4j
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getMemberByName(String name) {
        log.info("Getting members {} from the repository.", name);

        List<Member> memberList = memberRepository.findByName(name);

        if (CollectionUtils.isEmpty(memberList)) {
            log.info("No member found by name {}", name);
            return new ArrayList<Member>();
        }
        log.info("found {} members by name {}", memberList.size(), name);
        return memberList;
    }

    public Member addMember(Member member) {
        log.info("Adding member {} to database", member.getName());
        Member member2 = memberRepository.save(member);
        log.info("Added member {} successfully", member2.getName());
        return member2;
    }

    public List<Member> getMembers() {
        log.info("Getting all members from the repository.");
        Iterable<Member> iterable = memberRepository.findAll();
        List<Member> memberList = StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
        return memberList;
    }
}
