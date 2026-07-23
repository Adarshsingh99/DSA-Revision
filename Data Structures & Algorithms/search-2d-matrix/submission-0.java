class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
       
int colIdx = -1;

for (int i = 0; i < n; i++) {

    if (target < matrix[i][0]) {
        colIdx = i - 1;
        break;
    }

    if (i == n - 1) {
        colIdx = i;
    }
}

if (colIdx == -1)
    return false;

    int start = 0;
    int end = m-1;

    while(start<= end)
    {
        int mid = (start+end)/2;
        if(matrix[colIdx][mid]== target)
        {
            return true;
        }
        else if(matrix[colIdx][mid]>target)
        {
            end = mid-1;
        }
        else
        {
             start = mid+1;
        }
    }
    return false;
    }
}
