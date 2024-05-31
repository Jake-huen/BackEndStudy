package generic.restrict;

import generic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void setAnimal(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
    }
}
