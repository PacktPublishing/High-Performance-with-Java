import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoodRegExExample {
    public static void main(String[] args) {
        // Email pattern regex
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Sample email addresses
        String[] emails = {
            "java@example.com",
            "muzz.acruise@gmail.com",
            "invalid-email",
            "bougie@.com",
            "@example.com",
            "brenda@domain.",
            "edward@domain.co",
            "user@example"
        };

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Validate each email address
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is an invalid email address.");
            }
        }
    }
}
