/*
Given has an array of sales numbers, what is the index of the smallest index element for which the sums of all elements to the left and to the right are equal. 
The array may not be reordered.
For example, given the array sales = [1, 2, 3, 4, 6],we see that 1+2+3=6，Using zero based indexing,sales[3] = 4 is the value sought.The index is 3.
*/

public class Solution {
    /**
     * @param sales: a integer array
     * @return: return a Integer
     */
    public int BalancedSalesArray(int[] sales) {
        if(sales==null || sales.length <=1) return -1;
        int rightSum=0;
        for(int i=sales.length-1;i>0;i--){
            rightSum+=sales[i];
        }
        int index =0;
        int leftSum=0;
        while(index<sales.length-1){
            if(leftSum==rightSum) return index;
            leftSum+=sales[index];
            index++;
            rightSum-=sales[index];
        }
        if(leftSum==rightSum) return index;
        return -1;
    }
}
