import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ImmutableList;

public class Ch13EclipseCollectionsExample {
    public static void main(String[] args) {
        // Creating an immutable list using Eclipse Collections
        ImmutableList<String> immutableList = Lists.immutable.of("Apple", "Pear", "Cherry", "Lime");

        // Displaying the original list
        System.out.println("Original immutable list: " + immutableList);

        // Adding an item to the list, which returns a new immutable list
        ImmutableList<String> extendedList = immutableList.newWith("Orange");

        // Displaying the new list
        System.out.println("Extended immutable list: " + extendedList);

        // Iterating over the list to print each element
        extendedList.forEach(System.out::println);
    }
}
