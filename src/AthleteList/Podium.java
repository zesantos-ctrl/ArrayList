package AthleteList;

import java.util.ArrayList;

public class Podium {
    public static void main(String[] args) {
        ArrayList<Athlete> athletesList = new ArrayList<>();

        athletesList.add(new Athlete("Usain Bolt", "Atletismo", 36));
        athletesList.add(new Athlete("Simone Biles", "Ginástica", 26));
        athletesList.add(new Athlete("Lionel Messi", "Futebol", 37));
        Athlete topAthlete = athletesList.get(0);
        for (Athlete athlete : athletesList){
            if (athlete.getPoint() > topAthlete.getPoint()){
               topAthlete = athlete;
            }
        }
        System.out.println("Atleta com a maior pontuação: ");
        System.out.println(topAthlete);
    }
}
