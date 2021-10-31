import java.util.Random;
/**
 * @author Steven Taylor
 * @version 8/19/2020
 * @class CSCI 333
 * @assignment HW2 Heap
 * @description HeapRunner class is used for initializing five arrays, storing each array with random numerical values. Creating MaxHeap objects
 * and passing filled arrays. Original arrays to be printed, then print heap array, perform heapSort and print sorted heap array * 5.
 * 
 * 
 */

public class HeapRunner {
	public static void main(String[] args) {

		int test1[] = new int[64];
		int test2[] = new int[4];
		int test3[]= new int [16];
		int test4[] = new int [8];
		int test5[] = new int [32];
		Random rand = new Random();
		
		for(int i = 0; i < test1.length; i++) {
			test1[i] = rand.nextInt(100) + 1;
		}
		MaxHeap one = new MaxHeap(test1);
		System.out.println(java.util.Arrays.toString(test1));
		one.printMaxHeap();
		one.heapSort();
		one.printMaxHeap();
		
		
		for(int i = 0; i < test2.length; i++) {
			test2[i] = rand.nextInt(100) + 2;
		}
		MaxHeap two = new MaxHeap(test2);
		System.out.println(java.util.Arrays.toString(test2));
		two.printMaxHeap();
		two.heapSort();
		two.printMaxHeap();

		for(int i = 0; i < test3.length; i++) {
			test3[i] = rand.nextInt(100) + 1;
		}
		MaxHeap three = new MaxHeap(test3);
		System.out.println(java.util.Arrays.toString(test3));
		three.printMaxHeap();
		three.heapSort();
		three.printMaxHeap();

		for(int i = 0; i < test4.length; i++) {
			test4[i] = rand.nextInt(100) + 1;
		}
		MaxHeap four = new MaxHeap(test4);
		System.out.println(java.util.Arrays.toString(test4));
		four.printMaxHeap();
		four.heapSort();
		four.printMaxHeap();

		for(int i = 0; i < test5.length; i++) {
			test5[i] = rand.nextInt(100) + 1;
		}
		MaxHeap five = new MaxHeap(test5);
		System.out.println(java.util.Arrays.toString(test5));
		five.printMaxHeap();
		five.heapSort();
		five.printMaxHeap();
		int array2[] = {66,5,8,25,30,9,18,49,36,97};
		MaxHeap six = new MaxHeap(array2);
		six.printMaxHeap();
		six.heapSort();
		six.printMaxHeap();
		
	}
}
