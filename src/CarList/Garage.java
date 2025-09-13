package CarList;

import java.util.ArrayList;

public class Garage {
    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<>();

        carlist.add(new Car("Mazda Rx7", "Azul"));
        carlist.add(new Car("Toyata Supra","Vermelho"));
        carlist.add(new Car("Nissan s15", "Amarelo"));

        System.out.println(carlist.size());
        System.out.println("Total de livros" + carlist.toString());

        for (Car car : carlist) {
            if (car.getColor() == "Vermelho") {
                System.out.println(car);
            }
        }
    }
}
