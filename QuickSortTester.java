/*
  Team Threeam Trash
  Adrian Kloskowski, Ryan Kim, Woosuk Lee
  APCS pd08
  Lab01 -- What does the data say?
  2018-03-14
*/


public class QuickSortTester{

    public static void main( String[] args ){

	for ( int n = 1000; n < 10000; n += 100 ) {
	    QuickSort data = new QuickSort();
	   
	    int d[] = data.buildArray(n,n);
	    data.shuffle(d);
	    
	    double a = System.currentTimeMillis();	     

	    QuickSort.qsort(d);

	    double b = System.currentTimeMillis();

	    System.out.println((b-a));
	    
       	}	
    }
}
