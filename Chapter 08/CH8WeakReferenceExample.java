import java.lang.ref.WeakReference;

public class CH8WeakReferenceExample {
    public static void main(String[] args) {
        // Creating an object of type CacheCorgiObject
        CacheCorgiObject cacheCorgiObject = new CacheCorgiObject();
        // Wrapping CacheCorgiObject with a WeakReference
        WeakReference<CacheCorgiObject> weakCacheCorgiObject = new WeakReference<>(cacheCorgiObject);

        // At this point, the object can be accessed through the weak reference
        System.out.println("Cache corgi object before GC: " + weakCacheCorgiObject.get());

        // Dereference cacheCorgiObject
        cacheCorgiObject = null;

        // Suggesting JVM to perform garbage collection
        System.gc();

        // The object may have been collected at this point if JVM needed memory
        System.out.println("Cache corgi object after GC: " + weakCacheCorgiObject.get());
    }
}

class CacheCorgiObject {
    @Override
    protected void finalize() {
        System.out.println("CacheCorgiObject is being garbage collected");
    }
}
