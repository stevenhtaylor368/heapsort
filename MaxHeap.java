/**
 * @author Steven Taylor
 * @version 8/19/2020
 * @class CSCI 333
 * @assignment HW2 Heap
 * @description This class implements the Heap Sort algorithm. Copies the size of the array passed, builds heapArray through MaxHeapify.
 * MaxHeapify performs checks and balances through recursion on the left and right children of the passed index and performs swaps as
 * necessary. Array index passed from MaxHeapify is half of the array size decreases by one until reaching zero. Heapsort performs the 
 * sort method and decrements down to zero from the heap array size minus 1. Sort Method begins at the first array position.
 *
 */
public class MaxHeap {
	private int[] heapArray;
	private int size;
	//sets heapArray length to the same size as the passed array, then calls buildMaxHeap. 
	public MaxHeap(int []array) {
		size =array.length;
		heapArray = java.util.Arrays.copyOfRange(array, 0, size);
		buildMaxHeap();
	}
	//@param value index to be verified returns -1 if out of bounds otherwise goes 2 * index position.
	private int leftChildOf(int value) {
		int left = value;
		if(2 * left > (size) || left < 0) {
			return -1;
		}
		else {
			return(2 * left);
		}
	}
	//@param value index plus one to be verified returns -1 if out of bounds otherwise goes 2 * index position.
	private int rightChildOf(int value) {
		int right = value++;
		if(right < 0 || (2 *right) + 1 > (size)) {
			return -1;
		}
		else {
			return(2 * right) + 1;
		}
	}
	//prints heap array
	public void printMaxHeap() {
		System.out.println(java.util.Arrays.toString(heapArray));
		
	}
	//@param i index of array 
	//passes index to rightChildOf and leftChildOf, if left and right do not equal -1 then the largest number is allocated to swap.
	private void maxHeapify(int i) {
		int big;
		int holdCell;
		int left =  leftChildOf(i);
		int right = rightChildOf(i);
		
		if(left != -1 && right != -1) {
			if((left < (size-1)) && (heapArray[left] > heapArray[i])) {
				
				big = left;
			}
			else {
				big = i;
			}
			if((right < (size)) && (heapArray[right] > heapArray[big])) {
				big = right;
			}
			if(big != i) {
				holdCell = heapArray[i];
				heapArray[i] = heapArray[big];
				heapArray[big] = holdCell;
				maxHeapify(big);
			}
		}
		
	}
	//passes index position at .5 array size to maxHeapifiy. goes downto zero
	private void buildMaxHeap() {
		// *change* down to zero
		for(int i= size /2; i >= 0; i--) {
			maxHeapify(i);
		}
		
	}
	//sorts heap array starting with the very first element and the second to last.
	public void heapSort() {
		int holdCell;
		//to 2 in for loop generated errors, changed to zero for accuracy. downto instead of upto 
		for(int i = size-1; i >= 2; i --) {
			holdCell = heapArray[0];
			heapArray[0] = heapArray[i];
			heapArray[i] = holdCell;
			size--;
			maxHeapify(0);
		}
	}
	

}
