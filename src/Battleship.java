import java.util.Arrays;

public class Battleship {

    public static void main(String[] args) {
        GamePlay gameOne = new GamePlay();
        gameOne.generateShipLocation();
        gameOne.getUserInput();
        System.out.println(Arrays.toString(gameOne.sea));
    }

}
