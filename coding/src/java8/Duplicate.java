package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate 
{
	public static void main(String[] args) {
		List<Integer>ls=new ArrayList<>();
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(40);
		List<Integer>ls1=ls.stream().distinct().collect(Collectors.toList());
		System.out.println(ls1);
	}

}
