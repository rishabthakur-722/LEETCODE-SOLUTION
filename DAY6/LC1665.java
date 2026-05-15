class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->(a[0] - a[1]) -(b[0] -b[1]));

        int ans =0;
        int current = 0;

        for(int [] task : tasks){
            int actual = task[0];
            int minimum = task[1];

            if(current < minimum){
                ans = ans + (minimum - current);
                current = minimum;
            }


            current = current - actual;
        }
        return ans;
        
    }
}