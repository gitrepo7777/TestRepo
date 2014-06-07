public class QuickSort {

	public static void main(String[] args) {

		int arr[] = {15,8,0,3,5,2,9};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, 6);
		qs.printArr(arr);
	}

	int partition(int arr[], int left, int right)

	{

		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}

		}
		;

		return i;

	}

	void quickSort(int arr[], int left, int right) {

		int index = partition(arr, left, right);

		if (left < index - 1)

			quickSort(arr, left, index - 1);

		if (index < right)

			quickSort(arr, index, right);

	}

	void printArr(int arr[])
	{
		System.out.println("test substring : " + "/tmp/usr".substring(4));
		for(int i : arr)
		{
			System.out.println(i);
		}
		
	}
}
