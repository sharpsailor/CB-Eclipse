package L_17ArrayList;
import java.util.*;
public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(1);
		list.add(-19);
		list.add(17);
		System.out.println(list);
		System.out.println(list.size());
		list.add(1,20);
		System.out.println(list);  
		System.out.println(list.remove(0));
	}

}
