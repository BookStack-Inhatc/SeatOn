package com.lms.seaton.dao;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ReservationDAO {
    
    private String url;
    private String user;
    private String password;

    public ReservationDAO() {
        try {
            // .env 사용시
            Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
            this.url = dotenv.get("DB_URL");
            this.user = dotenv.get("DB_USER");
            this.password = dotenv.get("DB_PASSWORD");
            
            // .env 안되면 아래 주석 풀고 직접 입력
            // this.url = "jdbc:mysql://localhost:3306/seaton_db?serverTimezone=UTC";
            // this.user = "root";
            // this.password = "1234";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 1. 예약하기 (INSERT)
    // type: "좌석", "스터디룸", "사물함"
    public boolean insertReservation(String type, String itemId, long memberId) {
        String tableName = type.equals("사물함") ? "LOCKER_RESERVATIONS" : "SEAT_RESERVATIONS";
        String colName = type.equals("사물함") ? "locker_id" : "seat_id";
        
        // 종료 시간은 일단 4시간 뒤로 설정 (필요시 수정 가능)
        String sql = "INSERT INTO " + tableName + 
                     " (" + colName + ", member_id, start_time, end_time) " +
                     " VALUES (?, ?, NOW(), DATE_ADD(NOW(), INTERVAL 4 HOUR))";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, itemId); // 예: "1", "2"
            pstmt.setLong(2, memberId);
            
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("예약 실패: " + e.getMessage());
            return false;
        }
    }

    // 2. 이미 예약된 번호들 가져오기 (SELECT)
    // type에 따라 예약된 좌석/사물함 번호 리스트를 반환
    public Set<String> getOccupiedIds(String type) {
        Set<String> occupiedIds = new HashSet<>();
        String tableName = type.equals("사물함") ? "LOCKER_RESERVATIONS" : "SEAT_RESERVATIONS";
        String colName = type.equals("사물함") ? "locker_id" : "seat_id";

        // check_out_time이 NULL인 경우만 가져옴 (현재 사용중)
        String sql = "SELECT " + colName + " FROM " + tableName + " WHERE check_out_time IS NULL";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                occupiedIds.add(rs.getString(1)); // "1", "2" 같은 번호 저장
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return occupiedIds;
    }
    public boolean returnItem(String type, String itemId, long memberId) {
        String tableName = type.equals("사물함") ? "LOCKER_RESERVATIONS" : "SEAT_RESERVATIONS";
        String colName = type.equals("사물함") ? "locker_id" : "seat_id";

        // 조건: 해당 번호 + 내 회원ID + 아직 반납 안 된(NULL) 기록만 반납 가능
        String sql = "UPDATE " + tableName + 
                     " SET check_out_time = NOW() " +
                     " WHERE " + colName + " = ? AND member_id = ? AND check_out_time IS NULL";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, itemId);
            pstmt.setLong(2, memberId);
            
            // 업데이트된 줄이 1개 이상이면 성공 (내 자리가 맞다는 뜻)
            return pstmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}