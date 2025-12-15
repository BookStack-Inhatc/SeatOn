/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lms.seaton.service;
import com.lms.seaton.dao.MemberDAO;
import com.lms.seaton.dto.MemberDTO;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author rlatl
 */
public class MemberService {
    private MemberDAO memberDAO = new MemberDAO();

    public boolean checkDuplicatePhone(String phone) {
        return memberDAO.isPhoneExist(phone);
    }

    public boolean registerMember(String name, String phone, String rawPassword) {
        // 1. 암호화: "1234" -> "$2a$10$R9h/..." (복호화 불가능한 안전한 문자열)
        String encryptedPassword = BCrypt.hashpw(rawPassword, BCrypt.gensalt());

        // 2. DTO 생성 (Lombok 덕분에 코드가 깔끔)
        MemberDTO newMember = new MemberDTO();
        newMember.setName(name);
        newMember.setPhone(phone);
        newMember.setPassword(encryptedPassword);

        // 3. 저장 요청
        int result = memberDAO.insertMember(newMember);
        
        return result > 0;
    }
    public MemberDTO login(String phone, String inputPassword) {
        // 1. DB에서 회원 정보 가져오기
        MemberDTO member = memberDAO.getMemberByPhone(phone);

        // 2. 회원이 없으면 실패 (null)
        if (member == null) {
            return null;
        }

        // 3. 비밀번호 검사 (BCrypt 기능 사용)
        // inputPassword: 사용자가 입력한 비번 (예: 1234)
        // member.getPassword(): DB에 저장된 암호화된 비번
        if (BCrypt.checkpw(inputPassword, member.getPassword())) {
            return member; // 로그인 성공! 회원 정보 반환
        }

        // 4. 비밀번호 틀림
        return null;
    }
}
