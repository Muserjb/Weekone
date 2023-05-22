import java.util.Collection;
import java.util.Arrays;
import java.util.List;

public class Palindroms {


        public static <T> int countPalindromeElements(Collection<T> collection, PalindromeChecker<T> checker) {
            int count = 0;
            for (T element : collection) {
                if (checker.isPalindrome(element)) {
                    count++;
                }
            }
            return count;
        }



    }





class Mainn {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("level", "hello", "madam", "world", "hahaha");

        PalindromeChecker<String> palindromeChecker = new PalindromeChecker<String>() {
            @Override
            public boolean isPalindrome(String element) {
                StringBuilder reverse = new StringBuilder(element).reverse();
                return element.equals(reverse.toString());
            }
        };



        int palindromeCount = Palindroms.countPalindromeElements(words, palindromeChecker);
        System.out.println(palindromeCount);  // if am correct we get : 3  as output
    }
}



interface PalindromeChecker<T> {
    boolean isPalindrome(T element);
}