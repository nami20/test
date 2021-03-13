
public class match {

	public game gm;

	public void letsHaveMatch(gamepojo obj) {
		boolean score = gm.getbatsmanScore(obj);
		if(score) {
			System.out.print("batsman win");
		} else {
			System.out.println("bowler wins");
		}
	}
}
