package sungbok.submit05;

public class Submit05 {
    public static void main(String[] args) {
        // 1번 트리 만들기
        makeTree(5);
        makeTree(7);


        // 2번 로꾸꺼 메소드 만들어서 꺼꾸로 만들기
        String example = "로꾸꺼 로꾸꺼";
        String result = reverseStr(example);
        System.out.println(result);

        // 3번 십진수를 이진수로 만들자
        String myBinaryStr = makeBinary(23);
        System.out.println(myBinaryStr);

    }// main메소드 끝

    public static String makeBinary(int num){
        String resultt = "";

        while(num > 0){
            num = num / 2;
            if(num % 2 == 1){
                resultt = num % 2+resultt;
            } else {
                resultt = 0+resultt;
            }
        }


        return resultt;
    }
    public static String reverseStr (String result){
//        String example = "로꾸꺼 로꾸꺼";
        for(int i = result.length(); i >= 1; i--) {
            String result1 = result.substring(i-1,i);
            //System.out.print(result);
        }


        return result;
    }

    public static int makeTree(int num){
        // 트리는
        //     *        i가 0일때 공백은 왼쪽num-1 4칸  * 1개
        //    ***       i가 1일때 공백은 왼쪽num-2 3칸  * 3개
        //   *****      i가 2일때 공백은 왼쪽num-3 2칸  * 5개
        //  *******     i가 3일때 공백은 왼쪽num-4 1칸  * 7개
        // *********    i가 4일때 공백은 왼쪽num-num 0칸 * 9개

        // num번 만큼 반복
        // i=0일때 공백은 num-1칸 *은 1개
        // i=1일때 공백 3칸 *은 3개
        // i=2일때 공백 2칸 *은 5개 (i에 2를 곱한후 1을 더함)
        // 갯수만 늘어나면 되기 때문에 우측의 공백은 생각할 필요가 없다
        for(int i = 0; i < num; i++){           // 반복 횟수 num번 만큼 i가 0이면 공백은 num-1 별은 1개
            String blank = "";
            for(int k = 0; k < (num-1)-i; k++){ // 칸을 띄우는 횟수
                blank += " ";
            }
            String star = "";
            for(int k = 0; k < (i*2)+1; k++){   // 별을 그리는 횟수
                star += "*";
            }
            System.out.println(blank + star);
        }
        return num;
    }


}
