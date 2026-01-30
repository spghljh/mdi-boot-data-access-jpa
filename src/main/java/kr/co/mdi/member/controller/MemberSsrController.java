package kr.co.mdi.member.controller;

import kr.co.mdi.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberSsrController {

    private final MemberService memberService;

    public MemberSsrController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/ssr/members")
    public String memberList(Model model) {
        model.addAttribute("memberList", memberService.findAll());
        return "/ssr/ssr-member-total";
    }
}
