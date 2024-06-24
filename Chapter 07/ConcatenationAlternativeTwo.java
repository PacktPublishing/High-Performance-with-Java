public class ConcatenationAlternativeTwo {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer myStringBuffer = new StringBuffer();

        // Append strings
        myStringBuffer.append("Java");
        myStringBuffer.append(" is");
        myStringBuffer.append(" my");
        myStringBuffer.append(" dog's");
        myStringBuffer.append(" name.");

        // Convert StringBuffer to String
        String result = myStringBuffer.toString();

        // Print the result
        System.out.println(result);
    }
}

