import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    //Sea array
    public int[] sea = new int[20];
    public int[] hit = new int[20];
    public int ship1;
    public int guess;
    public int guesses = 0;
    public int sum;

    public void getUserInput() {
        Scanner userInput = new Scanner(System.in);
        while(true) {
            sum = 0;
            System.out.print("Enter your guess: ");
            guess = userInput.nextInt();
            guesses ++;
            if(sea[guess] == 1) {
                System.out.println("Hit!");
                hit[guess] = 1;
            }
            else {
                System.out.println("Miss!");
            }
            for(int i = 0; i < hit.length; i++) {
                if(hit[i] == 1) {
                    sum ++;
                    if(sum >= 4) {
                        System.out.println("You sank my Battleship");
                        return;
                    }
                }
            }
        }
    }

    public int[] generateShipLocation() {
        Random random = new Random();
        ship1 = random.nextInt(20 - 4);
        for(int i = ship1; i < ship1 + 4; i++) {
            sea[i] = 1;
        }
        return sea;
    }

}
