package poc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class StringProblems {
	public static void main(String[] args) {
		
	}

	public int countNoOfWords(String str) {
		if(str == null || str.isEmpty())
		{
			return 0;
		}
		else
		{
			String[] arr= str.trim().split("\\s|\\t|\\,|\\;|\\:");
			int count =0;
			for(int i=0; i<arr.length; i++)
			{
				count++;
			}
			return count;
		}
	}
	
	public String WordsinString(String str) {
		if(str == null || str.isEmpty())
		{
			return null;
		}
		else
		{
			// String[] arr= str.trim().split("[\\s\\t\\,\\;\\:]+");
			 String[] arr= str.trim().split("\\W");
			return Arrays.toString(arr);
		}
	}

	public String reveseofString(String str) {
		if(str == null || str.isEmpty())
		{
			return null;
		}
		else
		{
			String[] rev =str.trim().split("\\W");
//			StringBuilder res= new StringBuilder(Arrays.deepToString(rev));
//			return res.reverse();
			String reverse="";
			for(int i=rev.length-1;i >=0 ; i--)
			{
				reverse += rev[i]+" ";
			}
			return reverse;
		}
			
	}

	public String firstRepetedWord(String str1) {
		String[] arr= str1.trim().split("\\W");
		int i,j;
		for(i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}
			return arr[i];
		}
//		HashSet<String> hs= new HashSet<String>();
//		for(int i=0; i<arr.length; i++)
//		{
//			String word= arr[i];
//			
//			if(hs.contains(word))
//			{
//				return word;
//			}
//			else
//				hs.add(word);
//		}
		return "";
		
	}

	public String lastrepetedword(String str1) {
		List<String> ls=new ArrayList<>();
		String[] arr = str1.trim().split("\\W");
		int i,j;
		for(i=0;i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					ls.add(arr[i]);
				}
			}
		}
		
		return ls.get(ls.size()-1);
	}

	public String countCharacter(String str2) {
		char[] arr= str2.toCharArray();
		HashMap<Character, Integer> map= new  HashMap<Character, Integer>();
		for(char ch : arr)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		String result="";
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			result += entry.getKey()+""+entry.getValue()+" ";
		}
		return result;
		
	}

	public boolean isAnagram(String abc1, String abc2) {
		if(abc1.length() != abc2.length())
		{
			return false;
		}
		else
		{
			char[] arr1= abc1.toCharArray();
			char[] arr2= abc2.toCharArray();
			Arrays.parallelSort(arr1);
			Arrays.parallelSort(arr2);
			
			for(int i=0; i< arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
				{
					return false;
				}
				
			}
			return true;
		}
		
		
		
	}

	public boolean ispalindrome(String str) {
//		for(int i=0; i<str2.length()/2; i++)
//		{
//			if(str2.charAt(i) != str2.charAt(str2.length()-i))
//			{
//				return false;
//			}
//				
//		}
//		return true;
		
		 // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
		
	}

	public String[] repetedWordsinString(String str1) {
		String[] arr= str1.trim().split("\\W");
		HashSet<String> hs= new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			String word = arr[i];
			hs.add(word);
		}
		String[] result=new String[hs.size()];
		int numb=0;
		for(String str:hs)
		{
			result[numb++]=str;
		}
		return result;
	}

	public String largestPalindrom(String str3) {
		String[] words= str3.trim().split("\\W");
		ArrayList<String> al= new ArrayList<String>();
		for(int i=0; i<words.length; i++) {
			boolean check =ispalindrom(words[i]);
			if(check)
			{
				al.add(words[i]);
			}
		}
		int length = al.get(0).length();
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i).length() > length)
			{
				length= al.get(i).length();
			}
			
		}
		return "";
		
	}

	private boolean ispalindrom(String str) {
		 int i = 0, j = str.length() - 1; 
		  
	        // While there are characters toc compare 
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	  
	        // Given string is a palindrome 
	        return true; 
	}

	

}


class Solution
{
	public static void main(String[] args) {
		
		StringProblems obj = new StringProblems();
		String str="i am here	for you,can you imagin,this id is totally:valid so you hav to be careful";
		String str1="you are respoencible for this situation if you cant handle then you are relly are balisj ";
		
		int noOfwords = obj.countNoOfWords(str);
		System.out.println("No of word in the given String : "+noOfwords);
		String words=obj.WordsinString(str);
		System.out.println("words in the String : "+words);
		
		String reveseString= obj.reveseofString(str);
		System.out.println("Reverse String of given String : "+reveseString);
		
		String[] result=obj.repetedWordsinString(str1);
		System.out.println(Arrays.toString(result));
		
		String firstRepeted = obj.firstRepetedWord(str1);
		System.out.println("First repeted word in the given string is "+firstRepeted);
		
		String lastrepetred = obj.lastrepetedword(str1);
		System.out.println("Last Repeted word in the given String is "+lastrepetred);
		
		String str2="abcnsdnjcmkuyarfuvyjhbjyrdckvg";
		String res=obj.countCharacter(str2);
		System.out.println("Counted character in character and integer is given as : "+res );
		
		String abc1="listen";
		String abc2="silent";
		boolean anagram = obj.isAnagram(abc1, abc2);
		boolean palindrem=obj.ispalindrome(str2);
		System.out.println("given String is anagram :"+anagram +" , is given string is palindrom : "+palindrem);
		
		String str3 = "if it is true heeh ";
		String largestPalindrom=obj.largestPalindrom(str3);
		System.out.println("Largest palindrom in given String is : "+largestPalindrom);
		
		
		
		int[] arr= {20,12,23,25,12,45,65,85,652,32,45,20,12,36};
	}
}