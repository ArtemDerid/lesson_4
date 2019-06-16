package ua.lviv.lgs.coin;

public class Application {
	public static void main(String[] args) {

		int toss = (int) (Math.random() * 1000);
		int headsOrTails;
		int heads = 0;
		int tails = 0;

		for (int i = 0; i < toss; i++) {
			headsOrTails = (int) (Math.random() * 2) + 1;
			if (headsOrTails == 1) {
				heads++;
			} else {
				tails++;
			}
		}

		System.out.println(
				"You throw a coin " + toss + " times. \nNumber of heads: " + heads + "\nNumber of tails: " + tails);
	}
}
