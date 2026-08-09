class Solution {
    public int largestAltitude(int[] gain) {
        int newarr[]=new int[gain.length+1];
        newarr[0]=0;
        int j=0;
        int max=0;
        for(int i=1;i<newarr.length;i++){
            newarr[i]=gain[j];
            j++;
        }
        for(int i=1;i<newarr.length;i++){
            newarr[i]=newarr[i]+newarr[i-1];
            if(max<newarr[i]){
                max=newarr[i];
            }
        }

        return max;
        
    }
}