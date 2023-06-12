package com.example.test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.test.NumbersClass.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private double num1;
    private double num2;
    private double num2Zero;

    private CalculatorService cs;

    @BeforeEach
    public void sutUp() {
        num1 = 3.4d;
        num2 = 5.5d;
        num2Zero = 0;
        public void sutUp () {
            cs = new CalculatorService();
        }

        @Test
        public void add () {
            double actual = cs.plus(num1, num2);
            double expected = num1 + num2;
            public void addTest1 () {
                double actual = cs.plus(NUM1, NUM2);
                double expected = NUM1 + NUM2;
                assertEquals(actual, expected);
            }

            @Test
            public void addTest2 () {
                double actual = cs.plus(NUM3, NUM4);
                double expected = NUM3 + NUM4;
                assertEquals(actual, expected);
            }

            @Test
            public void minusTest1 () {
                double actual = cs.minus(NUM1, NUM2);
                double expected = NUM1 - NUM2;
                assertEquals(actual, expected);
            }

            @Test
            public void minusTest2 () {
                double actual = cs.minus(NUM3, NUM4);
                double expected = NUM3 - NUM4;
                assertEquals(actual, expected);
            }

            @Test
            public void minus () {
                double actual = cs.minus(num1, num2);
                double expected = num1 - num2;
                public void multiplyTest1 () {
                    double actual = cs.multiply(NUM1, NUM2);
                    double expected = NUM1 * NUM2;
                    assertEquals(actual, expected);
                }

                @Test
                public void multiply () {
                    double actual = cs.multiply(num1, num2);
                    double expected = num1 * num2;
                    public void multiplyTest2 () {
                        double actual = cs.multiply(NUM3, NUM4);
                        double expected = NUM3 * NUM4;
                        assertEquals(actual, expected);
                    }

                    @Test
                    public void divide () {
                        double actual = cs.divide(num1, num2);
                        double expected = num1 / num2;
                        public void divideTest1 () {
                            double actual = cs.divide(NUM1, NUM2);
                            double expected = NUM1 / NUM2;
                            assertEquals(actual, expected);
                        }

                        @Test
                        public void divideTest2 () {
                            double actual = cs.divide(NUM3, NUM4);
                            double expected = NUM3 / NUM4;
                            assertEquals(actual, expected);
                        }

                        @Test
                        public void divideWithExceptionTest1 () {
                            assertThrows(IllegalArgumentException.class, () -> cs.divide(NUM1, NUM_ZERO));
                        }

                        @Test
                        public void divideWithException () {
                            assertThrows(IllegalArgumentException.class, () -> cs.divide(num1, num2Zero));
                            public void divideWithExceptionTest2 () {
                                assertThrows(IllegalArgumentException.class, () -> cs.divide(NUM3, NUM_ZERO));
                            }
                        }
                    }
                }
            }
        }
    }
}
