package com.example.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.test.NumbersClass.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorControllerTest {
    private double num1;
    private double num2;
    private double num2Zero;
    private CalculatorController cc;
    private CalculatorService cs;

    @BeforeEach
    public void setUp() {
        num1 = 3.4d;
        num2 = 4.7d;
        num2Zero = 0d;
        public void setUp () {
            cs = new CalculatorService();
            cc = new CalculatorController(cs);
        }

        @Test
        public void helloTest () {
            public void helloTest () {
                String actual = cc.hello();
                String expected = "<h1>Приветствую в калькуляторе</h1>";
                assertEquals(actual, expected);
            }

            @Test
            public void isPlusWorkTest1 () {
                String actual = cc.plus(NUM1, NUM2);
                String expected = "<h1>" + NUM1 + " + " + NUM2 + " = " + cs.plus(NUM1, NUM2) + "</h1>";
                assertEquals(actual, expected);
            }

            @Test
            public void isPlusWorkTest2 () {
                String actual = cc.plus(NUM3, NUM4);
                String expected = "<h1>" + NUM3 + " + " + NUM4 + " = " + cs.plus(NUM3, NUM4) + "</h1>";
                assertEquals(actual, expected);
            }

            @Test
            public void isMinusWorkTest1 () {
                String actual = cc.minus(NUM1, NUM2);
                String expected = "<h1>" + NUM1 + " - " + NUM2 + " = " + cs.minus(NUM1, NUM2) + "</h1>";
                assertEquals(actual, expected);
            }

            @Test
            public void isPlusWork () {
                String actual = cc.plus(num1, num2);
                String expected = "<h1>" + num1 + " + " + num2 + " = " + cs.plus(num1, num2) + "</h1>";
                public void isMinusWorkTest2 () {
                    String actual = cc.minus(NUM3, NUM4);
                    String expected = "<h1>" + NUM3 + " - " + NUM4 + " = " + cs.minus(NUM3, NUM4) + "</h1>";
                    assertEquals(actual, expected);
                }

                @Test
                public void isMinusWork () {
                    String actual = cc.minus(num1, num2);
                    String expected = "<h1>" + num1 + " - " + num2 + " = " + cs.minus(num1, num2) + "</h1>";
                    public void isMultiplyWorkTest1 () {
                        String actual = cc.multiply(NUM1, NUM2);
                        String expected = "<h1>" + NUM1 + " x " + NUM2 + " = " + cs.multiply(NUM1, NUM2) + "</h1>";
                        assertEquals(actual, expected);
                    }

                    @Test
                    public void multiply () {
                        String actual = cc.multiply(num1, num2);
                        String expected = "<h1>" + num1 + " x " + num2 + " = " + cs.multiply(num1, num2) + "</h1>";
                        public void isMultiplyWorkTest2 () {
                            String actual = cc.multiply(NUM3, NUM4);
                            String expected = "<h1>" + NUM3 + " x " + NUM4 + " = " + cs.multiply(NUM3, NUM4) + "</h1>";
                            assertEquals(actual, expected);
                        }

                        @Test
                        public void isDivideWorkTest1 () {
                            String actual = cc.divide(NUM1, NUM2);
                            String expected = "<h1>" + NUM1 + " : " + NUM2 + " = " + cs.divide(NUM1, NUM2) + "</h1>";
                            assertEquals(actual, expected);
                        }

                        @Test
                        public void divide () {
                            String actual = cc.divide(num1, num2);
                            String expected = "<h1>" + num1 + " : " + num2 + " = " + cs.divide(num1, num2) + "</h1>";
                            public void isDivideWorkTest2 () {
                                String actual = cc.divide(NUM3, NUM4);
                                String expected = "<h1>" + NUM3 + " : " + NUM4 + " = " + cs.divide(NUM3, NUM4) + "</h1>";
                                assertEquals(actual, expected);
                            }
                            @Test
                            public void divideWithException () {
                                assertThrows(RuntimeException.class, () -> cc.divide(num1, num2Zero));
                            }

                            @Test
                            public void divideWithExceptionTest1 () {
                                assertThrows(RuntimeException.class, () -> cc.divide(NUM1, NUM_ZERO));
                            }

                            @Test
                            public void divideWithExceptionTest2 () {
                                assertThrows(RuntimeException.class, () -> cc.divide(NUM3, NUM_ZERO));
                            }
                        }
                    }
                }
            }
        }
    }
}

