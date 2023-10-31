package ch13_thread;

// 1. Thread를 상속시킴
public class ExThread extends Thread{

    private int num;

    public ExThread(int num){ // 기본 생성자
        this.num = num;
    }
    // 2. Thread의 run 메소드를 Override 한다.
    // 멀티스레드로 던질 일에 해당

    @Override // 변수명작성후 컨트롤 + 스페이스를 누르면 Override를 만들어준다.
    public void run() {
        for(int i = num; i <= num+5; i++){
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
