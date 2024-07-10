public class ConcatenationAlternativeOne {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder myStringBuilder = new StringBuilder();

        // Append strings
        myStringBuilder.append("Java");
        myStringBuilder.append(" is");
        myStringBuilder.append(" my");
        myStringBuilder.append(" dog's");
        myStringBuilder.append(" name.");

        // Convert StringBuilder to String
        String result = myStringBuilder.toString();

        // Print the result
        System.out.println(result);
    }
}

