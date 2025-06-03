class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        List<int[]> allIntervals = new ArrayList<>();
        boolean inserted = false;
       for (int[] interval : intervals) {
            if (!inserted && newInterval[0] <= interval[0]) {
                allIntervals.add(newInterval);
                inserted = true;
            }
        allIntervals.add(interval);
    }
      if(!inserted){
        allIntervals.add(newInterval);
      }
        for(int[] interval : allIntervals) {
            if(result.isEmpty() || result.get(result.size() -1)[1] < interval[0]){
                result.add(interval);
            }else{
                result.get(result.size() -1)[1] = Math.max(result.get(result.size() -1)[1], interval[1]);
            }
        }

         return result.toArray(new int[result.size()][]);
        
    }
}
