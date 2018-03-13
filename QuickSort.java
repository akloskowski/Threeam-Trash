/*
 * Team Threeam-Trash
 * Ryan Kim, Adrian Kloslowski, Woosuk Lee
 * APCS2 pd08
 * L01 -- What Does the Data Say? And how?
 * 2018-03-13
 */
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): fixes the first element to its "sorted" position and partitions every other element. Runs until exhausted (reaching base case) when left and right are equal (only 1 element)
 *
 * 2a. Worst pivot choice and associated runtime: Pivot point 0 leads to runtime of O(n^2)
 *
 * 2b. Best pivot choice and associated runtime: Pivot point 1/2 the array length leads to runtime of O(n)
 *
 * 3. Approach to handling duplicate values in array: partition method handles making sure duplicates are not moved infinitely.
 *
 *****************************************************/

public class QuickSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }

    public static int partition(int[] arr, int start, int end, int target) {
        int v = arr[target];
        swap( end, target, arr );
        int s = start;
        for ( int i = start; i < end; i ++ ) {
            if ( arr[i] < v ){
                swap( s, i, arr );
                s ++;
            }
        }
        swap( end, s, arr );
        return s;
        
    }

    
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d )
    { 
	qsHelper( d, 0, d.length - 1 );
    }

    public static void qsHelper( int[] d, int l, int r ) {
	if ( l<r ) { //left value less than right value
	    int pvtPos = partition( d, l, r, l );
	    qsHelper( d, l, pvtPos - 1 );
	    qsHelper( d, pvtPos + 1, r );
	}
    }//end of quicksortHelper

    //you may need a helper method...


    //main method for testing
    public static void main( String[] args )
    {
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

	shuffle(arrN);
	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);

	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
 
	

	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

	shuffle(arrMatey);
	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);


	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
