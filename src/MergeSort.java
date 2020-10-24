
public class MergeSort<E extends Comparable<E>> {
	
	private E[] arr;
	
	//constructor
	public MergeSort(E[] arr) {
		this.arr = arr;
	}
	
	/**
	 * sort the entire array
	 * @param arr
	 */
	public void sort(E[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	/**
	 * sort the array in specific indexes
	 * @param low - start index
	 * @param high - end index
	 */
	public void sort(int low, int high) {
		sort(arr, low, high);
	}
	
	
	/**
	 * the actuall Merge Sort algorithm
	 * @param arr
	 * @param low
	 * @param high
	 */
	private void sort(E[] arr, int low, int high) {
		if (high <= low)
			return;
		
		int half = (low + high + 1) / 2;

		E[] leftArr = copyArray(arr, low, half);
		E[] rightArr = copyArray(arr, half, high + 1);

		sort(leftArr, 0, leftArr.length-1);
		sort(rightArr, 0, rightArr.length-1);
		
		merge(leftArr, rightArr, arr, low);
	}
	
	/**
	 * merge between arr1 and arr2 into arr
	 * @param leftArr - arr1
	 * @param rightArr - arr2
	 * @param arr
	 * @param low - since the method change the array and NOT return a new one, we need to follow the current index
	 */
	private void merge(E[] leftArr, E[] rightArr, E[] arr, int low) {
		int leftIndex = 0, rightIndex = 0, arrIndex = low;

		while(leftIndex < leftArr.length && rightIndex < rightArr.length) {
			if(leftArr[leftIndex].compareTo(rightArr[rightIndex]) < 0)
				arr[arrIndex] = leftArr[leftIndex++];
			 else
				arr[arrIndex] = rightArr[rightIndex++];
			arrIndex++;
		}

		while(leftIndex < leftArr.length)
			arr[arrIndex++] = leftArr[leftIndex++];
		
		while(rightIndex < rightArr.length)
			arr[arrIndex++] = rightArr[rightIndex++];
	}
	
	/**
	 * copy an array in specific indexes
	 * @param from - the array we want to copy from
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private E[] copyArray(E[] from, int startIndex, int endIndex) {
		@SuppressWarnings("unchecked")
		E[] to = (E[]) new Comparable[endIndex - startIndex];
		for(int i = 0; i < to.length; i++)
			to[i] = from[startIndex++];

		return to;
	}
	
}
