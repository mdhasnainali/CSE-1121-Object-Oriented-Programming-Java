import java.util.Random;

public class DiceRolling {
	public static void main(String[] str) {

		double randomValue = Math.random();
		randomValue = randomValue * 6;
		int dice = (int) randomValue + 1;

		System.out.println("Dice :" + dice);
	}
}
