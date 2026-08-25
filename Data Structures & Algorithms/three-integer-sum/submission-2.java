class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>0)
                {
                    r--;
                }
                else if(sum<0)
                {
                    l++;
                }
                else
                {
                 List<Integer> list1=new ArrayList<>();   
                 list1.add(nums[i]);
                 list1.add(nums[l]);
                 list1.add(nums[r]);
                 list.add(list1);
                 l++;
                r--;
                 // Skip duplicate left values
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                }
                
            }
        }}
        return list;
    }
}
