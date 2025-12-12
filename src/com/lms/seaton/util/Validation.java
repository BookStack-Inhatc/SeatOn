package com.lms.seaton.util;

import java.util.regex.Pattern;
// 정규식 검사 클래스
public class Validation {
    private static final String REGEX_NAME = "^[가-힣a-zA-Z\\s]+$";      // 이름 : 한글, 영문(대소문자), 공백(\s)만 허용 -> ex) '김시현', '박태호', 'Harry Potter'
    private static final String REGEX_PHONE = "^010-\\d{4}-\\d{4}$";    // 전화번호 : 010으로 시작하여 중간 4자리, 끝 4자리만 허용
    private static final String REGEX_PW = "^[a-zA-Z0-9!@_#%]{8,14}$";  // 비밀번호 : 영문(대소), 숫자, 특수문자(!@_#%)만 허용하며 길이는 8~14자
    
    // 정규식 검사 - 이름
    public static boolean isValidName(String name) {
        return name != null && Pattern.matches(REGEX_NAME, name);
    }
    // 정규식 검사 - 전화번호
    public static boolean isValidPhone(String phone) {
        return phone != null && Pattern.matches(REGEX_PHONE, phone);
    }
    // 정규식 검사 - 비밀번호
    public static boolean isValidPasswd(String passwd) {
        return passwd != null && Pattern.matches(REGEX_PW, passwd);
    }
}
