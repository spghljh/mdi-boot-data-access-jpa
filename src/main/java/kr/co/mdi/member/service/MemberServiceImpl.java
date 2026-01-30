package kr.co.mdi.member.service;

import kr.co.mdi.member.entity.MemberEntity;
import kr.co.mdi.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Optional<MemberEntity> findById(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public MemberEntity save(MemberEntity memberEntity) {
        return memberRepository.save(memberEntity);
    }

    @Override
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}
