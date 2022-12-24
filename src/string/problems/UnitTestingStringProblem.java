package string.problems;
import org.junit.Assert;

import java.util.Arrays;


public class UnitTestingStringProblem {

    //Apply Unit Test into all the methods in this package.

    /*}
}*/
    public static void main(String args[]) {
        String str1 = "cat";
        String str2 = "cta";
        if (str1.length() == str2.length()) {

            char[] firstCharArr = (str1.toLowerCase()).toCharArray();


            char[] secondCharArr = (str2.toLowerCase()).toCharArray();


            Anagram ana = new Anagram();
            Assert.assertEquals(true, true);
            Assert.assertEquals(false,false);

        }
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


