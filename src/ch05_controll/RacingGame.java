package ch05_controll;

public class RacingGame {
    public static void main(String[] args) throws InterruptedException {

        String lane1 = "1. ";
        String lane2 = "2. ";
        String lane3 = "3. ";
        String lane4 = "4. ";

        // 특수문자 🐎 🐫 🐑 🐘
        String car1 = "\uD83D\uDC0E";
        String car2 = "\uD83D\uDC2B";
        String car3 = "\uD83D\uDC11";
        String car4 = "\uD83D\uDC18";

        while (true) {
            // 랜덤 숫자 생성
            // Math.random()은 0~1 사이 소수
            // 6을 곱하면 0~6사이의 소수
            // 형변환(int)을 해야 사용가능
            // int로 바꿔주면 0~5 범위의 정수
            int random = (int)(Math.random() * 6);

            // 각 자동차는 1/6 확률로 한칸 전진
            if(random == 1) {
                lane1 += " ";
            }else if(random == 2) {
                lane2 += " ";
            }else if(random == 3) {
                lane3 += " ";
            } else if (random == 4) {
                lane4 += " ";

            }

            // 콘솔창에 줄바꿈 20번 하도록 해서
            // 기존 내용 안보이도록 하기
            for(int i = 0; i < 20; i++) {
                System.out.println();
            }
            System.out.println(lane1 + car1);
            System.out.println(lane2 + car2);
            System.out.println(lane3 + car3);
            System.out.println(lane4 + car4);

            // 각 lane의 길이가 40이 되면 break 설정
            if(lane1.length() == 40){
                System.out.println("1번승리");
                break;
            }

            if(lane2.length() == 40){
                System.out.println("2번승리");
                break;
            }

            if(lane3.length() == 40){
                System.out.println("3번승리");
                break;
            }

            if(lane4.length() == 40){
                System.out.println("4번승리");
                break;
            }
            // 잠깐 쉬기
            // Thread.sleep(100) : 100밀리초 만큼 쉬게한다.( =0.1초)
            Thread.sleep(50);

        }
    }
}
