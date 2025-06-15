class Permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean [] isVisited = new boolean[nums.length];
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums, smallList, bigList, isVisited);
        return bigList;
    }

    void helper(int []nums,List<Integer> smallList, List<List<Integer>> bigList, boolean []isVisited) {
    if(nums.length == smallList.size() && !bigList.contains(smallList)){
        bigList.add(new ArrayList<>(smallList));
        return ;
    }
        for(int i = 0; i <nums.length; i++) {
            if(!isVisited[i]) {
                smallList.add(nums[i]);
                isVisited[i] = true;
                helper(nums, smallList, bigList, isVisited);
                smallList.remove(smallList.size()-1);
                isVisited[i] = false;
            }

        }
    }
}
