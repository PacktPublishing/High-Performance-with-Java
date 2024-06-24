public class CorgiStringIntern {
    public static void main(String[] args) {
        // Define two string literals
        String s1 = "corgi";
        String s2 = "corgi";

        // Create a new string object using constructor and intern it
        String s3 = new String("corgi").intern();

        // Compare references
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2)); // true
        System.out.println("Are s1 and s3 the same object? " + (s1 == s3)); // true
    }
}
