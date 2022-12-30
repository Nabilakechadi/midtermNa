package string.problems;
import org.junit.Assert;

import java.util.Arrays;


public class UnitTestingStringProblem {

    //Apply Unit Test into all the methods in this package.

    /*}
}*/
    public static void main(String args[]) {

        String str1="cat";




            Anagram ana = new Anagram();
String expectedResult = str1;

String  wordTest= str1;
            Assert.assertEquals(expectedResult , ana.getClass(wordTest));


        }
    }

    /*public static void main(String args[]) {
        String str = "david";
        StringBuilder sb = new StringBuilder(str);

            String revStr = sb.reverse().toString();
        Palindrome palindrome = new Palindrome();
        Assert.assertEquals(true, true);
    }
}*/


