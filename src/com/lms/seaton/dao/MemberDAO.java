/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lms.seaton.dao;
import com.lms.seaton.dto.MemberDTO;
import io.github.cdimascio.dotenv.Dotenv; 
import java.sql.*;
/**
 *
 * @author rlatl
 */
public class MemberDAO {
    private String url;
    private String user;
    private String password;
    
    public MemberDAO() {
        try {
            // 1. .env 파일에서 DB 정보 불러오기 (라이브러리 활용 권장 방식)
            Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
            this.url = dotenv.get("DB_URL");       // .env 파일의 변수명과 일치해야 함
            this.user = dotenv.get("DB_USER");
            this.password = dotenv.get("DB_PASSWORD");
            
            // 만약 .env 설정이 안 되어 있다면 아래 주석을 풀고 직접 입력하세요
            // this.url = "jdbc:mysql://localhost:3306/seaton_db?serverTimezone=UTC";
            // this.user = "root";
            // this.password = "1234";

        } catch (Exception e) {
            System.out.println("DB 설정 로드 실패: " + e.getMessage());
        }
    }

    // 전화번호 중복 확인
    public boolean isPhoneExist(String phone) {
        String sql = "SELECT count(*) FROM MEMBERS WHERE phone = ?";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, phone);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 회원 정보 저장
    public int insertMember(MemberDTO member) {
        // status와 registered_date는 DB 기본값(Default)을 따르거나 여기서 직접 지정
        String sql = "INSERT INTO MEMBERS (phone, password, name, registered_date, status) VALUES (?, ?, ?, NOW(), 'active')";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, member.getPhone());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getName());
            
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public MemberDTO getMemberByPhone(String phone) {
        String sql = "SELECT * FROM MEMBERS WHERE phone = ?";
        MemberDTO member = null;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, phone);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    member = new MemberDTO();
                    member.setMemberId(rs.getLong("member_id"));
                    member.setPhone(rs.getString("phone"));
                    member.setPassword(rs.getString("password")); // 암호화된 비번
                    member.setName(rs.getString("name"));
                    member.setRegisteredDate(rs.getTimestamp("registered_date"));
                    member.setStatus(rs.getString("status"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member; // 회원이 없으면 null 반환
    }
}
