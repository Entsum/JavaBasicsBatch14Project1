package project;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /*
         * Create a 2D array of integers. Develop a program which will calculate the sum
         * of even and odd numbers for that array.
         */

        int[][] numbers = {
        		{ 2, 4, 7 }, 
        		{ 44, 55, 66 }, 
        		{ 25, 100, 35, 20 } };
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];

                } else {
                    sumOdd += numbers[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers are " + sumEven);
        System.out.println("Sum of Odd numbers are " + sumOdd);

	}

}
