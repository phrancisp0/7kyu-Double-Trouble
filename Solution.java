import java.util.Arrays;
public class Solution {
  public static int[] trouble(int[] x, int t) {  
      int n = x.length;
      for (int i =1,in=1,j=0;i <x.length; i++){ 
          if(x[i]+x[j]!=t){
            x[in]=x[i]; j=in++;
            }
          else n--;
        } 
      return Arrays.copyOf(x ,n); 
    }
}
/*
Given an array of integers (x), and a target (t), you must find out if any two consecutive numbers in the array sum to t. If so, remove the second number.

Example:

x = [1, 2, 3, 4, 5]
t = 3

1+2 = t, so remove 2. No other pairs = t, so rest of array remains:

[1, 3, 4, 5]

Work through the array from left to right.

Return the resulting array.
*/