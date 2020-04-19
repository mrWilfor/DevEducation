/*
* //Задача 4*. реализовать расчет гипотенузы по теореме Пифагора для целочисленных (int) и дробных (double) значений
* катетов. Т.е. меняя только сами значения катетов, программа все равно должна компилироваться и верно рассчитывать
* гипотенузу.
 */
package HomeWork.hw_15_04_2020;

public class Hypotenuse {

    public static void main(String[] args){
        System.out.println(hypotenuse(3, 4));
        System.out.println(hypotenuse(3.5, 4.5));
    }

    public static int hypotenuse(int a, int b) { //This is method using integer number
        int c = (int) Math.sqrt(a * a + b * b);
        return c;
    }

    public static double hypotenuse(double a, double b) {  //This is method using double type number
        double c = Math.sqrt(a * a + b * b);
        return c;
    }
}
