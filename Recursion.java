public class Recursion {
    public static void main(String[] args) {

        // ^ Factorial using recursion

        /* public int factorial(int n) {
        // if(n==1) {
        // return 1;
        // }
        // return n* factorial(n-1);
        // }

        */

        // ^ We have a number of bunnies and each bunny has two big floppy ears. We want
        // to compute the total number of ears across all the bunnies recursively
        // (without loops or multiplication).
        // ! bunnyEars(0) → 0 bunnyEars(1) → 2 bunnyEars(2) → 4

        /*  public int bunnyEars(int bunnies) {
        // if(bunnies ==0) {
        // return 0;
        // }
        // return 2 + bunnyEars(bunnies-1);
        // }
        */

        // ^Fibonacci

        /* public int fibonacci(int n) {
        // if(n==0) {
        // return 0;
        // }
        // if(n==1) {
        // return 1;
        // }
        // return fibonacci(n-1)+fibonacci(n-2);
        // }

        */

        // ^ We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1,
        //^ 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3
        //^ ears, because they each have a raised foot. Recursively return the number of
        //^ "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
        // ! bunnyEars2(0) → 0 bunnyEars2(1) → 2 bunnyEars2(2) → 5 ;

        /* public int bunnyEars2(int bunnies) {
        // if(bunnies==0){
        // return 0;
        // }
        // if(bunnies%2==0) {
        // return bunnyEars2(bunnies-1)+3;
        // }
        // return bunnyEars2 (bunnies-1)+2;

        // }
        */

        // ^We have triangle made of blocks. The topmost row has 1 block, the next row
        //^ down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively
        //^ (no loops or multiplication) the total number of blocks in such a triangle
        //^ with the given number of rows.
        // ! triangle(0) → 0 triangle(1) → 1 triangle(2) → 3

        /* public int triangle(int rows) {
        // if(rows==0) {
        // return 0;
        // }
        // return triangle(rows-1)+rows;
        // }
        */

        // ^ Sum of Digits eg.126=9;


        /* 
        public int sumDigits(int n) {
        // if(n==0) {
        // return 0;
        // }
        // return (n%10)+sumDigits(n/10);
        // }
        */

        // ^ Given a non-negative int n, return the count of the occurrences of 7 as a
        //^ digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
        //^ yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
        //^ the rightmost digit (126 / 10 is 12).
        // ! count7(717) → 2 count7(7) → 1 count7(123) → 0

        /*  public int count7(int n) {
        //     if(n==0) {
        //       return 0;
        //     }
        //     int count = (n%10==7) ? 1:0;
        //     return count+count7(n/10);
        //   }
         */
          

    }

}
