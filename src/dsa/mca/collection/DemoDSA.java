package dsa.mca.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoDSA {

	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(100);
		l.addLast(200);
		System.out.println(l);
		
		
		
		TreeSet<Integer> h=new TreeSet<Integer>();
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(300);
		System.out.println(h);
		
		
		
		ArrayList<Integer>n=new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(3);
		n.addFirst(78);
		n.add(2,400);
		n.sort(null);
		System.out.println(n);
		System.out.println(n.get(3));







		HashMap<Integer,String> d=new HashMap<Integer,String>();
		d.put(100, "desktop");
		d.put(101, "ram");
		d.put(102, "laptop");
		d.put(103, "mouse");
		d.put(200, "desktop");
		d.put(100, "mouse");
	    System.out.println(d);
	}

}
