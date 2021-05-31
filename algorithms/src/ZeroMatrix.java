public class ZeroMatrix {
    public void zeroMatrix(int[][] input){
        int[] row = new int[input.length];
        int[] col = new int[input.length];
        int n = input.length;

        for(int i = 0; i < n; i++) {
            for(int j=0; j< n; j++) {
                if(input[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i : row) {
            if (i == 1) {
                setRowZero(input, i);
            }
        }
        for (int i : col) {
            if (i == 1) {
                setColZero(input, i);
            }
        }


    }

    public void setRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public void setColZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    public void printMatrix(int[][] input) {
        for(int i = 0; i < input.length; i++) {
            for(int j=0; j< input[0].length; j++) {
                System.out.print(input[i][j]+", ");
                if(j == input[0].length-1) System.out.println("");
            }
        }
    }

    public void printMatrix2(int[][] input) {
        for(int i = input.length; i < input.length; i++) {
            for(int j = input.length; j< input[0].length; j++) {
                System.out.print(input[i][j]+", ");
                if(j == input[0].length-1) System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        ZeroMatrix rm = new ZeroMatrix();
        int[][] matrix = {{1,2,3,4},
                          {5,0,7,8},
                          {9,10,11,12},
                          {13,14,0,16}};

        //int[][] result = 
        rm.zeroMatrix(matrix);
        rm.printMatrix(matrix);
    }
}
