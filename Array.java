
public class Array {
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int sum(int[] arr, int firstIndex, int lastIndex) {
		int sum = 0;
		if ((firstIndex < 0) || (lastIndex >= arr.length) || (firstIndex > lastIndex)) {
			return -666;
		}
		for (int i = firstIndex; i <= lastIndex; ++i) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static double average(int[] arr) {
		double average = 0.0;
		double count = 0.0;
		
		for (int i = 0; i < arr.length; ++i) {
			average = average + arr[i];
			++count;
		}
		average = average / count;
		return average;
	}
	public static double average(int[] arr, int firstIndex, int lastIndex) {
		double average = 0.0;
		double count = 0.0;
		
		if ((firstIndex < 0) || (lastIndex >= arr.length) || (firstIndex > lastIndex)) {
			return -666.0;
		}
		for (int i = firstIndex; i <= lastIndex; ++i) {
			average = average + arr[i];
			++count;
		}
		average = average / count;
		return average;
	}
	public static int maxValue(int[] arr) {
		int maxVal = 0;
		for(int i = 0; i < arr.length; ++i) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
		int maxVal = 0;
		if ((firstIndex < 0) || (lastIndex >= arr.length - 1) || (firstIndex > lastIndex)) {
			return -666;
		}
		for (int i = firstIndex; i <= lastIndex; ++i) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	public static int indexOfFirstMaxValue(int[] arr) {
		int count = 0;
		int maxVal = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > arr[maxVal]) {
				count = i;
			}
		}
		return count;
	}
	public static int indexOfFirstMaxValue(int[]arr, int firstIndex, int lastIndex) {
		int count = 0;
		int maxVal = 0;
		if ((firstIndex < 0) || (lastIndex >= arr.length) || (firstIndex > lastIndex)) {
			return -1;
		}
		for (int i = firstIndex; i <= lastIndex; ++i) {
			if (arr[i] > arr[maxVal]) {
				count = i;
			}
		}
		return count;
	}
	public static int numberOfBelowAverageElements(int[] arr) {
		double count = 0.0;
		double average = 0.0;
		int num = 0;
		for (int i = 0; i < arr.length; ++i) {
			average = average + arr[i];
			++count;
		}
		average = average / count;
		for (int i = 0; i < arr.length; ++i) {
			if(arr[i] < average) {
				++num;
			}
		}
		return num;
	}
	public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex) {
		double count = 0.0;
		double average = 0.0;
		int num = 0;
		
		if ((firstIndex < 0) || (lastIndex >= arr.length) || (firstIndex > lastIndex)) {
			return -666;
		}
		
		for (int i = 0; i < arr.length; ++i) {
			average = average + arr[i];
			++count;
		}
		average = average / count;
		for (int i = firstIndex; i <= lastIndex; ++i) {
			if(arr[i] < average) {
				++num;
			}
		}
		return num;
	}
	public static void rotateElements(int[] arr) {
		int last = arr[arr.length - 1];
		for(int i = arr.length - 1; i > 0; --i) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
	}
	public static void rotateElements(int[] arr, int rotationCount) {
		int last = arr[rotationCount - 1];
		for(int i = 1; i < arr.length; ++i) {
			arr[i] = arr[rotationCount];
		}
		arr[0] = last;
	}
	public static void reverseArray(int[] arr) {
		for(int i = 0; i <= arr.length; ++i) {
			arr[i] = arr[arr.length - (i + 1)];
		}
	}
	public static void main(String[] args) {
		
	}
}

