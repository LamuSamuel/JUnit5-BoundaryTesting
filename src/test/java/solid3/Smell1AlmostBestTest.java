package solid3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class Smell1AlmostBestTest {

    @Test
    @DisplayName("Positive base raised to Positive Exponent")
    void PositiveBaseToPositivePowerIsPositive() {
        Smell1AlmostBest power = new Smell1AlmostBest();
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
    void PositiveBaseToExponentZeroIsOne() {
        Smell1AlmostBest power = new Smell1AlmostBest();
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
    void baseOneRaisesToGreaterPowerIsOne() {
        Smell1AlmostBest power = new Smell1AlmostBest();
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
        Smell1AlmostBest power = new Smell1AlmostBest();
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
        Smell1AlmostBest power = new Smell1AlmostBest();
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
        Smell1AlmostBest power = new Smell1AlmostBest();
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
    @DisplayName("Negative base with negative exponent should return one")
    void NegativeBaseWithNegativeExponentShouldReturnError() {
        Smell1AlmostBest power = new Smell1AlmostBest();
        int[] exponents = {-3};
        int base = -7937;
        int[] result = new int[exponents.length];
        for (int i = 0; i < exponents.length; i++) {
            result[i] = power.toPower(base, exponents[i]);
        }
        int[] expected = {1};
        assertArrayEquals(expected, result);

    }

}
