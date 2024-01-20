package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber 
{
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(20);
		ls.add(5);
		ls.add(30);
		ls.add(15);
		ls.add(26);
		ls.add(51);
		ls.add(28);
		List<Integer>ks=ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ks);
		
	}

}
