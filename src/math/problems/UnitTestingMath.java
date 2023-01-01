package math.problems;
import java.util.Arrays;
import java.util.Scanner;
public class UnitTestingMath {
    class Anagram {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first String:");
            String str1 = sc.nextLine();
            System.out.print("Enter second String:");
            String str2 = sc.nextLine();
            if (str1.length() == str2.length()) {
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);
                boolean result = Arrays.equals(charArray1, charArray2);
                if (result) {
                    System.out.println(str1 + " and " + str2 + "are anagram.");
                } else {
                    System.out.println(str1 + " and " + str2 + "are not anagram.");
                }
            } else {
                System.out.println(str1 + " and " + str2 + "are not anagram.");
            }
        }
    }
}





      /*  int num = 5;

            Assert.assertEquals(120, Factorial.multiplyNumbers(num));
        }
    }*/

  /*  public void setUp() throws Exception {
       Factorial = new Factorial (5, 120);
    }
    @Test
    public void multiplyNumbers(int num ) {
        Assert.assertEquals(17, Factorial());
    }
}*/


   /*rivate static Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculate() {
      long expected=2;
      long actual;

        assertEquals(expected, fibonacci.calculate(2));
    }
}*/





