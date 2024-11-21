package solid3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class Smell1AlmostBestTest {

    @Test
    @DisplayName("Positive base raised to positive power")
    void PositiveBaseToPositivePower()  {
        Smell1AlmostBest power = new Smell1AlmostBest();
        int[] exponents = {3, 4, 5};
        int base = 2;
        int[] result = new int[exponents.length];
        for (int i=0;i< exponents.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);

        }
        int [] expected = {8,16,32};
        assertArrayEquals(expected,result);
    }
}
