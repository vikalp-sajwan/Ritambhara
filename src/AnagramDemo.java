import api.Anagram;
public class AnagramDemo {
	
	public static void main(String args[]){
		
		Anagram ana = new Anagram();
		
		ana.setStr1("tom riddle  marvolo");
		ana.setStr2("i am lord voldemort");
		
		if(ana.checkAnagram())
			System.out.println("Anagram");
		else
			System.out.println("NOT anagram");	
		
		ana.setStr1("abc");
		ana.setStr2("cbaa");
		
		if(ana.checkAnagram())
			System.out.println("Anagram");
		else
			System.out.println("NOT anagram");	
		
		
	}
}
