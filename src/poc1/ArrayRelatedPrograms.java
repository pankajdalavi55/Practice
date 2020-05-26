package poc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRelatedPrograms {

	public static void main(String[] args) {
		ArrayDemo obj =new ArrayDemo();
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10); al.add(12); al.add(35); al.add(25);al.add(6); al.add(74); al.add(54); al.add(26); al.add(62);
		
		Object[] arr= al.toArray();
		System.out.println("Inpute Array is: "+Arrays.deepToString(arr));
		
		// Selection Sort
		int[] res= obj.selectionSort(arr);
		System.out.println("selection Sorting Alogorithm Result: "+Arrays.toString(res));
		
		//Bubble Sort
		int[] res1= obj.bubbleSort(arr);
		System.out.println("selection Sorting Alogorithm Result: "+Arrays.toString(res1));
		
		//Insertion Sort
		int[] res2= obj.insertionSort(arr);
		System.out.println("selection Sorting Alogorithm Result: "+Arrays.toString(res2));
		
		//Merge Sort
		int[] res3= obj.mergeSort(arr);
		System.out.println("selection Sorting Alogorithm Result: "+Arrays.toString(res3));
		
		//Quick Sort
		int[] res4= obj.quickSort(arr);
		System.out.println("selection Sorting Alogorithm Result: "+Arrays.toString(res4));
		
		//Left Shift
		int n=3;
		int[] res5 = obj.leftShift(arr, n);
		System.out.println("left Shift of the Array "+ Arrays.toString(res5));
		
		//Right Shift
		int[] res6= obj.rightShift(arr, n);
		System.out.println("left Shift of the Array "+ Arrays.toString(res6));
		
		//find the min and max no in the array
		int min = obj.minNumber(arr);
		int max = obj.maxNumber(arr);
		System.out.println("the maximum no of "+max +"the minimum no "+min);
		
		//second largest and smallest number in the array
		int secondMin = obj.secondLargest(arr);
		int secondMax = obj.secondMinimum(arr);
		System.out.println("second largest element in the array :"+ secondMax+ " Second minimum element in the array :"+secondMin);
		
		//add first two element in the array
		int[] res7 = obj.firstTwo(arr);
		System.out.println( "Consecutive addition of two elements :"+Arrays.toString(res7));
		
		//find the sum of two element is target elements
		int target = 100;
		int count = obj.countSumOfTargetElement(arr);
		
		// find the sum of all the elements in the array
		int sum= obj.sumOfArray(arr);
		System.out.println("Sum of elements in the array is : "+sum);
		
		//find the elements which are divisible by 2, 3, 5 and more than 20
		List<Integer> list = obj.divAndMoreThanNumber(arr);
		System.out.println("Solution of problem is "+list);
		
		//
		
	}

}
class ArrayDemo
{

	public int[] selectionSort(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> divAndMoreThanNumber(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public int sumOfArray(Object[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int countSumOfTargetElement(Object[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] firstTwo(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public int secondMinimum(Object[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int secondLargest(Object[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int maxNumber(Object[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int minNumber(Object[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] rightShift(Object[] arr, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] leftShift(Object[] arr, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] quickSort(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] mergeSort(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] insertionSort(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] bubbleSort(Object[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	
}