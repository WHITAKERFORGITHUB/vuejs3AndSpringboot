package kr.co.wikibook.gallery.member.service;

import kr.co.wikibook.gallery.member.entity.Member;

public interface MemberService {

    // 회원데이터저장
    void save(String name, String loginId, String loginPw);

    // 회원데이터조회
    Member find(String loginId, String loginPw);
}
