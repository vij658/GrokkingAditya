package Chapter4;



import java.util.Arrays;

public class AddNumbers {

	public static void main(String[] args) {
		int[] arr = { 0, -1, 4, 3, 8 };
		int sum = calcSum(arr);
		System.out.println(sum);

		sum = recCalcSum(arr, arr.length);
		System.out.println("rec" + sum);
		
		
		System.out.println("sumOfArray" + sumOfArray(arr, arr.length-1));

	}
	
	

	static int calcSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

//	static int recCalcSum(int arr[]) {
//		int sum = 0;
//		int i = arr.length - 1;
//		if (i > -1) {
//			sum = arr[i] + recCalcSum(arr);
//			i--;
//			return sum;
//		}
//		return 0;
//	}
	
	
	static int recCalcSum(int arr[], int n) {
		
		System.out.println(n);
		if (n < 1) 
			return arr[n];
		else
		return arr[n-1] + recCalcSum(arr, n-1);
		
	}
	
	public static int sumOfArray(int[] a, int n) {
	    if (n == 0)
	        return a[n];
	    else
	        return a[n] + sumOfArray(a, n-1);
	}
	
	private static int sumOfArray(int[] array) {

        if (1 == array.length) {
            return array[array.length - 1];
        }

        return array[0] + sumOfArray(Arrays.copyOfRange(array, 1, array.length));
    }
	
//int[] arr = { 0, -1, 4, 3, 8 };

//4,3
//3,2
//2,1
//1,0




	
	
}
