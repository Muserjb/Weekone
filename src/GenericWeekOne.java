import java.util.Collection;

public class GenericWeekOne {
        public static <T extends Number> int countPrimeElements(Collection<T> collection) {
            int count = 0;
            for (T element : collection) {
                if (isPrime(element.intValue())) {
                    count++;
                }
            }
            return count;
        }

        private static boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


