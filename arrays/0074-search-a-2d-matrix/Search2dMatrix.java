class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        //Finding the expected row
        for(row = 0; row < matrix.length; row++) {
            if((matrix[row][0] <= target) && ((matrix[row][matrix[0].length - 1]>=target)))                  break;
        }
        if(row==matrix.length) return false;
        //Binary Search to find the target in expected row.
        int col = 0;
        int initialCol = 0;
        int finalCol = matrix[0].length;
        int i = 0;
        while(i < matrix[0].length) {
            col = (initialCol + finalCol) / 2;
            if(matrix[row][col] > target)
                finalCol = col;
            else if(matrix[row][col] < target)
                initialCol = col;
            else
                return true;
            i++;
        }
        return false;
    }
}