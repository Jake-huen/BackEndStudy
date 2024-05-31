package generic.restrict;

import generic.animal.Animal;

public class AnimalHospitalV2<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용.
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
    }
}
