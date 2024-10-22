package storeObjectInListAndIterateInMapAndDisplayMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
	public static void main(String[] args){
	
		List<Person> listName = new ArrayList<>();
		listName.add(new Person("Sneha", 23));
		listName.add(new Person("Shruti", 43));
		listName.add(new Person("Sony", 24));

		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<listName.size(); i++){
			map.put(listName.get(i).getName(), listName.get(i).getAge());
		}
		
		int Aver = 0;
		int total = listName.size();
		int sum = 0;
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			System.out.println("key:"+entry.getKey()+"  value:"+entry.getValue());
			sum += entry.getValue();

		} 
		System.out.println(sum/total);
	}
}
