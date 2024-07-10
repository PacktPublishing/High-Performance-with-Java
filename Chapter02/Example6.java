public class Example6 {
    public static void main(String[] args) {
        // Declare and initialize an array of strings to store the names of planets
        String[] planets = {
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune"
        };

        // Access and print the elements of the array
        System.out.println("Planets in our solar system:");
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]);
        }

        // Calculate and print the number of planets
        int numberOfPlanets = planets.length;
        System.out.println("Number of planets: " + numberOfPlanets);

        // Access an element by index
        String thirdPlanet = planets[2];
        System.out.println("The third planet is: " + thirdPlanet);

        // Modify an element in the array
        planets[1] = "Shrouded Venus"; // Rename Venus
        System.out.println("After renaming Venus:");
        for (String planet : planets) {
            System.out.println(planet);
        }
    }
    
}
