package MovieList;

public class Movie {
    private String title ;
    private String gender;
    private double rating;

    public Movie(String title, String gender, double rating) {
        this.title = title;
        this.gender = gender;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", reting=" + rating +
                '}';
    }
}
