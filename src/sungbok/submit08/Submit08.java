package sungbok.submit08;

import java.util.*;

public class Submit08 {
    public static void main(String[] args) {
        // 1번문제 ArrayList와 HashSet을 이용해서 makeLotto를 만드시오
        // 먼저 빈 리스트를 HashSet을 하나 만들고
        // While문 내에서 빈 HashSet 랜덤 로또 번호를 HashSet 사이즈가
        // 6개 될때까지 담는다
        // 이후 HashSet을 ArrayList로 변환하고
        // 오름차순으로 정렬하여 리턴

        ArrayList<Integer> myLotto = makeLotto();
        System.out.println(myLotto);

        // 2번
        // infoMap의 Key는 사용자의 아이디,
        // Value는 사용자의 비밀번호라고 했을 때
        // 아래와 같이 데이터를 추가해주세요.

        HashMap<String, String> infoMap = new HashMap<>();

        infoMap.put("a001", "1234a");
        infoMap.put("b001", "1234b");
        infoMap.put("c001", "1234c");
        infoMap.put("d001", "1234d");
        infoMap.put("e001", "1234e");

        // 기능 스캐너 객체 생성
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("아이디를 입력해주세요");
            System.out.print(">>> ");

            // 입력받은 문자를 id에 담는다
            String id = scan.nextLine();

            System.out.println("비밀번호를 입력해주세요");
            System.out.print(">>> ");
            // 입력받은 문자를pw에 담는다.
            String pw = scan.nextLine();

            // TODO 로그인 성공
            // 만약에 infoMap에 입력받은(id)key값이 담겨있으면
            if(infoMap.containsKey(id)){
                // 비밀번호가 맞는지 체크
                // 만약에 infoMap에 있는 키(id)값에value 가져와서 value(pw)값과 일치하는지 봄
                if(infoMap.get(id).equals(pw)){
                    System.out.println("로그인 성공");
                    break;
                    // infoMap에 있는 키(id)값에value 가져와서 체크했는데 pw와 일치하지 않다면
                    // 입력받은 value(pw)가 맞지않다면 sout 뱉음
                }else {
                    // TODO 맞지않는 비밀번호
                    System.out.println("비밀번호가 맞지 않습니다.");
                }
                // 입력한id값을 infoMap에 key값으로 포함하고 있지 않다면
                // sout뱉는다.
            } else {
                // TODO 존재하지않는 아이디
                System.out.println("아이디가 존재하지않습니다");
            }






            // infoMap에 입력받은 값이 key가 없는경우


            // infoMap에 입력받은 값이 value가 없는경우


        }
    } // 메인 끝




    public static ArrayList<Integer> makeLotto() {
        // 빈 hashSet 리스트 생성
        int lotto = 0;
        HashSet<Integer> randnum = new HashSet<>();
        // Iterator<Integer> rand = randnum.iterator(); // while문의 중복을 제거해줄때 사용
        // 말도안되는 엉터리;;;
//        while (rand.hasNext()){
//            int num = (int)(Math.random() * 45) + 1;
//            randnum.addAll(num);
//        }if(randnum.contains() == num)
        // 두번째 안됨

        while (randnum.size() < 6) { // 조건에 만족할때까지 반복한다 조건은(randnum의 사이즈가 6보다 크지않을때까지)
            // 1부터 45까지의 랜덤 숫자들을 lotto에 담는다.
            lotto = (int)((Math.random() * 45) + 1);
            // lotto에 담은숫자를 randnum에 추가한다.
            randnum.add(lotto) ;
        }
        // randnum이라는 hashSet에 사이즈가 6자리만큼 랜덤숫자(lotto)를 담았다
        // hashset은 중복을 허용하지않기 때문에
        // 중복제거를 할필요가없다.

        // binList라는 int형 ArrayList를 새로 생성한다.
        ArrayList<Integer> binList = new ArrayList<>();
        // binList에 randnum이라는 이름을 가진 hashSet에 담는다.
        binList.addAll(randnum);

        // 정렬한다 오름차순으로 binList를
        // .sort()
        // Collections.sort(intList);
        Collections.sort(binList);
        return binList;
    }









}
