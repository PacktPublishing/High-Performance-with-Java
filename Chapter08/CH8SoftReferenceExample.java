import java.lang.ref.SoftReference;

public class CH8SoftReferenceExample {
    public static void main(String[] args) {
        // Creating a new object
        MyBougieObject myBougieObject = new MyBougieObject("Cached Object");

        // Wrapping the object in a soft reference
        SoftReference<MyBougieObject> softReference = new SoftReference<>(myBougieObject);

        // The original reference is nullified, making the MyBougieObject instance only softly reachable
        myBougieObject = null;

        // Attempt to retrieve the object from the soft reference
        MyBougieObject retrievedObject = softReference.get();
        if (retrievedObject != null) {
            System.out.println("Object retrieved from soft reference: " + retrievedObject);
        } else {
            System.out.println("The Object has been garbage collected by the JVM.");
        }

        // Simulate memory pressure
        System.gc();

        retrievedObject = softReference.get();
        // The result of this retrieval depends on the JVM's current need for memory
        if (retrievedObject != null) {
            System.out.println("Object is still available after requesting GC: " + retrievedObject);
        } else {
            System.out.println("The Object has been garbage collected after requesting GC.");
        }
    }
}

class MyBougieObject {
    private String name;

    public MyBougieObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

