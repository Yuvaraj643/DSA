package DSA;

public class Strings {
	public static void RemoveVowels(String str) {
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch =='e' || ch== 'i' || ch=='o' ||  ch=='u') {
				continue;
			}
			System.out.print(ch + " ");
		}
		
	}
	
	public static void ReverseVowels(String str) {
		char[] s = str.toCharArray();
		int i =0;
		int j = s.length-1;
		
		while(i<j) {
			while(s[i]!= 'a' && s[i]!= 'e' && s[i]!= 'i' && s[i]!= 'o' && s[i]!= 'u') {
				i++;
			}
			while(s[j]!= 'a' && s[j]!= 'e' && s[j]!= 'i' && s[j]!= 'o' && s[j]!= 'u') {
				j--;
			}
			while(i>=j) {
				break;
			}
			char ch = s[i];
			s[i] = s[j];
			s[j] = ch;
			i++;
			j--;
		}
		for (int i1=0;i1<s.length;i1++){
			System.out.print(s[i1]);
		}
	}
	
	public static void UpperCasetoLowerCase ( String str) {
		char []  s = str.toCharArray();
		
		for(int i =0;i<s.length;i++) {
			char ch = s[i];
			
			if(ch>='A' && ch<='Z') {
				char ansch = (char)(ch - 'A' + 'a');
				s[i] = ansch;
			}
		}
		for (char c : s) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		String str = "Welcome";
		RemoveVowels(str);
		String str1 = "Welcome to Java";
		ReverseVowels(str1);
		UpperCasetoLowerCase(str1);
		

	}

}
