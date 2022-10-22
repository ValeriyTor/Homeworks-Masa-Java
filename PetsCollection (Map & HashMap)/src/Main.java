import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Pets> pets = new HashMap<>();
        pets.put("Mike", new Cat("Mike 2"));
        pets.put("Bob", new Dog("Bob 2"));
        pets.put("Black", new Dog("Bob 2"));
        pets.put("Glen", new Pets("Glen 2"));
        pets.put("Gord", new Parrot("Glen 2"));
        Pets.keys(pets);
        }

    }