class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int n=matrix.length;
     int m=matrix[0].length;
     List<Integer>list=new ArrayList<>();
     int left=0,top=0,bottom=n-1,right=m-1;
     while(left<=right&&top<=bottom)
     {
        for(int t=left;t<=right;t++)
        {
             list.add(matrix[top][t]);
        }
        top++;

        for(int t=top;t<=bottom;t++)
        {
            list.add(matrix[t][right]);
        }
        right--;
        if(top<=bottom)
        for(int t=right;t>=left;t--)
        {
            list.add(matrix[bottom][t]);
        }
        bottom--;
        if(left<=right)
        for(int t=bottom;t>=top;t--)
        
        {
            list.add(matrix[t][left]);
        }
        left++;
     }
        return list;
    }
}