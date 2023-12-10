package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Integer arr[] = {34,12,67,55,23,11};
	//	Stream<Integer>stream1 = Arrays.stream(arr);
	//	stream1.forEach((element)->{System.out.println(element);});
	//	stream1.forEach((element)->{System.out.println(element);});
     //   stream1.forEach(System.out::println);
        
        List list = Arrays.asList(arr);
        Stream<Integer>stream2 = list.stream();
  //      stream2.map((data)->{ System.out.println();});
          stream2.filter((data)->{ return data > 20;});
          
        
	}

}
