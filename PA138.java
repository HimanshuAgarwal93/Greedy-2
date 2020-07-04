//Leetcode: 621. Task Scheduler
//Time Complexity: O(n)
//Space Complexity; O(1), extra array is of fixed size 26.
class Solution {
    public int leastInterval(char[] tasks, int n) {   
    int[] ar = new int[26];
        int maxFreq=0;
        for(char c: tasks){
            ar[c-'A']++;
            maxFreq= Math.max(maxFreq, ar[c-'A'] );
        }
        int mcount=0;
        for(int i=0;i<26;i++){          
            if(ar[i] == maxFreq) mcount++;
        }
        int empty= (n-mcount+1)*(maxFreq-1);
        int ideal= (tasks.length-(maxFreq*mcount));
        int cool= empty-ideal;
        int res= tasks.length+Math.max(0,cool);
        return res;       
    }
}