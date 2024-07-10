    // This Java application is provided without data, only
    // sufficient code to illustrate the points made in 
    // chapter 3.
    public class CorgiInefficient {
    public static void main(String[] args) {
        Corgi[] corgis = getCorgiArray(); // You will need to populate this array
        int count = 0;

        for (int i = 0; i < corgis.length; i++) {
            if (corgis[i].getName().contains("e")) {
                count++;
            }
        }

        System.out.println("Corgis with 'e' in their names: " + count);
    }

    private static Corgi[] getCorgiArray() {
        // Not implemented; provided for structure.
        return new Corgi[0];
    }
}

class Corgi {
    private String name;

    public Corgi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
