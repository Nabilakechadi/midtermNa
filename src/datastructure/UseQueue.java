package datastructure;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class UseQueue {

	public static void main(String[] args) {

				Queue<Integer> q = new LinkedList<>();


				int i = 0;
				while (i < 5) {
					q.add(i);
					i++;
				}


				System.out.println("Elements of queue : ");
				for (int num : q)
					System.out.println(num + " ");

				System.out.println("");


				int head = q.peek();
				System.out.println("head of queue-" + head);


				int first = q.remove();
				System.out.println("removed element-" + first);

				System.out.println("Elements of queue : ");
				Iterator it = q.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				System.out.println("");

				int pollelement = q.poll();
				System.out.println("Queue's head: " + pollelement);

			}
		}


