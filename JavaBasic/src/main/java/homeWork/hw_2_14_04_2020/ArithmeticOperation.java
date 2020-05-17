/*Primitive data, their reduction.

        - Declaration and initialization of all primitive data types.
        - see about converting data types to another data type.
        - perform arithmetic operations (including%) between the same type (int -> int, byte -> byte, ...)
        ---- see how integer types behave during division (example: 9/2)
        - perform arithmetic operations (including%) between different types (long -> int, byte -> int, float -> int, ...)
        - work with floating point numbers (data loss when casting a fractional number to an integer)
        ---- see how it behaves

        ** work with char. What this data type is.
        - conversion int -> char
        - conversion char -> int

        Write tests for all operations with primitive data types.*/

package homeWork.hw_2_14_04_2020;

public class ArithmeticOperation {

    public static void main(String[] args) {
        // announcement variables
        byte a = 1;
        short b = 14;
        int c = 345;
        long d = 10367;
        float e = 3.14f;
        double f = 3.14;
        char j = 88;       // j and k the same, because char data type it is number symbol in Unicode
        char k = 'X';
        boolean bo1 = true; // Arithmetic operations with boolean data type don`t executed
        System.out.println("byte a =" + a + " short b =" + b + " int c =" + c + " long d =" + d + " float e =" + e + "double f =" + f + "char j =" + j + " char k =" + k + " boolean bo1 =" + bo1);

        c = (int) k; //There c = 88 because when char cast to int, c becomes number symbol
        k = (char) c;  //There k = 'X' because when int cast to char, k becomes symbol
        System.out.println("c =" + c + " k =" + k);

        c = (int) e;  // When double cast to int fractional part discarded
        System.out.println("c =" + c);

        sum((byte) 1, (byte) 2);
        sum((short) 3, (short) 4);
        sum(4, 3);
        sum(3425L, 2541L);
        sum(1.23f, 5.16f);
        sum(8.765, 9.321);
        sum('A', 'T');

        subtraction((byte) 1, (byte) 2);
        subtraction((short) 3, (short) 4);
        subtraction(4, 3);
        subtraction(3425L, 2541L);
        subtraction(1.23f, 5.16f);
        subtraction(8.765, 9.321);
        subtraction('A', 'T');

        multiplication((byte) 1, (byte) 2);
        multiplication((short) 3, (short) 4);
        multiplication(4, 3);
        multiplication(3425L, 2541L);
        multiplication(1.23f, 5.16f);
        multiplication(8.765, 9.321);
        multiplication('A', 'T');

        division((byte) 1, (byte) 2);
        division((short) 3, (short) 4);
        division(4, 3);
        division(3425L, 2541L);
        division(1.23f, 5.16f);
        division(8.765, 9.321);
        division('A', 'T');

        divisionByRemainder((byte) 1, (byte) 2);
        divisionByRemainder((short) 3, (short) 4);
        divisionByRemainder(4, 3);
        divisionByRemainder(3425L, 2541L);
        divisionByRemainder(1.23f, 5.16f);
        divisionByRemainder(8.765, 9.321);
        divisionByRemainder('A', 'T');

        sumByteShort((byte) 55, (short) 43);
        subtractionByteShort((byte) 55, (short) 43);
        multiplicationByteShort((byte) 55, (short) 43);
        divisionByteShort((byte) 55, (short) 43);
        divisionByRemainderByteShort((byte) 55, (short) 43);

        sumShortInt((short) 673, 320);
        subtractionShortInt((short) 673, 320);
        multiplicationShortInt((short) 673, 320);
        divisionShortInt((short) 673, 320);
        divisionByRemainderShortInt((short) 673, 320);

        sumIntLong(8975, 3224L);
        subtractionIntLong(8975, 3224L);
        multiplicationIntLong(8975, 3224L);
        divisionIntLong(8975, 3224L);
        divisionByRemainderIntLong(8975, 3224L);

        sumLongFloat(765L, 243.47f);
        subtractionLongFloat(765L, 243.47f);
        multiplicationLongFloat(765L, 243.47f);
        divisionLongFloat(765L, 243.47f);
        divisionByRemainderLongFloat(765L, 243.47f);

        sumFloatDouble(65.23f, 124.76);
        subtractionFloatDouble(65.23f, 124.76);
        multiplicationFloatDouble(65.23f, 124.76);
        divisionFloatDouble(65.23f, 124.76);
        divisionByRemainderFloatDouble(65.23f, 124.76);

        sumDoubleChar(5.43, 'E');
        subtractionDoubleChar(5.43, 'E');
        multiplicationDoubleChar(5.43, 'E');
        divisionDoubleChar(5.43, 'E');
        divisionByRemainderDoubleChar(5.43, 'E');

        sumCharByte('O', (byte) 6);
        subtractionCharByte('O', (byte) 6);
        multiplicationCharByte('O', (byte) 6);
        divisionCharByte('O', (byte) 6);
        divisionByRemainderCharByte('O', (byte) 6);
    }

    //Arithmetic operations with byte type number

    public static byte sum(byte a, byte b) {
        byte c = (byte) (a + b);
        System.out.println("byte: Sum - " + c);
        return c;
    }

    public static byte subtraction(byte a, byte b) {
        byte c = (byte) (a - b);
        System.out.println("byte: subtraction - " + c);
        return c;
    }

    public static byte multiplication(byte a, byte b) {
        byte c = (byte) (a * b);
        System.out.println("byte: multiplication - " + c);
        return c;
    }

    public static byte division(byte a, byte b) {
        byte c = (byte) (a / b);
        System.out.println("byte: division - " + c);
        return c;
    }

    public static byte divisionByRemainder(byte a, byte b) {
        byte c = (byte) (a % b);
        System.out.println("byte: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with short type number

    public static short sum(short a, short b) {
        short c = (short) (a + b);
        System.out.println("short: Sum - " + c);
        return c;
    }

    public static short subtraction(short a, short b) {
        short c = (short) (a - b);
        System.out.println("short: subtraction - " + c);
        return c;
    }

    public static short multiplication(short a, short b) {
        short c = (short) (a * b);
        System.out.println("short: multiplication - " + c);
        return c;
    }

    public static short division(short a, short b) {
        short c = (short) (a / b);
        System.out.println("short: division - " + c);
        return c;
    }

    public static short divisionByRemainder(short a, short b) {
        short c = (short) (a % b);
        System.out.println("short: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with integer type number

    public static int sum(int a, int b) {
        int c = a + b;
        System.out.println("int: Sum - " + c);
        return c;
    }

    public static int subtraction(int a, int b) {
        int c = a - b;
        System.out.println("int: subtraction - " + c);
        return c;
    }

    public static int multiplication(int a, int b) {
        int c = a * b;
        System.out.println("int: multiplication - " + c);
        return c;
    }

    public static int division(int a, int b) {
        int c = a / b;
        System.out.println("int: division - " + c);
        return c;
    }

    public static int divisionByRemainder(int a, int b) {
        int c = a % b;
        System.out.println("int: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with long type number

    public static long sum(long a, long b) {
        long c = a + b;
        System.out.println("long: Sum - " + c);
        return c;
    }

    public static long subtraction(long a, long b) {
        long c = a - b;
        System.out.println("long: subtraction - " + c);
        return c;
    }

    public static long multiplication(long a, long b) {
        long c = a * b;
        System.out.println("long: multiplication - " + c);
        return c;
    }

    public static long division(long a, long b) {
        long c = a / b;
        System.out.println("long: division - " + c);
        return c;
    }

    public static long divisionByRemainder(long a, long b) {
        long c = a % b;
        System.out.println("long: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with float type number

    public static float sum(float a, float b) {
        float c = a + b;
        System.out.println("float: Sum - " + c);
        return c;
    }

    public static float subtraction(float a, float b) {
        float c = a - b;
        System.out.println("float: subtraction - " + c);
        return c;
    }

    public static float multiplication(float a, float b) {
        float c = a * b;
        System.out.println("float: multiplication - " + c);
        return c;
    }

    public static float division(float a, float b) {
        float c = a / b;
        System.out.println("float: division - " + c);
        return c;
    }

    public static float divisionByRemainder(float a, float b) {
        float c = a % b;
        System.out.println("float: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with double type number

    public static double sum(double a, double b) {
        double c = a + b;
        System.out.println("double: Sum - " + c);
        return c;
    }

    public static double subtraction(double a, double b) {
        double c = a - b;
        System.out.println("double: subtraction - " + c);
        return c;
    }

    public static double multiplication(double a, double b) {
        double c = a * b;
        System.out.println("double: multiplication - " + c);
        return c;
    }

    public static double division(double a, double b) {
        double c = a / b;
        System.out.println("double: division - " + c);
        return c;
    }

    public static double divisionByRemainder(double a, double b) {
        double c = a % b;
        System.out.println("double: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with char data type

    public static char sum(char a, char b) {
        char c = (char) (a + b);
        System.out.println("char: Sum - " + c);
        return c;
    }

    public static char subtraction(char a, char b) {
        char c = (char) (a - b);
        System.out.println("char: subtraction - " + c);
        return c;
    }

    public static char multiplication(char a, char b) {
        char c = (char) (a * b);
        System.out.println("char: multiplication - " + c);
        return c;
    }

    public static char division(char a, char b) {
        char c = (char) (a / b);
        System.out.println("char: division - " + c);
        return c;
    }

    public static char divisionByRemainder(char a, char b) {
        char c = (char) (a % b);
        System.out.println("char: division by remainder - " + c);
        return c;
    }

    //Arithmetic operations with byte and short type number

    public static short sumByteShort(byte a, short b) {
        short c = (short) (a + b);
        System.out.println("byte + short =" + c);
        return c;
    }

    public static short subtractionByteShort(byte a, short b) {
        short c = (short) (a - b);
        System.out.println("byte - short =" + c);
        return c;
    }

    public static short multiplicationByteShort(byte a, short b) {
        short c = (short) (a * b);
        System.out.println("byte * short =" + c);
        return c;
    }

    public static short divisionByteShort(byte a, short b) {
        short c = (short) (a / b);
        System.out.println("byte / short =" + c);
        return c;
    }

    public static short divisionByRemainderByteShort(byte a, short b) {
        short c = (short) (a % b);
        System.out.println("byte % short =" + c);
        return c;
    }

    //Arithmetic operations with short and int type number

    public static int sumShortInt(short a, int b) {
        int c = a + b;
        System.out.println("short + int =" + c);
        return c;
    }

    public static int subtractionShortInt(short a, int b) {
        int c = a - b;
        System.out.println("short - int =" + c);
        return c;
    }

    public static int multiplicationShortInt(short a, int b) {
        int c = a * b;
        System.out.println("short * int =" + c);
        return c;
    }

    public static int divisionShortInt(short a, int b) {
        int c = a / b;
        System.out.println("short / int =" + c);
        return c;
    }

    public static int divisionByRemainderShortInt(short a, int b) {
        int c = a % b;
        System.out.println("short % int =" + c);
        return c;
    }

    //Arithmetic operations with int and long type number

    public static long sumIntLong(int a, long b) {
        long c = a + b;
        System.out.println("long + int =" + c);
        return c;
    }

    public static long subtractionIntLong(int a, long b) {
        long c = a - b;
        System.out.println("long - int =" + c);
        return c;
    }

    public static long multiplicationIntLong(int a, long b) {
        long c = a * b;
        System.out.println("long * int =" + c);
        return c;
    }

    public static long divisionIntLong(int a, long b) {
        long c = a / b;
        System.out.println("long / int =" + c);
        return c;
    }

    public static long divisionByRemainderIntLong(int a, long b) {
        long c = a % b;
        System.out.println("long % int =" + c);
        return c;
    }

    //Arithmetic operations with long and float type number

    public static float sumLongFloat(long a, float b) {
        float c = a + b;
        System.out.println("long + float =" + c);
        return c;
    }

    public static float subtractionLongFloat(long a, float b) {
        float c = a - b;
        System.out.println("long - float =" + c);
        return c;
    }

    public static float multiplicationLongFloat(long a, float b) {
        float c = a * b;
        System.out.println("long * float =" + c);
        return c;
    }

    public static float divisionLongFloat(long a, float b) {
        float c = a / b;
        System.out.println("long / float =" + c);
        return c;
    }

    public static float divisionByRemainderLongFloat(long a, float b) {
        float c = a * b;
        System.out.println("long * float =" + c);
        return c;
    }

    //Arithmetic operations with float and double type number

    public static double sumFloatDouble(float a, double b) {
        double c = a + b;
        System.out.println("float + double =" + c);
        return c;
    }

    public static double subtractionFloatDouble(float a, double b) {
        double c = a - b;
        System.out.println("float - double =" + c);
        return c;
    }

    public static double multiplicationFloatDouble(float a, double b) {
        double c = a * b;
        System.out.println("float * double =" + c);
        return c;
    }

    public static double divisionFloatDouble(float a, double b) {
        double c = a / b;
        System.out.println("float / double =" + c);
        return c;
    }

    public static double divisionByRemainderFloatDouble(float a, double b) {
        double c = a % b;
        System.out.println("float % double =" + c);
        return c;
    }

    //Arithmetic operations with double type number and char data type

    public static double sumDoubleChar(double a, char b) {
        double c = a + b;
        System.out.println("double + char =" + c);
        return c;
    }

    public static double subtractionDoubleChar(double a, char b) {
        double c = a - b;
        System.out.println("double - char =" + c);
        return c;
    }

    public static double multiplicationDoubleChar(double a, char b) {
        double c = a * b;
        System.out.println("double * char =" + c);
        return c;
    }

    public static double divisionDoubleChar(double a, char b) {
        double c = a / b;
        System.out.println("double / char =" + c);
        return c;
    }

    public static double divisionByRemainderDoubleChar(double a, char b) {
        double c = a % b;
        System.out.println("double % char =" + c);
        return c;
    }

    //Arithmetic operations with char  data type and byte type number

    public static double sumCharByte(char a, byte b) {
        char c = (char) (a + b);
        System.out.println("char + byte =" + c);
        return c;
    }

    public static double subtractionCharByte(char a, byte b) {
        char c = (char) (a - b);
        System.out.println("char - byte =" + c);
        return c;
    }

    public static double multiplicationCharByte(char a, byte b) {
        char c = (char) (a * b);
        System.out.println("char * byte =" + c);
        return c;
    }

    public static double divisionCharByte(char a, byte b) {
        char c = (char) (a / b);
        System.out.println("char / byte =" + c);
        return c;
    }

    public static double divisionByRemainderCharByte(char a, byte b) {
        char c = (char) (a % b);
        System.out.println("char % byte =" + c);
        return c;
    }

}

