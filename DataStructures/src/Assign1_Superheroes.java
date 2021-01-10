
public class Assign1_Superheroes {

    public static void main(String[] args) {

        String[] allHeroes = {"Flash", "Batman", "Ironman", "Krytonite", "Antman"};
        String[] powers = {"Speed", "Invisiblity", "Transform", "Kryptons", "Strength"};
        boolean[] isHuman = {true, true, true, false, true};

        System.out.println("Name      Powers    Are they Human?");
        for (int i = 0; i < allHeroes.length; i++) {
            System.out.println(allHeroes[i] + "    " + powers[i] + "    " + isHuman[i]);
        }

        System.out.println();
        System.out.println("Name      Powers    Are they Human?");

        powers[2] = "none";
        powers[4] = "none";
        for (int i = 0; i < allHeroes.length; i++) {
            System.out.println(allHeroes[i] + "    " + powers[i] + "    " + isHuman[i]);

        }

    }//end main

}//end class
