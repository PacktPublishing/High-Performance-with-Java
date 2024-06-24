public class Main {
    public static void main(String[] args) {
        // Creating two objects
        SampleClass object1 = new SampleClass("Object 1");
        SampleClass object2 = new SampleClass("Object 2");

        // Making the objects reference each other
        object1.reference = object2;
        object2.reference = object1;

        // References are nullified
        object1 = null;
        object2 = null;

        System.gc();
    }
}
class SampleClass {
    String name;
    SampleClass reference;

    public SampleClass(String name) {
        this.name = name;
    }

    // Overriding finalize() method to see the garbage collection process
    //@Override
    //protected void finalize() throws Throwable {
    //    System.out.println(name + " is being garbage collected!");
    //    super.finalize();
    //}
}