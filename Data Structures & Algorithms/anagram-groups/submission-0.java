class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ls=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String key=new String(s);
            if(map.containsKey(key))
            {
                map.get(key).add(strs[i]);
            } 
            else
            {
                map.put(key,new ArrayList<String>());
                map.get(key).add(strs[i]);

            }
        }
        return new ArrayList<>(map.values());
    }
}
