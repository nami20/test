import java.util.Random;

public class Player {
    int bowler;

    public Player() { }

    public int getBowler() {
        return this.bowler;
    }

    public void setBowler(int bowler) {
        this.bowler = bowler;
    }

    public int getbatsmanScore() {
        return getRandomNumber(10);
    }

    public static int getRandomNumber(int index) {
        Random ran = new Random();
        int no = ran.nextInt(index);
        return no;
    }

    public int getHitterScore() {
        int[] arr = {0, 4, 6};
        int no = getRandomNumber(3);
        return arr[no];
    }

    public int getDefensiveScore() {
        int[] arr = {0, 1, 2, 3};
        int no = getRandomNumber(4);
        return arr[no];
    }

    public int getScore(int player) {
        switch(player) {
            case 1:
                return getHitterScore();
            case 2:
                return getDefensiveScore();
             default:
                return getbatsmanScore();
        }
    }
}
