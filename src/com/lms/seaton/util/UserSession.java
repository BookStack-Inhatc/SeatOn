package com.lms.seaton.util;

import com.lms.seaton.dto.MemberDTO;
// 로그인 한 사용자의 정보를 저장하는 세션 클래스
public class UserSession {
    private static UserSession instance;    // 사용자 한 명당 하나의 세션만 할당하기 위한 싱글톤
    private MemberDTO member;               // 회원 객체
    private UserSession() {}                // 외부에서 세션 생성자에 접근 불허가
    
    // 세션 객체 반환
    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }
    
    // 로그인 한 회원 정보 세션에 저장
    public void setMember(MemberDTO member) {
        this.member = member;
    }
    
    // 세션에 저장 되어 있는 회원 정보 반환
    public MemberDTO getMember() {
        return member;
    }
    
    // 로그 아웃
    public void clear() {
        this.member = null;
    }
}
