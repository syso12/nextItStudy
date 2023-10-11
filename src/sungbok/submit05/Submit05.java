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

        // 4번 빈칸이 존재하는 트리 만들기
        makeTriangle(4);
        makeTriangle(5);
        makeTriangle(12);

        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********


    }// main메소드 끝

    public static void makeTriangle(int floor){

        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********
        // i=0, 빈칸은 3개 별은 1개
        // i=1, 빈칸은 2개 별1개, 빈칸1개 별1개
        // i=2, 빈칸은 1개 별1개, 빈칸3개 별1개
        // i=3, 빈칸은 0개 별7개



        //      *
        //     * *
        //    *   *
        //   *     *
        //  *       *
        // ***********
        // i=0, 빈칸은 4개 별은 1개
        // i=1, 빈칸은 3개 별1개, 빈칸1개 별1개
        // i=2, 빈칸은 2개 별1개, 빈칸3개 별1개
        // i=3, 빈칸은 1개 별1개, 빈칸5개 별1개
        // i=4, 빈칸은 0개 별9개

        for(int i = 0; i < floor; i++){
            String leftBlank = "";
            for(int k = 0; k < floor-1-i; k++){
                leftBlank += " ";
            }
            if(i == 0){
                // 맨 위층
                System.out.println(leftBlank + "*");
            }else if(i == floor){
                // 맨 밑층
                String star = "";
                for(int s = 0; s < (floor*2)-1; s++){
                    star += "*";
                }
                System.out.println(star);
            }else{
                // 중간층
                String innerBlank = "";
                for(int b = 0; b < (i*2)-1; b++){
                    innerBlank += " ";
                }
                System.out.println(leftBlank + "*" + innerBlank + "*");
            }
        }




    } // main 끝

    // a = ? , b = ? a + b 합친 값을 리턴해주는 메소드를 만들어보자;
    // ex awe = 10; , asd = 20;







    public static String makeBinary (int num){
        // 핵심은 문자열 나머지값을 빈 문자열안에 넣는다
        String resultt = "";
        String temp = "";

        // num이 23일때

        resultt+= num % 2;// 1

        num /= 2; // 11

        resultt+= num % 2; // 1

        num /= 2; // 5

        resultt+= num % 2; // 1

        num /= 2; // 2

        resultt+= num % 2; // 0

        num /= 2; // 1


//        while(num > 0){
//            num = num / 2;
//            if(num % 2 == 1){
//                resultt = num % 2+resultt;
//            } else {
//                resultt = 0+resultt;
//            }
//        }


        return resultt;
    }
    public static String reverseStr (String result){
        String reverse = "";
        for(int i = result.length(); i >= 1; i--) {
            reverse+= result.substring(i-1,i);
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
