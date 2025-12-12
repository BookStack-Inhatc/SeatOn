package com.lms.seaton.util;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// 데이터베이스 연결 클래스
public class DBConnection {
    // .env 파일을 업로드합니다. (설정 없으면 null 반환)
    private static final Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
    
    // .env에서 키값으로 데이터를 획득.
    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASS = dotenv.get("DB_PASSWORD");
    
    // 데이터베이스 커넥션 객체 생성 메서드입니다.
    // 필요한 서비스 로직에서 호출하여 사용하시면 됩니다.
    public static Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("[DB CONNECTION LOG]: DB Connection Complete!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("[DB CONNECTION LOG]: DB Connection Failed - Check .env File");
        }
        return con;
    }
}
