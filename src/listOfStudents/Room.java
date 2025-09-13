package listOfStudents;

import java.util.ArrayList;

public class Room {
    public static void main(String[] args) {
        ArrayList<Students> studentsList = new ArrayList<>();



        studentsList.add(new Students("José V.", 10));
        studentsList.add(new Students("Ingrid B.", 2));
        studentsList.add(new Students("Gabriel K.", 8));
        studentsList.add(new Students("Mariana V.", 9));

        double soma = 0;
        double media = 0;
        for (Students students : studentsList){
            soma += students.getGrade();
            media = soma / studentsList.size();
        }

        for (Students students : studentsList) {
            if (students.getGrade() >= 7){
                System.out.println(students + " - Aprovado");
            } else {
                System.out.println(students + " - Reprovados");
            }
        }

    }
}
