import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Compares!");

        // using comparator Collcetions below **
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a % 10 - b % 10;
            }
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(23);
        nums.add(61);
        nums.add(44);
        nums.add(27);

        // sort the list
        // nums.sort(null);
        // nums.sort((a, b) -> a.compareTo(b));
        // nums.sort(Integer::compareTo);
        // nums.sort((a, b) -> {
        //     return a.compareTo(b);
        // });
        // Collections.sort(nums);

        // sort by the last digit
        // Collections.sort(nums, (a, b) -> {
        //     return a % 10 - b % 10;
        // });

        // using comparator above **
        Collections.sort(nums, com);

        System.out.println(nums);

    }
}
