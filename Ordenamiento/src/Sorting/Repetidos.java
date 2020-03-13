import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listnames=new ArrayList<String>();
		listnames.add("Luis");
		listnames.add("Luis");
		listnames.add("Luis2");
		listnames.add("Luis2");
		
		for (int i = 0; i < listnames.size(); i++) {
			System.out.println(listnames.get(i));
		}
		
		HashSet<String> hs = new HashSet<>();
	    hs.addAll(listnames);
	    listnames.clear();
	    listnames.addAll(hs);
	    System.out.println("----------------------");
	    for (int i = 0; i < listnames.size(); i++) {
			System.out.println(listnames.get(i));
		}

	}

}
