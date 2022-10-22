import java.util.Map;

public class Pets {
    String name;
    Pets(String name)
    {
        this.name = name;
    }

    static void keys(Map<String, Pets> pets)
    {
        System.out.println("Ключи: " + pets.keySet());
    }
}
