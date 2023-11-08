package ch16_network.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 연결된 소켓 객체의 OutputStream 에다
// 문구를 작성하여 보내는 클래스
// 3번
public class SendThread extends Thread{

    private Socket soc;  /* 연결된 소켓 객체를 담을 그릇 */

    public SendThread(Socket soc){
        this.soc = soc;
    }

    @Override
    public void run() {
        // 멀티쓰레드로 일을 시키면 실행되는 영역
        // 콘솔창에 키보드로 입력한 내용을 소켓의
        // OutputStream에 입력후 보내기
        Scanner scan = new Scanner(System.in);


        // 연결된 소켓의 outputStream 가져오기
        try {
            // outputStreamWriter은 utf-8설정을 위해서 작성한것
            PrintWriter writer = new PrintWriter((soc.getOutputStream()));
//            PrintWriter writer = new PrintWriter(new OutputStreamWriter(soc.getOutputStream(),"UTF-8"));

            System.out.println("닉네임 입력: ");
            String name = scan.nextLine();
            writer.println(name + "니미 입장하였습니다 ");
//            writer.flush(); // 전송

            while (true){
                System.out.print(">>> ");
                String msg = scan.nextLine();
                System.out.println(msg);

                // 채팅창에 exit를 입력시 채팅 종료(나가기) -> 소켓 통신 종료 -> 소켓 객체 close() 해주기
                if(msg.equals("exit")){
                    writer.println("exit");
                    writer.flush(); // 전송
//                    soc.close();
                    break;
                }

                // outputStream에 텍스트 작성
                writer.println(name + ": " + msg);    // msg 문자열 뒤에 자동으로 개행문자 (\n)를 붙여서 보낸다.
                // 작성된 텍스트 전송
                writer.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(soc != null){try {soc.close();} catch (IOException e) {}}
        }
    }
}
