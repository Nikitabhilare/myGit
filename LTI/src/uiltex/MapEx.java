package uiltex;
import java.util.*;

import java.util.Map;

//key can't be duplicated, data can be duplicated.

//map has no iterator method available. so convert to set and then iterator
//entry is used since value is getting printed as key, val. but we want only value. so we use entry
public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mp=new HashMap();
		
		mp.put(1, "Niki");
		mp.put(2, "Chaitsz");
		mp.put(3, "Rinks");
		
		System.out.println(mp);
		
		Set s=mp.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry me= (Map.Entry) it.next();
            System.out.println(me.getValue());
//            System.out.println();
		}
		

	}

}
