package make.lambdaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {


    private static List filter(List list, Predicate condition) {
        List result = new ArrayList();
        for (Object li : list) {
            if (condition.test(li)) {
                result.add(li);
            }
        }
        return result;
    }


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
        Thread t1 = new Thread(() -> {
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

        // lambda表达式代替匿名内部类
        // lambdaSimp();

        List lan = Arrays.asList("array", "list", "map", "set");
        List re = filter(lan, (str) -> ((String)str).length() > 3);
        System.out.println(re);
    }
}
