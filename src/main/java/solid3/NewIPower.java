package solid3;

import java.util.Map;
import java.util.HashMap;

public interface NewIPower {
    int toPower(int n, int pow);
}

class NewPowerSimple implements NewIPower {
    @Override
    public int toPower(int n, int pow) {
        if (pow == 0){
            return 1;
        }
        int res = 1;
        for (int i = 0; i < pow;i++){
            res = res *n;
        }
        return res;
    }
}

class NewPowerCached implements IPower {
    private static Map<Integer, Map<Integer, Integer>> __cache = new HashMap<Integer, Map<Integer, Integer>>();

    // resolves the inefficiency in AlmostBest
    @Override
    public int toPower(int n, int pow) {
        Map<Integer, Integer> entry = __cache.get(n);

        if (entry == null) {
            entry = new HashMap<Integer, Integer>();
        }
        return toCachedPower(entry, n, pow);
    }

    // The contract here is we know there is a cache entry so no check required
    // (DBC)
    private int toCachedPower(Map<Integer, Integer> e, int n, int pow) {
        Integer res = null;
        if (pow == 0) {
            res = 1;
        } else {
            res = e.get(pow);
            if (res != null) {
                return res;
            } else {
                res = n * toCachedPower(e, n, pow - 1);
                e.put(pow, res); // saves each intermediate result in the cache
            }
        }
        return res;
    }
}

