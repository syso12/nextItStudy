package Master;

public class practice {
    public static void main(String[] args) {
        // 2번
        // 각 자릿수 값 더하기
        // 정수형을 문자열로 변환후
        // 문자열을 subString 사용해서 하나씩 분리후
        // 각 자릿수를 정수로 바꾸고
        int example = 278;
        String num = "" + example;
        // int a =Integer.parseInt(num.substring(0,1));
        for(int i = 0; i < num.length(); i++) {
            int a = Integer.parseInt(num.substring(i,i+1));
            System.out.println();
        }



    }
}
