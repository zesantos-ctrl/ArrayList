package recipeList;

import java.util.ArrayList;

public class Bonfire {
    public static void main(String[] args) {
        ArrayList<Recipe> recipeList = new ArrayList<>();


        recipeList.add(new Recipe("Panqueca de Banana", 12));
        recipeList.add(new Recipe("Omelete de Queijo", 8));
        recipeList.add(new Recipe("Bolo de Chocolate", 45));


        for (Recipe recipe : recipeList){
            if (recipe.getPrepTime() <= 30) {
                System.out.println(recipe);
                System.out.println( recipe +" - Receita rapida: " + recipe.getName());
            }
        }

    }
}
