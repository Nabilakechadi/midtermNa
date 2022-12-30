package math.problems;
import java.util.*;
import java.io.*;
public class PrimeNumber {


		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


			static boolean checkPrime(int n)
			{
				boolean isPrime = true;


				for (int i = 2; i <=Math.sqrt(n) ; i++) {
					if(n%i==0) {
						isPrime = false;
						break;
					}
				}


				if(isPrime){
					return true;
				}else{
					return false;
				}
			}


			public static void main(String[] args) {


				int numberOfPrimes = 0;


				ArrayList<Integer> arrList = new ArrayList<>();


				for(int i=2; i<=1000000; i++)
				{

					if(checkPrime(i)){

						arrList.add(i);


						numberOfPrimes++;
					}
				}

				// display the number of prime numbers in the given range
				System.out.println(numberOfPrimes);

				// now, retrieve the prime number from the list and store them into a text file
				try
				{

					FileWriter writer = new FileWriter("primeNumbers.txt");


					for(int i=0; i<arrList.size(); i++)
					{

						writer.write(arrList.get(i) + ", ");

						if((i+1) % 10 == 0){
							writer.write("\n");
						}
					}

					writer.close();

					System.out.println("Data successfully wrote to the file!");


				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		}



