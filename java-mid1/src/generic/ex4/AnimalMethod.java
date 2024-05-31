package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T animal) {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2){
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
