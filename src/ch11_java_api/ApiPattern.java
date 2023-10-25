package ch11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {
    public static void main(String[] args) {
        // 정규표현식(Regular Expression)
        // 특정한 규칙을 가진 문자열의 집합을 표현하기위해 쓰는 형식

        // 숫자만 존재하는지 검증(유효성 검사 : Validation)
        String example = "1234312";
        String regex = "^[0-9]+$";

        // 검사 결과에 대한 결과를 true | false 리턴
        // (검사 정규표현식, 검사대상)
        boolean result = Pattern.matches(regex, example);
        System.out.println(example + " 의 검증" + regex + " 결과 " + result);

        // String 클래스 내부에 Pattern.matches()를 적용한 matches 메소드가 만들어져 있음
        System.out.println(example.matches(regex));

        // 알파벳만 존재하는지 검증
        example = "Jeong Chanung";
        regex = "^[a-zA-Z\\s]+$"; // \\s 는 띄어쓰기 문자를 의미
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));
        // 띄어쓰기가 있으면 때문에 false가 난다. -> 띄어쓰기를 의미하는 \\s를 사용해야 true가 나온다.

        // 한글만 존재하는지 검증
        example = "정찬웅";
        regex = "^[가-힣]+$";
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));

        // 아이디 패턴
        // 영어와 숫자로만 구성
        // 아이디는 7글자 이상 12글자 이하여야 한다.
        // +가 아닌 {}안에 조건을 채운다.
        example = "akow283";
        regex = "^[a-zA-Z0-9]{7,12}$";
        regex = "^\\w{7,12}$"; // 위의 표현식에 대한 축약형
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));

        // 비밀번호 패턴
        // 영어와 숫자 + 특수문자
        example = "akow283!";
        // regex = "^[a-zA-Z0-9]{!@#$%^&*+}+$"; 안되네;;;
        regex = "^[\\w!@#$%^&*]+$";
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));

        // 영어 소문자, 대문자, 숫자, 특수문자 1개이상
        // 8 ~ 16글자 사이여야 한다.
        // .은 아무문자를 의미함(문자 숫자 특수문자 다 포함)
        example = "Akow284!";
        regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&]){8,16}$";
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));

        // PIN 비밀번호 설정시
        // 6자리 숫자중에 동일한 숫자 3개 이상 금지
        example = "233346";
        regex = "^.*(\\d)\\1\\1.*$";
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));

        if (!example.matches(regex)) {
            regex = "^[0-9]{6}$";   // 6자리 숫자인지 체크
            if (example.matches(regex)) {
                System.out.println("동일한 숫자가 반복되지않고 6자리임!!");
            }
        }
        // 이메일 형식 체크
        example = "akow283@gmail.com";
        regex = "^[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+$";
        System.out.println(example + " 의 검증" + regex + " 결과 " + example.matches(regex));

    }
}
