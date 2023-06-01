package FiksturOlusturucu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void createFixture(List<String> teams) {
        int teamNumber = teams.size();
        if (teamNumber % 2 != 0) {
            teams.add("Bay");
            teamNumber++;
        }

        int lapsNumber = teamNumber - 1;
        int matchesNumber = teamNumber / 2;

        for (int lap = 1; lap <= lapsNumber; lap++) {
            System.out.println("=========================");
            System.out.println("Round " + lap);

            for (int i = 0; i < matchesNumber; i++) {
                String evSahibi = teams.get(i);
                String deplasman = teams.get(teamNumber - 1 - i);

                System.out.println(evSahibi + " vs " + deplasman);
            }

            // Takımları döndürerek farklı eşleşmeler elde etmek için
            Collections.rotate(teams.subList(1, teamNumber), 1);
        }
    }
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        createFixture(teams);
    }
}
