class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int k = 0;
        //int arr[] = new int[size];
        for(int i = 0; i<size; i++)
        {
           if (nums[i] !=val)
           {
            nums[k]= nums[i];
               k++;

           }
        }
        return k;
    }
}