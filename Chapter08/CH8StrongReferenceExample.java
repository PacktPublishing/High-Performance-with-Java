public class CH8StrongReferenceExample {
    public static void main(String[] args) {
        SampleCorgiObject sampleCorgiObject = new SampleCorgiObject();
        
        System.out.println(sampleCorgiObject);
    }
    
    static class SampleCorgiObject {
        @Override
        public String toString() {
            return "This is a SampleCorigObject instance.";
        }
    }
}
