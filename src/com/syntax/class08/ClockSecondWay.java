package com.syntax.class08;

public class ClockSecondWay {

	public static void main(String[] args) {

		for (int z = 0; z <= 2; z++) {

			for (int x = 0; x <= 9; x++) {

				if (z == 2 && x > 3) {
					break;
				}

				for (int c = 0; c <= 5; c++) {

					for (int v = 0; v <= 9; v++) {

						System.out.println("it's " + z + x + ":" + c + v + " o'clock");
					}
				}
			}
		}
	}

}
