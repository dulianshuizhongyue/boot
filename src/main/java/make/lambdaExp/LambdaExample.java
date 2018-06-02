package make.lambdaExp;

public class LambdaExample {


    public static void lambdaSimp() {

        // block 1
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("sleep  1000ms start...time: " + i);
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();*/

        // compare with block 1
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("sleep  1000ms start...time: " + i);
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }

    public static void main(String[] args) {

        lambdaSimp();
    }
}
