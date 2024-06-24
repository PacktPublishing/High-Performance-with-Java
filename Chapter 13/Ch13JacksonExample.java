import com.fasterxml.jackson.databind.ObjectMapper;

public class Ch13JacksonExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Example of a Plan Old Java Object (POJO)
        class User {
            public String name;
            public int age;

            // Constructors, getters, and setters have been omitted for brevity
        }

        // Serialize Java object to JSON
        User user = new User();
        user.name = "Neo Anderson";
        user.age = 24;
        String jsonOutput = mapper.writeValueAsString(user);
        System.out.println("Serialized JSON: " + jsonOutput);

        // Deserialize JSON to Java object
        String jsonInput = "{\"name\":\"Neo Anderson\",\"age\":24}";
        User userDeserialized = mapper.readValue(jsonInput, User.class);
        System.out.println("Deserialized user: " + userDeserialized.name);
    }
}
