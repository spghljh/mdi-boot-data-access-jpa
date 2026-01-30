package kr.co.mdi.member.service;

import kr.co.mdi.member.entity.MemberEntity;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    List<MemberEntity> findAll();

    Optional<MemberEntity> findById(Long id);

    MemberEntity save(MemberEntity memberEntity);

    void delete(Long id);
}
