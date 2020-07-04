//Leetcode: 135. Candy
//Time complexity: O(2n), n is the size of ratings array
//Space Complexity:O(n), used an extra array of size n.
class Solution {
    public int candy(int[] ratings) {
        if(ratings==null || ratings.length==0) return 0;
        int[] res= new int[ratings.length];
        
        Arrays.fill(res,1);
        //right pass
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                res[i]=res[i-1]+1;
            }
        }  
        //left pass
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                res[i]=Math.max(res[i],res[i+1]+1);
            }
        }
        int sum=0;
        for(int k: res){
            sum=sum+k;
        }
        return sum;
    }
}