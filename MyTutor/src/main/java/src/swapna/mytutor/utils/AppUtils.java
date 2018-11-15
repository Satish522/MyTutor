package src.swapna.mytutor.utils;

import java.util.Random;

public class AppUtils {

	public static int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(999);
	}
}
