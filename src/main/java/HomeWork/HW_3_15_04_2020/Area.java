/*
//Task 2. Calculate the area of ??the circle (the variable area). Write code only within the specified framework(// ... //)

public class Area {

	public static void main(String[] args) {
    	calculateAreaOfCircle();
	}

	private static void calculateAreaOfCircle() {
    	double pi = 3.1416;
    	int radius = 10;

//��� ������ ���� ��� ���
    	float area = ;
//
    	System.out.printf("Area of circle is %.2f", area);
	}
}
*/
package HomeWork.HW_3_15_04_2020;

public class Area {

        public static void main(String[] args) {
            calculateAreaOfCircle();
        }

        private static void calculateAreaOfCircle() {
            double pi = 3.1416;
            int radius = 10;

//��� ������ ���� ��� ���
            float area = (float)(pi * radius * radius) ; //This is my code

            System.out.printf("Area of circle is %.2f", area);
        }
    }

