class Solution {
    public int maximumWealth(int[][] accounts) {
        int []arr=new int[accounts.length];
        int max=arr[0];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            arr[i]=sum;        
            if(arr[i]>max){
                max=arr[i];
            }
            }
        return max;
    }
}