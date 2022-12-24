package datastructure;
import  java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		/*public static void main(String[] args)
		{
			ArrayList<String> list1= new ArrayList<String>();
			System.out.println("Size of ArrayList: "+list1.size());
			//Adding the elements
			list1.add("Java");
			list1.add("JDBC");
			System.out.println("Elements of first ArrayList: "+al);

			ArrayList<String> al2 = new ArrayList<String>();
			al2.add("EJB");
			al2.add("Struts");
			//Adding the both array
			al2.addAll(al
			System.out.println("Elements of second ArrayList: "+al2);
			//remove the element
			al2.remove("EJB");
			System.out.println("Elements of ArrayList after deletion: "+al2);
			System.out.println("Size of ArrayList: "+al2.size());

			//Retriving 2nd index element
			System.out.println("The element at 2nd index is: "+al2.get(2));
		}
	}

		List<String> list = new ArrayList<String>();

//Insert ten elements into list
		list.add("One");
		list.add("Two");
		list.add("Thee");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Nine");
		list.add("Ten");

		System.out.println("FOR EACH LOOP");

		for(String s : list) {
			System.out.println(s);
		}

		System.out.println("WHILE WITH ITERATOR");

		Iterator<String> it = list.listIterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it = list.listIterator();
		list.remove(7);
		System.out.println("REMOVE ELEMENT");
		while(it.hasNext()) {
			if(it.next().contentEquals("Eight"))
				it.remove();
		}
		it = list.listIterator();
		System.out.println("AFTER REMOVING EIGHT");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}*/

		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		list.add("ten");

			System.out.println(list);
			list.remove(6);
		System.out.println(list);
		}
	}



