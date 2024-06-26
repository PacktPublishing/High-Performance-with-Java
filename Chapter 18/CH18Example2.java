import java.util.stream.IntStream;

public class CH18Example2 {
    public static void main(String[] args) {
        CH18Example2 example = new CH18Example2();
        example.processData();
    }

    public void processData() {
        int sum = IntStream.range(0, 1000000).sum();
        System.out.println("Sum: " + sum);
    }
}

