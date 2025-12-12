package com.lms.seaton.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
/*
    Json 생성자 클래스입니다.
    toJson -> 객체를 Json 형태로 반환 시켜주는 메서드입니다.
    formJson -> json을 어떤 클래스로든 변환 시켜주는 메서드입니다.
*/
public class UtilJson {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    // 어떤 객체든 Json으로 변환 시켜서 반환하는 메서드
    public static String toJson(Object object) {
        return gson.toJson(object);
        // 사용 예시
//        MemberDTO member = new MemberDTO(); // 회원 데이터가 있는 멤버 인스턴스가 있다고 가정
//        System.out.println(UtilJson.toJson(member)); // 회원의 정보를 Json 형태로 출력시켜 줌
        /*
        {   출력 예시
            "name" : "홍길동",
            "phone" : "010-1234-5678",
            ....
        }
        */
    }
    
    // Json 문자열을 어떤 형태로든(객체 타입)변환 시켜서 반환하는 메서드
    public static <T> T fromJson(String json, Class<T> classOft) {
        try {
            return gson.fromJson(json, classOft);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            System.out.println("Json 형식이 맞지 않습니다");
            return null;
        }
        // 사용 예시
//        String jsonResponse = "{ 'title': '자바의 정석', 'author': '남궁성' }";
//
//        BookDTO book = JsonUtil.fromJson(jsonResponse, BookDTO.class);
//
//        System.out.println(book.getTitle()); // 자바의 정석
    }
}
