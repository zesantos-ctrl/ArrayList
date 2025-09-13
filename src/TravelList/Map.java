package TravelList;

import java.util.ArrayList;

public class Map {
    public static void main(String[] args) {
        ArrayList<Travel> travelList = new ArrayList<>();

        travelList.add(new Travel("Paris", 5));
        travelList.add(new Travel("Nova York", 7));
        travelList.add(new Travel("Tóquio", 10));

        System.out.println("Duram mais de 7 dias: ");
        for(Travel travel : travelList) {
            if (travel.getDurationDays() >= 7) {
                System.out.println(travel);
            }
        }

    }
}
