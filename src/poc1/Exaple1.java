package poc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exaple1 {

	private static Object obj;

	public static void main(String[] args) {
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		
		// Create an ArrayList from an array
		String[] stringArray1 = { "a", "b", "c", "d", "e","f","g" };
		ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(stringArray1));
		System.out.println(arrayList1);
		
		//3. Check if an array contains a certain value
		String[] arr = { "a", "b", "c", "d", "e" };
		boolean b = Arrays.asList(arr).contains("a");
		System.out.println(b);
		
		//4. Concatenate two arrays
		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10 };
		// Apache Commons Lang library
		//int[] combinedIntArray = ArraysUtils.addAll(intArray, intArray2);
		
		//5. Declare an array inline
	//	5. Declare an array inline

//		method(new String[]{"a", "b", "c", "d", "e"});
//		
//		//6. Joins the elements of the provided array into a single String
//
//		// containing the provided list of elements
//		// Apache common lang
//		String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
//		System.out.println(j);
//		// a, b, c
//		7. Covnert an ArrayList to an array
//
//		String[] stringArray = { "a", "b", "c", "d", "e" };
//		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
//		String[] stringArr = new String[arrayList.size()];
//		arrayList.toArray(stringArr);
//		for (String s : stringArr)
//			System.out.println(s);
//		8. Convert an array to a set
//
//		Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
//		System.out.println(set);
//		//[d, e, b, c, a]
//		9. Reverse an array
//
//		int[] intArray = { 1, 2, 3, 4, 5 };
//		ArrayUtils.reverse(intArray);
//		System.out.println(Arrays.toString(intArray));
//		//[5, 4, 3, 2, 1]
//		10. Remove element of an array
//
//		int[] intArray = { 1, 2, 3, 4, 5 };
//		int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
//		System.out.println(Arrays.toString(removed));
//		One more - convert int to byte array
//
//		byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
//		 
//		for (byte t : bytes) {
//		   System.out.format("0x%x ", t);
//		}
//		
	}

}
