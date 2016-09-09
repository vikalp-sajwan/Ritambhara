package api;

import java.util.HashMap;

public class Anagram {
	
	private String str1, str2;
	
	
		public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public boolean checkAnagram(){
		if(str1.length() != str2.length())
			return false;
		else{
			HashMap<Character, Integer> strHashMap = new HashMap<Character, Integer>();
			for (char c : str1.toCharArray()) {
				
				if(strHashMap.get(c) == null)
					strHashMap.put(c, 1);
				else
					strHashMap.put(c, strHashMap.get(c)+1);
			}
			
			for (char c : str2.toCharArray()) {
				
				if(strHashMap.get(c) == null)
					return false;
				else{
						if(strHashMap.get(c) == 1)
							strHashMap.remove(c);
						else
							strHashMap.put(c, strHashMap.get(c)-1);
					}
			}
			
			if(strHashMap.isEmpty())
				return true;
			else 
				return false;
		}
	}
	
	
}
