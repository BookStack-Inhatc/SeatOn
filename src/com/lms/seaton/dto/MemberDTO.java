/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lms.seaton.dto;
import java.sql.Timestamp; // 날짜 시간 저장용
import lombok.Data; // 롬복 라이브러리가 있다면 @Data 사용, 없다면 Getter/Setter 직접 생성

@Data
/**
 *
 * @author rlatl
 */
public class MemberDTO {
    private long memberId;      // DB: member_id (BIGINT)
    private String phone;       // DB: phone (VARCHAR)
    private String password;    // DB: password (VARCHAR)
    private String name;        // DB: name (VARCHAR)
    private Timestamp registeredDate; // DB: registered_date (DATETIME)
    private String status;      // DB: status (ENUM)
}
