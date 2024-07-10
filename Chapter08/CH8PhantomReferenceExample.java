import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class CH8PhantomReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        // Creating a ReferenceQueue
        ReferenceQueue<VeryImportantResource> queue = new ReferenceQueue<>();

        // Creating an object of type VeryImportantResource
        VeryImportantResource resource = new VeryImportantResource();

        // Wrapping ImportantResource with a PhantomReference
        PhantomReference<VeryImportantResource> phantomResource = new PhantomReference<>(resource, queue);

        // Ensure the reference to ImportantResource is only through the PhantomReference
        resource = null;

        // Encourage garbage collection
        System.gc();

        // Wait for the garbage collector to finalize and enqueue the phantom reference
        // Note: This may need to be done in a separate thread in real-world applications
        while (true) {
            if (queue.poll() != null) {
                System.out.println("ImportantResource has been garbage collected and its phantom reference is enqueued");
                break;
            }
        }
    }
}

class VeryImportantResource {
    // Constructor, finalizer, and other methods

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing VeryImportantResource");
        super.finalize();
    }
}
