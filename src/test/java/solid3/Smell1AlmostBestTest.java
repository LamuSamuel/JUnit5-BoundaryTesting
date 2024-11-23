package solid3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;


class Smell1AlmostBestTest {

    Smell1AlmostBest power  = new Smell1AlmostBest();

    @Test
    @DisplayName("Raising Zero to a positive")
    public void BaseZeroPositiveExponent(){

        int[] exponents = {2,3,4};
        int[] expectedVal = {0,0,0};
        int[] result = new int[expectedVal.length];
        int base = 0;

        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }

    @Test
    @DisplayName("Raising Zero to a negative number")
    public void baseZeroNegativeExponent(){
        int expected = (int)Math.pow(0,-1);
        int base = 0;
        int[] exponents = {2,3,4};

        int[] expectedVal = {expected,expected,expected};
        int[] result = new int[expectedVal.length];
        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }

    @Test
    @DisplayName("Raising One to a Positive Number")
    public void baseOnePositivePower(){

        int[] exponents = {3,4,5};
        int[] expectedVal = {1,1,1};
        int[] result = new int[expectedVal.length];
        int base = 1;

        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }

    @Test
    @DisplayName("Positive base raised to Positive Exponent")
    void PositiveBaseToPositivePower() {
        int[] exponents = {3, 4, 5};
        int base = 2;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);

        }
        int[] expected = {8, 16, 32};
        assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("Positive base raised to Exponent Zero")
    void PositiveBaseToExponentZero() {
        int[] exponents = {0, 0, 0};
        int base = 2;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);

        }
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("base one raise to greater power should return one")
    void baseOneRaisesToGreaterPower() {
        int[] exponents = {99, 19999,199999};
        int base = 1;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);
        }
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("Negative base with odd exponent should return Negative result")
    void NegativeBaseWithOddExponentIsnegative() {
        int[] exponents = {1, 3, 5};
        int base = -2;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);
        }
        int[] expected = {-2,-8,-32};
        assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("Negative base with even Exponent shoudl return Positive value")
    void NegativeBaseWithEvenExponentShouldReturnPositiveValue() {
        int[] exponents = {2, 4, 6};
        int base = -2;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);
        }
        int[] expected = {4,16,64};
        assertArrayEquals(expected, result);

    }
    @Test
    @DisplayName("Negative base with zero exponent should return 1")
    void NegativeBaseWithZeroExponentShouldReturnOne() {
        int[] exponents = {0, 0, 0};
        int base = -10;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);
        }
        int[] expected = {1,1,1};
        assertArrayEquals(expected, result);

    }
    @Test
    @DisplayName("Negative base with negative exponent should return undefined")
    void NegativeBaseWithNegativeExponentShouldReturnError() {
        int[] exponents = {-3};
        int base = -2;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);
        }
        int[] expected = {-1/8};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Raising one to a negative power")
    public void baseOneNegativeExponent(){
        int[] exponents = {-2,-3,-4};
        int[] expectedVal = {1,1,1};
        int[] result = new int[expectedVal.length];
        int base = 0;
        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }
    
    @Test
    @DisplayName("Positive Number raised to a negative exponent")
    public void positiveBaseNegativeExponent(){
        int[] exponents = {-2,-3,-4};
        int[] expectedVal = {(int) 0.25,(int) 0.125,(int) 0.0625};
        int[] result = new int[expectedVal.length];
        int base = 2;
        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);

    }
    @Test
    @DisplayName("Raising Zero to Zero")
    public void zeroRaisedToZero(){
        int[] exponentsList = {0,0,0,0};
        int expected = (int)Math.pow(0,0);
        int[] expectedVal = {expected,expected,expected,expected};
        int[] result = new int[expectedVal.length];
        int base = 0;
        for(int i =0;i<expectedVal.length;i++){
            result[i] = power.toPower(base, exponentsList[i]);
        }
        assertArrayEquals(expectedVal,result);
    }
}
