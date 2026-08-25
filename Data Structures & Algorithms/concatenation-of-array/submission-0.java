class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int r=l-1;
        int[] arr=new int[l+l];
        for(int i=0;i<l;i++)
        {
            arr[i]=nums[i];
            arr[i+l]=nums[i];
             }
             return arr;
    }
    
}