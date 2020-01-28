package list;
import java.util.ArrayList;
public

 class list {
	public static void main(String[]args) {
		ArrayList <String> list1= new ArrayList<>();
		list1.add("Satyanarayana");
		list1.add("Chaitanya");
		list1.add("kalyan");
		ArrayList<String>list2=new ArrayList<>();
		list2.add("Raja");
		list1.addAll(list2);
		System.out.println(list1);
		
		
	}
}
