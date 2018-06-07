package make.useUtils;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseUtil {

    public static void main(String[] args) {
        // Joiner
        List arr = Arrays.asList("1", "2", "3");
        String j = Joiner.on(",").skipNulls().join(arr);
        System.out.println(j);

        // Lists
        List a = Lists.newCopyOnWriteArrayList(arr);
        System.out.println(a);

        // Map.Entry
        Map<String, Object> m = new HashMap<>();
        m.put("a", 1);
        for (Map.Entry entry: m.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
