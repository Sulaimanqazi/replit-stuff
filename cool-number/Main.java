import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			double x;
			double y;
    // double is used because if the cube/square root is a fraction, we can detect that
			int sqcu = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your first number");
			x = scanner.nextDouble();
			System.out.println("Enter your last number");
			y = scanner.nextDouble();
			// lets you input the numbers which will be checked through to see if its a cube square
			
			
			for (double i = x; i <= y; i++) {
        // for loop starts off with the first number and ends with the last number
        // i++ makes the loop go up each time it finishes
				double croot = Math.cbrt(i);
        // Finds the number within the given input and cube roots it
				double cube = croot%1;
        // If the number does not leave a remainder and equals 0 its a cube
				double sroot = Math.sqrt(i);
        // Finds the number within the given input and square roots it
				double square = sroot%1;
        // If the number does not leave a remainder and equals 0 its a square
				if (cube == 0 && square == 0) {
          // check if the number is both a cube and a square by checking if it leaves a remainder
					sqcu++;
          // if it is a cube square this variable goes up 1
					
				}
				
			}
			System.out.print(sqcu);
    // prints out the total number of square cubes found in the given input
			scanner.close();

			
					
			
		}

}
