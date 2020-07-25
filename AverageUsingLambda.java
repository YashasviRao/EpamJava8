package epam;

import java.util.*;
public class AverageUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(31);
		list.add(24);
		list.add(2);
		list.add(13);
		list.add(27);
		list.add(31);
		System.out.println("Average of given list : "+average(list));
	}
	static Double average(List<Integer> list)
	{
		return list.stream().mapToDouble(i -> (double)i).average().getAsDouble();
	}
}

/*
OUTPUT:
 Average of given list : 21.333333333333332
*/