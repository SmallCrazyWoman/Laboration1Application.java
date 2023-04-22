package Laboration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    Calculator Calculator = new Calculator();

    @Test
    void TwoPlusTwoEqualFour() {

        Assertions.assertEquals(4, Calculator.add(2, 2));

    }

    @Test
    void TwoPlusTwoNotEqualFive() {
        Assertions.assertNotEquals(5, Calculator.add(2, 2));

    }

    @Test
    void TwoMinusFourEqualTwo() {
        Assertions.assertEquals(2, Calculator.subtract(4, 2));

    }

    @Test
    void TwoMinusFourNotEqualFour() {
        Assertions.assertNotEquals(4, Calculator.subtract(4, 2));

    }

    @Test
    void TwoTimesFourEqualEight() {
        Assertions.assertEquals(8, Calculator.multiply(4, 2));

    }

    @Test
    void TwoTimesFourNotEqualTwo() {
        Assertions.assertNotEquals(2, Calculator.multiply(4, 2));

    }

    @Test
    void FourDevidedbyTwoEqualTwo() {
        Assertions.assertEquals(2, Calculator.divide(4, 2));

    }

    @Test
    void TwoDevidedbyFourEqualZeroPointFive() {
        Assertions.assertEquals(0.5, Calculator.divide(2, 4));

    }

    @Test
    void TwoDevidedbyFourNotEqualTwo() {
        Assertions.assertNotEquals(2, Calculator.divide(2, 4));

    }

    @Test
    void SquareRootOfNineShouldEqualsThree() {
        Assertions.assertEquals(3, (Calculator.squareRootOf(9)));

    }


    @Test
    void AreaOfNineShouldEqualsTwoHundredFiftyFourPointFourtySeven() {

        Assertions.assertEquals(254.47, (Calculator.getArea(9)));
    }

}
