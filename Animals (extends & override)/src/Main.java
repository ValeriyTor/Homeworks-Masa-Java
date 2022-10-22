public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Собачий корм","двор","бульдог");
        Animal animal2 = new Cat("Кошачий корм", "квартира","невская маскарадная");
        Animal animal3 = new Horse("Сено", "Пастбище", "Пржевальского");
         Animal [] animals = {animal1, animal2, animal3};
        for (Animal count : animals)
            System.out.println("На прием к доктору придет животное. Оно обетает: " + count.location + ". " + count.eat(count.food));
    }
}

class Animal{
    String food = "";
    String location = "";

    public Animal(String food, String location)
    {
        this.food=food;
        this.location=location;
    }

    boolean makeNoise(int levelOfNoise){
        if (levelOfNoise > 5)
            return true;
        else return false;
    }
    String eat(String food){
        return ("Основная пища: " + this.food);
    }
    void sleep()
    {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal {
    String breedOfDog = "";
    public Dog(String food, String location, String breedOfDog) {
        super(food, location);
        this.breedOfDog = breedOfDog;
    }
    @Override
    boolean makeNoise(int levelOfNoise){
        if (levelOfNoise > 4)
            return true;
        else return false;
    }
    @Override
    String eat(String food){
        return ("Основная пища собаки: " + food);
    }
}

class Cat extends Animal {
    String breedOfCat = "";
    public Cat(String food, String location, String breedOfCat) {
        super(food, location);
        this.breedOfCat = breedOfCat;
    }
    @Override
    boolean makeNoise(int levelOfNoise){
        if (levelOfNoise > 6)
            return true;
        else return false;
    }
    @Override
    String eat(String food){
        return ("Основная пища кошки: " + food);
    }
}
class Horse extends Animal {
    String breedOfHorse = "";
    public Horse(String food, String location, String breedOfHorse) {
        super(food, location);
        this.breedOfHorse = breedOfHorse;
    }
    @Override
    boolean makeNoise(int levelOfNoise){
        if (levelOfNoise > 8)
            return true;
        else return false;
    }
    @Override
    String eat(String food){
        return ("Основная пища лошади: " + food);
    }
}

class Veterinar {
        public static void treatAnimal(Animal animal){
        System.out.println(animal.food+" "+animal.location);
    }
}



