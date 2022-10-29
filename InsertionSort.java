import java.util.Scanner;

public class InsertionSort {
    
    private static int[] readNums() {

        Scanner scnr = new Scanner(System.in);      

        int size = scnr.nextInt();              // Takes the first int entered by the user to instantiate the size of the array

        int[] numbers = new int[size];          // Creates a new int[] array with the size specified by the user

        for (int i = 0; i < size; i++) {        

            numbers[i] = scnr.nextInt();        // Adds the next ints inputted and adds it it the next index in the array

        }

        return numbers;                         // Returns the array of numbers
    }

    private static void printNums(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]);

            if (i < nums.length - 1) {

                System.out.print(" ");

            }
        }

        System.out.println();
    }

    private static void swap(int[] nums, int j, int k) {

        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }

    private static int numComparisons = 0, numSwaps = 0;

    public static void insertionSort(int[] numbers) {

        int i;
        int j;

        for (i = 1; i < numbers.length; ++i) {

            j = i;

            while (j > 0 && numbers[j] < numbers[j - 1]) {

                ++numComparisons;
                swap(numbers, j, j - 1);
                ++numSwaps;
                --j;

            }
            if (j > 0){

                ++numComparisons;

            }

            printNums(numbers);

        }
    }

    public static void main(String[] args) {

        int[] numbers = readNums();         // Reads in the numbers input by the user

        printNums(numbers);                 // Prints out the numbers
        System.out.println();               

        insertionSort(numbers);             // Passes the numbers array to the insertionSort()
        System.out.println();

        System.out.println("comparisons: " + numComparisons);   // Prints the amount of comparisons made 
        System.out.println("swaps: " + numSwaps);               // Prints the amount of swaps made 

    }
}
