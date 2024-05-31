package generic.animal;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog dog1 = dogBox.get();
        System.out.println("dog1 = " + dog1);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(dog);
        animalBox.set(cat);
    }
}
