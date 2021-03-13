import java.util.Random;

public class gameImpl implements game{

    @Override
    public boolean getbatsmanScore(gamepojo obj) {
        Player player = new Player();
        int score =0;
        for(int i =0 ;i <obj.getOvers(); i++) {
            for(int j = 0; j<6 && obj.getTotalScore() >= score;j++) {
                int sc = player.getScore(obj.getplayer());
                player.setBowler(player.getRandomNumber(10));
                if (sc == player.getBowler()) {
                    return false;
                } else {
                    score = score + sc;
                }
            }
        }
        return obj.getTotalScore() <= score;
    }

}
