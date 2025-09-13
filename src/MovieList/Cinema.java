package MovieList;

import java.util.ArrayList;

public class Cinema {
    public static void main(String[] args) {
        ArrayList<Movie> movieList  = new ArrayList<>();

        movieList.add(new Movie("Inception", "Ficção Científica", 9.0));
        movieList.add(new Movie("O Poderoso Chefão", "Drama", 9.5));
        movieList.add(new Movie("Toy Story", "Animação", 8.5));

        System.out.println("Filmes com avaliação alta: ");
        for (Movie movie : movieList){
            if (movie.getRating() >= 8) {
                System.out.println(movie);
            }
        }
    }
}
