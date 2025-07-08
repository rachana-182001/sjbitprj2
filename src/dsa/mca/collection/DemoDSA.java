package dsa.mca.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoDSA {

	public static void main(String[] args) {
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
