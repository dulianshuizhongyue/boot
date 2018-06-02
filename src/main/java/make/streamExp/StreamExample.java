package make.streamExp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void streamDemo() {

        List<String> language = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "Python", "C++", "Java");

        System.out.println("show: language");
        language.stream().forEach(System.out::println);
        System.out.println();

        List<String> o1 = language.stream()
                .filter(x -> x.endsWith("a"))
                .filter(x -> x.startsWith("J"))
                .map(String::toUpperCase)  // 方法引用时： 参数类型匹配, 不改变参数的情况下使用
                // .map(x -> x.toUpperCase())  //效果同方法引用
                .distinct()
                .collect(Collectors.toList());

        System.out.println("stream filter: " + o1);


        // compute some result in array
        List<Integer> intArr = Arrays.asList(1, 2, 3, 4, 5, 6);
        long count = intArr.stream().mapToInt((x) -> x).summaryStatistics().getCount();
        int max = intArr.stream().mapToInt((x) -> x).summaryStatistics().getMax();
        int min = intArr.stream().mapToInt((x) -> x).summaryStatistics().getMin();

        Integer sum = intArr.stream().mapToInt(x -> x).sum();
        Double avg = intArr.stream().mapToInt(x -> x).average().getAsDouble();

        //also has average, sum function etc.
        System.out.println(intArr);
        System.out.print("list count: " + count);
        System.out.print("; max: " + max);
        System.out.print("; min: " + min);
        System.out.print("; sum: " + sum);
        System.out.println("; avg: " + avg);


        List<Integer> mon = Arrays.asList(1, 2, 3, 4, 5);
        Integer mon_sum = mon.stream().map(x->x*100).reduce((x, y)-> x+y).get();
        System.out.println("[1 - 5] *100 reduce sum: " + mon_sum);

    }

    public static void main(String[] args) {
        streamDemo();
    }
}
