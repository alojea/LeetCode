public class RevertVowels {
	
	public static void main(String[] args) {
		
		String string1 = "hello";
		String string2 = "leetcode";
		String string3 = "ai";
		String string4 = "aA";
		
		System.out.print(reverseVowels(string1));
		System.out.print(reverseVowels(string2));
		System.out.print(reverseVowels(string3));
		System.out.print(reverseVowels(string4));
	}
	
	 public static String reverseVowels(String s) {
		 char[] charArray = s.toCharArray();
		 int auxLength = charArray.length-1;
		 for(int i=0; i<charArray.length; i++) {
			 while(i < auxLength) {
				 if(isVowel(charArray[i])) {
					 if(isVowel(charArray[auxLength])){
						 char aux = charArray[i];
						 charArray[i] = charArray[auxLength];
						 charArray[auxLength] = aux;
						 auxLength--;
						 break;
					 }
					 auxLength--;
				 } else {
					 break;
				 } 
			 }
		 }
		 return new String(charArray);
	        
	 }
	 
	 private static boolean isVowel(char letter) {
		 if(letter == 'a' || letter =='e' || letter == 'i' || letter == 'o' || letter == 'u' ||
				 letter == 'A' || letter =='E' || letter == 'I' || letter == 'O' || letter == 'U') {
			 return true;
		 }
		 return false;
	 }
}
