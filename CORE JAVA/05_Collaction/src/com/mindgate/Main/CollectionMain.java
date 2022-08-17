package com.mindgate.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Empolyee;

public class CollectionMain {
public static void main(String[] args) {
	List<String> namelist =new ArrayList<>();
	System.out.println(namelist.size());
	namelist.add("amol");
namelist.add("raj");
namelist.add("rohit");
namelist.add("viraj");
namelist.add("ajay");

namelist.add("amol");

namelist.add("raj");
System.out.println(namelist);
namelist.remove(3);
System.out.println("After remove");
System.out.println(namelist);
System.out.println(namelist.size());
List<Empolyee> emplist =new ArrayList<>();
Empolyee emp1 =new Empolyee("ram", 10000 ,101);
Empolyee emp2 =new Empolyee("shyam", 11000 ,102);
Empolyee emp3 =new Empolyee("vijam", 10000 ,103);
emplist.add(emp3);
emplist.add(emp2);
emplist.add(emp1);
for(Empolyee e: emplist)
{
	System.out.println(e);
}
System.out.println(emplist);
System.out.println();
Set<String> set =new HashSet<>();
set.add("Amol");
set.add("101");
set.add("pawar");
set.add(null);
System.out.println(set);
System.out.println();
;
SortedSet<String> sort = new TreeSet<>()
;
sort.add("amoll");
sort.add("yash")
;
sort.add("kumar");
sort.add("hash");
System.out.println(sort);

System.out.println("...............................................................................................................")
;

HashMap<Integer, String> empmap =new HashMap<>();
empmap.put(1, "atul");
empmap.put(67, "kumar");
empmap.put(3, "vipul");
empmap.put(4, "dinesh");
System.out.println(empmap);
Integer i =50;
System.out.println(i.hashCode());
System.out.println("_________________________________________________________________________________________________________________________");
SortedMap <Integer,String> sortedmap=new TreeMap<>();
sortedmap.put(1, "test 1");
sortedmap.put(2, "ammol 2");
System.out.println(sortedmap);


}

}