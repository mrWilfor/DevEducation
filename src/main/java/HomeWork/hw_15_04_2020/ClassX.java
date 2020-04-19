/*
//Task 3. Find and fix the error without deleting anything in the code! Hint - you need to do something with one line. The code must compile.

public class ClassX {

	public static void main(String[] args) {
    	computeX();
	}

	private static void computeX() {
    	int x;
    	x = 10;
    	if (x == 10) {
        	int y = 20;
        	System.out.println("x and y: " + x + " " + y);
        	x = y * 2;
    	}
    	y = 100;

    	System.out.println("x is " + x);
	}
}
*/
package HomeWork.hw_15_04_2020;

public class ClassX {

    public static void main(String[] args) {
        computeX();
    }

    private static void computeX() {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        int y = 100; //variable y was not declared

        System.out.println("x is " + x);
    }
}
