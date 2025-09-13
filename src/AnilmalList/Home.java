package AnilmalList;

import java.util.ArrayList;


public class Home {
    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<>();


        Animal animal1 = new Animal("Mumu","Gato");
        Animal animal2 = new Animal("Zizi","Gato");
        Animal animal3 = new Animal("Toddy","Cachorro");

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);


        for (Animal animal : animalList) {
            if (animal.getSpecies().equals( "Gato")) {
                System.out.println(animal);
            }
        }

    }
}