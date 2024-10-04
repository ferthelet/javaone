import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Compares!");

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(2);

        // sort the list
        // nums.sort(null);
        // nums.sort((a, b) -> a.compareTo(b));
        // nums.sort(Integer::compareTo);
        // nums.sort((a, b) -> {
        //     return a.compareTo(b);
        // });
        // nums.sort(Integer::compareTo);
        Collections.sort(nums);

        System.out.println(nums);

    }
}
