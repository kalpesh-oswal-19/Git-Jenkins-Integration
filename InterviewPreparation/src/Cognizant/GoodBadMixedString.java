package Cognizant;

public class GoodBadMixedString {

	public static void main(String[] args) {
		/*String str = "aaaaabc";
		String badRegex = ".*([aeiou]{3}|[^aeiou]{5}).*";
		String mixedRegex = "??aa??";
		
		if(str.matches(badRegex)) {
			System.out.println("Bad regex");
		}
		else if(str.contains("?")) {
			
		}
		*/
		
		int[] intArray = new int[]{ 1,2,3,3,2,1 };
		int c= 0;
		
		for(int i=0;i<intArray.length-1;i++)
		{
			if(intArray[i] == intArray[i+1])
			{
				continue;
			}
			else{
				c++;
			}
		}
		
		boolean consecutive = false;
		c = 0;
		for(int i = 1; i<intArray.length/2; i++) {
			
			if(intArray[i] == intArray[i+1] || intArray[i] == intArray[i-1]) {
				int temp = intArray[i];
				intArray[i] = intArray[intArray.length-i-1];
				intArray[intArray.length-i-1] = temp;
				c++;
			}
		}
		
		for(int a: intArray)
			System.out.print(a+", ");
		
		System.out.println("\nchanges: "+c);
		
		
		System.out.println("Updsate before commit");
	}
}
