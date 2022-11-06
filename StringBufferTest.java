public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello SB");
		
		StringBuffer sb1 = new StringBuffer("Hello SB");
		
		StringBuffer sb2 = new StringBuffer(30);
		sb2.append("Hello SB2");
		
		System.out.println("SB: "+sb);
		System.out.println("SB1: "+sb1);
		System.out.println("SB2: "+sb2);
		
		System.out.println("SB Capacity: "+sb.capacity());
		System.out.println("SB1 Capacity: "+sb1.capacity());
		System.out.println("SB2 Capacity: "+sb2.capacity());
		
		sb.insert(5, " Updated");
		System.out.println("String buffer insert: "+sb);
		
		char[] charArr = {' ','n','e','w',' ','s','t','r','i','n','g'};
		sb.append(charArr);
		System.out.println("SB with appened array: "+sb);
		
		//String replace ------------------------------------------------------------------------------
		sb.replace(6, 13, "replace");
		System.out.println("SB new string after replace: "+sb);
		
		//string reverse ---------------------------------------------------------------------------------
		System.out.println("SB reverse: "+sb.reverse());
		System.out.println("SB reverse: "+sb.reverse());
		
		StringBuffer sb3 = new StringBuffer("Hello SB");
		System.out.println("SB3 hashcode: "+sb3.hashCode());
		
		sb3.insert(0, "Hello SB3");
		System.out.println("SB3 hashcode: "+sb3.hashCode());
		
		System.out.println("pull from remote repo");
	}
}
