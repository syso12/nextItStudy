package sungbok.submit01;

public class Submit01 {

    public static void main(String[] args) {
        // 1번 홍길동의 이름과 나이 키 연락처 메일을 콘솔에 출력하시오

        String name = "홍길동";
        int age = 26;
        float height = 177.9F;
        String phone = "01073987332";
        String email = "akow283@gmail.com";

        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("키 :" + height);
        System.out.println("연락처 :" + phone);
        System.out.println("이메일 :" + email);
        System.out.println("\n================================\n");
        // 2번 너 구 리 제거 하기

        String enigma = "너오구늘리뭐너먹구지리";

        String nu = enigma.replace("너", "");
        System.out.println("1차 암호 해독 [너 제거]: " + nu);
        String gu = nu.replace("구", "");
        System.out.println("2차 암호 해독 [구 제거]: " + gu);
        String ri = gu.replace("리","");
        System.out.println("2차 암호 해독 [ 제거]: " + ri);
        System.out.println("해독완료!! ->" + ri);
        System.out.println(ri);

        System.out.println("\n=======================================\n");

        //3번 문자열 변수 littlePrince 로부터 substring을 이용하여 "허영심 뒤에 가려진 따뜻한 마음" 문자열만 잘라서 출력하시오.

        String littlePrince = "나는 그때 아무것도 이해하지 못했어. " +
                "꽃의 말이 아닌 행동을 보고 판단했어야 했어. 내게 향기를 전해주고 즐거움을 주었는데, " +
                "그 꽃을 떠나지 말았어야 했어. 그 허영심 뒤에 가려진 따뜻한 마음을 보았어야 했는데, " +
                "그때 난 꽃을 제대로 사랑하기에는 아직 어렸던 거야.";

        String target = "허영심 뒤에 가려진 따뜻한 마음";

        System.out.println(target.length());
        System.out.println(littlePrince.indexOf(target));
        System.out.println(littlePrince.substring(90,107));


    }
}
