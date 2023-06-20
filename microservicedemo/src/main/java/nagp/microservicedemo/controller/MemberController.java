package nagp.microservicedemo.controller;

import lombok.extern.slf4j.Slf4j;
import nagp.microservicedemo.domain.Member;
import nagp.microservicedemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/members/{name}")
    public List<Member> getMemberByName(@PathVariable String name) {
        log.info("Getting member by name {} ", name);
        List memberList = memberService.getMemberByName(name);
        log.info("Received {} members by name {}", memberList.size(), name);
        return memberList;
    }

    @GetMapping("/members")
    public List<Member> getAllMemberByName() {
        log.info("Getting all members");
        List memberList = memberService.getMembers();
        log.info("Received {} members", memberList.size());
        return memberList;
    }

    @PostMapping("/member/save")
    public Member addMember(@RequestBody Member member) {
        log.info("Adding member {} to the Database", member.getName());
        return memberService.addMember(member);
    }

    @RequestMapping
    public String defaultMapping() {
        return "Welcome to microservice demo!";
    }

    @GetMapping(value = "/test/1")
    public String test() {
        return "Welcome to the  test method demo!";
    }
}



