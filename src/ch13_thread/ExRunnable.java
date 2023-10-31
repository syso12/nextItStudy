package ch13_thread;

// 1. Runnable 인터페이스 구현
public class ExRunnable implements Runnable {

    private int num;

    public ExRunnable(int num) {
        this.num = num;
    }


    @Override // 변수명작성후 컨트롤 + 스페이스를 누르면 Override를 만들어준다.
    public void run() {
        for (int i = num; i <= num + 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

