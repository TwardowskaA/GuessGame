import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numer = 421;
        int userInpot;
        System.out.println("Zgadnij liczbę");

        while ((userInpot = reader.nextInt()) != numer) {
           if (userInpot > numer) {
               System.out.println("Podana liczba jest za duża, zgaduj dalej!");
           } else {
               System.out.println("Podana liczba jest za mała, zgaduj dalej!");
           }

        }

        System.out.println("Brawo, zgadłeś liczbę!");

        reader.close();

    }

















}







