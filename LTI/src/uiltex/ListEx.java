/**

collection hierarchy:

list          set             queue
LL            hashSet         priorityQueue
arrayList     linkedHashset
vector        treeSet
stack

map:
hashmap
treemap
linkedhashmap

enumerator:
iterator

collection:
add() addAll() clear()

*/
package uiltex;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListEx {
	public static void main(String[] args) {
//		List l=new ArrayList();
		LinkedList l= new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
//		l.add("sandy");
		
		System.out.println(l);
		
		l.addFirst(50);
		System.out.println(l);
		
		l.addLast(90);
		System.out.println(l);
		
/*		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
*/		
		
		ListIterator it=l.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.hasPrevious());
			System.out.println(it.hasNext());
			System.out.println(it.previousIndex());
			System.out.println(it.nextIndex());
			
		}
		
	}
}