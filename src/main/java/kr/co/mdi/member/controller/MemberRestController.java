package kr.co.mdi.member.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mdi.member.entity.MemberEntity;
import kr.co.mdi.member.service.MemberService;

@RestController
public class MemberRestController {

    private final MemberService memberService;

    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/api/members")
    public List<MemberEntity> getAllMembers() {
        return memberService.findAll();
    }

    @GetMapping("/api/members/{id}")
    public ResponseEntity<MemberEntity> getMemberById(@PathVariable Long id) {
        return memberService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/api/members")
    public ResponseEntity<MemberEntity> createMember(@RequestBody MemberEntity memberEntity) {
        MemberEntity saved = memberService.save(memberEntity);
        URI location = URI.create("/api/members/" + saved.getIdMember());
        return ResponseEntity.created(location).body(saved);
    }

    @PutMapping("/api/members/{id}")
    public ResponseEntity<MemberEntity> updateMember(@PathVariable Long id,
                                                     @RequestBody MemberEntity memberDetails) {
        return memberService.findById(id)
                .map(member -> {
                    member.setLoginId(memberDetails.getLoginId());
                    member.setPass(memberDetails.getPass());
                    member.setName(memberDetails.getName());
                    member.setEmail(memberDetails.getEmail());
                    member.setRole(memberDetails.getRole());
                    member.setStatus(memberDetails.getStatus());
                    member.setEmailVerified(memberDetails.getEmailVerified());
                    member.setFailCount(memberDetails.getFailCount());
                    member.setLastLogin(memberDetails.getLastLogin());
                    member.setUpdatedAt(memberDetails.getUpdatedAt());
                    member.setDeletedAt(memberDetails.getDeletedAt());
                    return ResponseEntity.ok(memberService.save(member));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/api/members/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
        memberService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
