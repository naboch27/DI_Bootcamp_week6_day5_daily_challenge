package daily_challenge;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        int compt = 0;

        int score = 0;

        try (Scanner scanner = new Scanner(System.in)) {

        int userNumber = 0;

        int compter = 0;

        String reponse = null ;

        String reponse1 = null;

            System.out.println("Voulez vous jouer ? (cliquer sur n'importe qu'elle touche pour jouer) ou (non)");

            reponse = scanner.nextLine();
 
            while (!reponse.equals("")) {

                compter++;

                if (reponse.equalsIgnoreCase("non")) {

                    System.out.println("Aurevoir");

                    break;

                } else {

                    if (compter > 1) {

                        scanner.nextLine();

                        System.out
                                .println(
                                        "Voulez vous jouer ? (cliquer sur n'importe qu'elle touche pour jouer) ou (non)");

                        reponse1 = scanner.nextLine();

                        if (reponse1.equalsIgnoreCase("non")) {

                            break;

                        }

                    }

                    Random rand = new Random();

                    // pick a random number between 0 and 100:
                    int randNumber = rand.nextInt(100);

                     //System.out.println("Enter our number"+randNumber);
                    System.out.println("Enter our number");

                    userNumber = scanner.nextInt();

                    System.out.println("Le nombre choisi est : " + randNumber);

                    if (randNumber == userNumber) {

                        System.out.println("Felicitation");

                        score += 1;

                    } else {

                        System.out.println("C'est pas le bon chiffre,vous pouvez reprendre");
                    }

                }

            }

            compt = compter - 1;

            System.out.println("Vous avez fait : " + compt + " Tentative(s)");

            System.out.println("Votre score est de : " + score + " Point(s)");

        } catch (Exception e) {

        

            System.out.println("Vous avez fait : " + compt + " Tentative(s)");

            System.out.println("Votre score est de : " + score + " Point(s)");
            
            System.out.println("Error ,our last enter is not valid ! ");

        }

    }
}