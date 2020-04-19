public class dfhf {
    public static void main(String[] args) {
        calculator ("2+1");
    }
    public static double calculator (String mathExpression1){
        String[] arrayNum = new String[2];
        char operator = ' ';
        String stringNum1 = "";
        String stringNum2 = "";
        double num1;
        double num2;
        double result = 0.0;

        int index = mathExpression1.indexOf('+');
        if (index != -1) {
            arrayNum = mathExpression1.split("\\+");
            operator = '+';
        } else {
            int index1 = mathExpression1.indexOf('-');
            if (index1 != -1) {
                arrayNum = mathExpression1.split("-");
                operator = '-';
            } else {
                int index2 = mathExpression1.indexOf('*');
                if (index2 != -1) {
                    arrayNum = mathExpression1.split("\\*");
                    operator = '*';
                } else {
                    int index3 = mathExpression1.indexOf('/');
                    if (index3 != -1) {
                        arrayNum = mathExpression1.split("/");
                        operator = '/';
                    }
                }
            }
        }
        stringNum1 = arrayNum[0] ;
        double d = Double.parseDouble(stringNum1);
        System.out.println(d);
        System.out.println(operator);
        return 0;
        }

    }
