package AthleteList;

public class Athlte {
    private String name;
    private String modality;
    private double point;

    public Athlte(String name, String modality, double point) {
        this.name = name;
        this.modality = modality;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public String getModality() {
        return modality;
    }

    public double getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Athlte{" +
                "name='" + name + '\'' +
                ", modality='" + modality + '\'' +
                ", point=" + point +
                '}';
    }
}
