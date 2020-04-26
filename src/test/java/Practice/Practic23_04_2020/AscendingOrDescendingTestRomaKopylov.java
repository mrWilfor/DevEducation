package Practice.Practic23_04_2020;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;


    @RunWith(Parameterized.class)
    public class AscendingOrDescendingTestRomaKopylov {
        public int input1;
        public int input2;
        public int input3;
        public int input4;
        public int input5;
        public int input6;
        public int input7;
        public boolean result;

        public AscendingOrDescendingTestRomaKopylov(
                int input1,
                int input2,
                int input3,
                int input4,
                int input5,
                int input6,
                int input7,
                boolean result) {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
            this.input4 = input4;
            this.input5 = input5;
            this.input6 = input6;
            this.input7 = input7;
            this.result = result;
        }

        @Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {1, 2, 2, 3, 3, 4, 0, true},
                    {1, 1, 1, 0, 0, 0, 0, true},
                    {1, 1, 0, 0, 0, 0, 0, true},
                    {1, 0, 1, 0, 2, 3, 0, true},
                    {0, 1, 0, 17, 2, 3, 0, true},
                    {0, 0, 1, 0, 2, 3, 0, true},
                    {9, 7, 6, 5, 4, 3, 0, true},
                    {9, 7, 5, 5, 3, 3, 0, true},
                    {3, 3, 8, 9, 112, 122, 0, true},
                    {2, 1, 2, 0, 3, 15, 7, false},
                    {5, 3, 15, 1, 2, 3, 0, false},
                    {2, 2, 1, 1, 2, 3, 0, false},
                    {1, 2, 1, 1, 1, 1, 0, false},
                    {17, 2, 18, 1, 1, 1, 0, false},
                    {2, 1, 17, 177, 2, 3, 0, false}
            });
        }

        @Test
        public void test1() {
            ByteArrayInputStream input =
                    new ByteArrayInputStream(
                            String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
                                    input1, input2, input3, input4, input5, input6, input7).getBytes());
            assertEquals("Result", result, AscendingOrDescending.sequence(new Scanner(input)));
        }
    }
