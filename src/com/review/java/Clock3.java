package com.review.java;

public class Clock3 {

	public static void main(String[] args) {

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m <= 5; m++) {

				for (int m2 = 0; m2 <= 9; m2++) {
					if (h < 10) {
						System.out.println("0" + h + ":" + m + m2);

					} else {
						System.out.println(h + ":" + m + m2);
					}
				}
			}
		}

	}

}
