package homework;

public class ShoppingDArrayLoop1 {
    public static void main(String[] args) {

        //         walmart	costco	corrado's	AVG
//    apple	3	       4	   5	     4
//    milk	3	       3	   3	     3
//    meat	4          5	   4	     4.33
//    bread	1	       1	   2	     1.33
//    TOTAL	            11	      13	   14
        // given table,
        // part1. calculate sum of price in each market(walmart,costco,corrado's)
        // expected output is:
        // Total at Walmart is: ???
        // Total at costco is: ???
        // Total at corrado's is: ???
        // part2. calculate average price of each item(apple, milk, meat, bread)
        // expected output is:
        // average price of apple is: ???
        // average price of milk is: ???
        // average price of meat is: ???
        // average price of bread is: ???

        int arr[][] = {{3, 4, 5},
                {3, 3, 3},
                {4, 5, 4},
                {1, 1, 2}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("      " + arr[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= arr[i].length; j++) {
                sum += arr[j][i];
            }
            System.out.print("   " + sum);
            System.out.println();

        }

//        for (int i = 0; i < arr.length; i++) {
//            int sum1 = 0;
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//                sum1 += arr[i][j]; // sum = sum + prices[i][j];
//            }
//            double avg = (double) sum1 / arr[i].length;
//            System.out.print("\nSum is: " + sum1);
//            System.out.print("\nAvg is: " + avg);
//
//            System.out.println();


        }

    }




