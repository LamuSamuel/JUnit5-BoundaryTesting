package solid3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
