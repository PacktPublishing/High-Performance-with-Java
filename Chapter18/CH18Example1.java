import java.util.ArrayList;
import java.util.List;

public class CH18Example1 {
    public static void main(String[] args) {
        CH18Example1 example = new CH18Example1();
        example.processData();
    }

    public void processData() {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            data.add(i);
        }

        int sum = 0;
        for (Integer num : data) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
