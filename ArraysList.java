package DSA;
import java.util.*;

public class ArrayLists {
	public static ArrayList<Integer> RemoveEven(ArrayList<Integer>list) {
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i) % 2 ==0) {
				list.remove(i);
			}
		}
		return list;
	}

    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // Add elements
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    ArrayList<Integer> result = RemoveEven(list);
    System.out.println(result);

    //add at index
    list.add(0,40);
    
    //get
    System.out.print(list.get(2));
    
    //set
    list.set(2, 50);
    System.out.print(list);
    System.out.print(list.get(2));
    
    //remove
    list.remove(1);
    System.out.print(list);
    
    //size
    System.out.println(list.size()); 

    
    }
}
