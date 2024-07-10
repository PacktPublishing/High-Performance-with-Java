import java.util.function.Supplier;

public class LazyInitializationExample {
    private Supplier<String> lazyString = () -> {
        // Simulate complex string generation or data retrieval
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java is an incredibly ");
        stringBuilder.append("flexible programming language ");
        stringBuilder.append("that is used in a wide range of applications. ");
        stringBuilder.append("This is a complex string ");
        stringBuilder.append("that was lazily initialized.");
        return stringBuilder.toString();
    };

    public String getLazyString() {
        return lazyString.get();
    }

    public static void main(String[] args) {
        LazyInitializationExample example = new LazyInitializationExample();
        
        // Accessing the lazy-initialized string
        String lazyString = example.getLazyString();
        System.out.println("Lazy initialized string: " + lazyString);
    }
}

