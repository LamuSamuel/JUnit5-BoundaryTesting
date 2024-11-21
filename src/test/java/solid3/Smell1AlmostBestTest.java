package solid3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class Smell1AlmostBestTest {

    @Test
    @DisplayName("Positive base raised to Positive Exponent")
    void PositiveBaseToPositivePower() {
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
    void PositiveBaseToExponentZero() {
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
    void baseOneRaisesToGreaterPower() {
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

}
