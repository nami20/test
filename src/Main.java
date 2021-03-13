import java.util.*;

public class Main {

    public void playGame(int overs, int totalScore, int player) {
        match mt =  new match();
        gamepojo obj = new gamepojo(overs, totalScore , player);
        mt.letsHaveMatch(obj);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int overs = sc.nextInt();
            int totalScore = sc.nextInt();
            int player = sc.nextInt();
            Main main = new Main();
            main.playGame(overs, totalScore , player);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

