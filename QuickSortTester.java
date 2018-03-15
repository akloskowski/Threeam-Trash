/*
  Team Threeam Trash
  Adrian Kloskowski, Ryan Kim, Woosuk Lee
  APCS pd08
  Lab01 -- What does the data say?
  2018-03-14
*/


public class QuickSortTester{

    public static void main( String[] args ){
        
	 for(int i = 1; i <= 5; i++){
            System.out.print("," + i);
        }
	 System.out.print("\n");
        for ( int n = 10000; n <= 150000; n += 1000 ) {
            System.out.print(n + ",");
            for(int i = 0; i < 5; i++){
                QuickSort data = new QuickSort();

                int d[] = data.buildArray(n,n);
                data.shuffle(d);

                double a = System.currentTimeMillis();	     

                QuickSort.qsort(d);

                double b = System.currentTimeMillis();

                System.out.print((b-a + ","));
                }
                System.out.print("\b\n");

        }	
    }
}
