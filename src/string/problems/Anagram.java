package string.problems;
import java.util.Scanner;


import java.util.Arrays;


public class Anagram {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);


            System.out.print("Enter first string: ");
            String firstStr = scan.nextLine();


            System.out.print("Enter second string: ");
            String secondStr = scan.nextLine();


            if (firstStr.length() == secondStr.length()) {

                char[] firstCharArr = (firstStr.toLowerCase()).toCharArray();


                char[] secondCharArr = (secondStr.toLowerCase()).toCharArray();


                Arrays.sort(firstCharArr);


                Arrays.sort(secondCharArr);


                if (Arrays.equals(firstCharArr, secondCharArr)) {

                    System.out.println(firstStr + " and " + secondStr + " are anagram");
                }

                else {

                    System.out.println(firstStr + " and " + secondStr + " are not anagram");
                }
            }

            else {

                System.out.println(firstStr + " and " + secondStr + " are not anagram");
            }
        }
    }


