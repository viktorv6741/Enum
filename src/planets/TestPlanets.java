package planets;

import java.util.Scanner;

public class TestPlanets {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        NumberOfPlanets numberOfPlanets;

        System.out.println("Please, enter index number of the planet : ");
        int numberOfPlanet = console.nextInt();

        System.out.println(NumberOfPlanets.values()[numberOfPlanet - 1]);
        NumberOfPlanets.values()[numberOfPlanet - 1].description();
    }
}
