package HomeWork.hw_14_04_2020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticOperationTest {

    @Test
    void arithmeticOperationTest() {
        Assertions.assertEquals(
                7,
                ArithmeticOperation.sum(3, 4),
                "test failed!"
        );
        Assertions.assertEquals(
                4,
                ArithmeticOperation.sum((byte) 2, (byte) 2),
                "test failed!"
        );
        Assertions.assertEquals(
                6,
                ArithmeticOperation.sum((short) 3, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                5900L,
                ArithmeticOperation.sum(3400L, 2500L),
                "test failed!"
        );
        Assertions.assertEquals(
                4.3f,
                ArithmeticOperation.sum(1.15f, 3.15f),
                "test failed!"
        );
        Assertions.assertEquals(
                10.0f,
                ArithmeticOperation.sum(9.75, 0.25),
                "test failed!"
        );
        Assertions.assertEquals(
                -1,
                ArithmeticOperation.subtraction(3, 4),
                "test failed!"
        );
        Assertions.assertEquals(
                0,
                ArithmeticOperation.subtraction((byte) 2, (byte) 2),
                "test failed!"
        );
        Assertions.assertEquals(
                0,
                ArithmeticOperation.subtraction((short) 3, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                900L,
                ArithmeticOperation.subtraction(3400L, 2500L),
                "test failed!"
        );
        Assertions.assertEquals(
                -2.0f,
                ArithmeticOperation.subtraction(1.15f, 3.15f),
                "test failed!"
        );
        Assertions.assertEquals(
                9.5f,
                ArithmeticOperation.subtraction(9.75, 0.25),
                "test failed!"
        );
        Assertions.assertEquals(
                12,
                ArithmeticOperation.multiplication(3, 4),
                "test failed!"
        );
        Assertions.assertEquals(
                4,
                ArithmeticOperation.multiplication((byte) 2, (byte) 2),
                "test failed!"
        );
        Assertions.assertEquals(
                9,
                ArithmeticOperation.multiplication((short) 3, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                8500000L,
                ArithmeticOperation.multiplication(3400L, 2500L),
                "test failed!"
        );
        Assertions.assertEquals(
                3.6225f,
                ArithmeticOperation.multiplication(1.15f, 3.15f),
                "test failed!"
        );
        Assertions.assertEquals(
                2.4375f,
                ArithmeticOperation.multiplication(9.75, 0.25),
                "test failed!"
        );
        Assertions.assertEquals(
                1,
                ArithmeticOperation.division(6, 4),
                "test failed!"
        );
        Assertions.assertEquals(
                1,
                ArithmeticOperation.division((byte) 2, (byte) 2),
                "test failed!"
        );
        Assertions.assertEquals(
                1,
                ArithmeticOperation.division((short) 3, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                1L,
                ArithmeticOperation.division(3400L, 2500L),
                "test failed!"
        );
        Assertions.assertEquals(
                0.5f,
                ArithmeticOperation.division(1.5f, 3.0f),
                "test failed!"
        );
        Assertions.assertEquals(
                39.0f,
                ArithmeticOperation.division(9.75, 0.25),
                "test failed!"
        );
        Assertions.assertEquals(
                2,
                ArithmeticOperation.divisionByRemainder(6, 4),
                "test failed!"
        );
        Assertions.assertEquals(
                0,
                ArithmeticOperation.divisionByRemainder((byte) 2, (byte) 2),
                "test failed!"
        );
        Assertions.assertEquals(
                0,
                ArithmeticOperation.divisionByRemainder((short) 3, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                900L,
                ArithmeticOperation.divisionByRemainder(3400L, 2500L),
                "test failed!"
        );
        Assertions.assertEquals(
                1.5f,
                ArithmeticOperation.divisionByRemainder(1.5f, 3.0f),
                "test failed!"
        );
        Assertions.assertEquals(
                0.0f,
                ArithmeticOperation.divisionByRemainder(9.75, 0.25),
                "test failed!"
        );
        Assertions.assertEquals(
                98,
                ArithmeticOperation.sumByteShort((byte) 55, (short) 43),
                "test failed!"
        );
        Assertions.assertEquals(
                12,
                ArithmeticOperation.subtractionByteShort((byte) 55, (short) 43),
                "test failed!"
        );
        Assertions.assertEquals(
                15,
                ArithmeticOperation.multiplicationByteShort((byte) 5, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                1,
                ArithmeticOperation.divisionByteShort((byte) 5, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                2,
                ArithmeticOperation.divisionByRemainderByteShort((byte) 5, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                99,
                ArithmeticOperation.sumShortInt((short) 67, 32),
                "test failed!"
        );
        Assertions.assertEquals(
                35,
                ArithmeticOperation.subtractionShortInt((short) 67, 32),
                "test failed!"
        );
        Assertions.assertEquals(
                18,
                ArithmeticOperation.multiplicationShortInt((short) 6, 3),
                "test failed!"
        );
        Assertions.assertEquals(
                2,
                ArithmeticOperation.divisionShortInt((short) 6, 3),
                "test failed!"
        );
        Assertions.assertEquals(
                0,
                ArithmeticOperation.divisionByRemainderShortInt((short) 6, 3),
                "test failed!"
        );
        Assertions.assertEquals(
                12199,
                ArithmeticOperation.sumIntLong(8975, 3224L),
                "test failed!"
        );
        Assertions.assertEquals(
                5751,
                ArithmeticOperation.subtractionIntLong(8975, 3224L),
                "test failed!"
        );
        Assertions.assertEquals(
                28935400L,
                ArithmeticOperation.multiplicationIntLong(8975, 3224L),
                "test failed!"
        );
        Assertions.assertEquals(
                2L,
                ArithmeticOperation.divisionIntLong(8975, 3224L),
                "test failed!"
        );
        Assertions.assertEquals(
                2527L,
                ArithmeticOperation.divisionByRemainderIntLong(8975, 3224L),
                "test failed!"
        );
        Assertions.assertEquals(
                1008.469970703125,
                ArithmeticOperation.sumLongFloat(765L, 243.47f),
                "test failed!"
        );
        Assertions.assertEquals(
                521.530029296875,
                ArithmeticOperation.subtractionLongFloat(765L, 243.47f),
                "test failed!"
        );
        Assertions.assertEquals(
                186254.546875,
                ArithmeticOperation.multiplicationLongFloat(765L, 243.47f),
                "test failed!"
        );
        Assertions.assertEquals(
                3.142070770263672,
                ArithmeticOperation.divisionLongFloat(765L, 243.47f),
                "test failed!"
        );
        Assertions.assertEquals(
                186254.546875,
                ArithmeticOperation.divisionByRemainderLongFloat(765L, 243.47f),
                "test failed!"
        );
        Assertions.assertEquals(
                66.5,
                ArithmeticOperation.sumFloatDouble(65.25f, 1.25),
                "test failed!"
        );
        Assertions.assertEquals(
                64.0,
                ArithmeticOperation.subtractionFloatDouble(65.25f, 1.25),
                "test failed!"
        );
        Assertions.assertEquals(
                81.5625,
                ArithmeticOperation.multiplicationFloatDouble(65.25f, 1.25),
                "test failed!"
        );
        Assertions.assertEquals(
                52.2,
                ArithmeticOperation.divisionFloatDouble(65.25f, 1.25),
                "test failed!"
        );
        Assertions.assertEquals(
                0.25,
                ArithmeticOperation.divisionByRemainderFloatDouble(65.25f, 1.25),
                "test failed!"
        );
        Assertions.assertEquals(
                70.43,
                ArithmeticOperation.sumDoubleChar(1.43, 'E'),
                "test failed!"
        );
        Assertions.assertEquals(
                -67.57,
                ArithmeticOperation.subtractionDoubleChar(1.43, 'E'),
                "test failed!"
        );
        Assertions.assertEquals(
                98.67,
                ArithmeticOperation.multiplicationDoubleChar(1.43, 'E'),
                "test failed!"
        );
        Assertions.assertEquals(
                0.020724637681159418,
                ArithmeticOperation.divisionDoubleChar(1.43, 'E'),
                "test failed!"
        );
        Assertions.assertEquals(
                1.43,
                ArithmeticOperation. divisionByRemainderDoubleChar(1.43, 'E'),
                "test failed!"
        );
        Assertions.assertEquals(
                85.0,
                ArithmeticOperation. sumCharByte('O', (byte) 6),
                "test failed!"
        );
        Assertions.assertEquals(
                73.0,
                ArithmeticOperation. subtractionCharByte('O', (byte) 6),
                "test failed!"
        );
        Assertions.assertEquals(
                474.0,
                ArithmeticOperation.multiplicationCharByte('O', (byte) 6),
                "test failed!"
        );
        Assertions.assertEquals(
                13.0,
                ArithmeticOperation.divisionCharByte('O', (byte) 6),
                "test failed!"
        );
        Assertions.assertEquals(
                1.0,
                ArithmeticOperation.divisionByRemainderCharByte('O', (byte) 6),
                "test failed!"
        );

    }
}




