package powerpackage;

public class PowerFinder {
    public static long calculate(int base, int power) {
        long result = 1L;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
