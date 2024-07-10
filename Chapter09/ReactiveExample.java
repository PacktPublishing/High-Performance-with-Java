import reactor.core.publisher.Flux;

public class ReactiveExample {

    public static void main(String[] args) {
        Flux<String> messageFlux = Flux.just("Hello", "Reactive", "World", "with", "Java")
                .map(String::toUpperCase) // Convert each string to uppercase
                .filter(s -> s.length() > 4); // Only keep strings longer than 4 characters

        messageFlux.subscribe(System.out::println); // Subscribe and print each element of the flux
    }
}
