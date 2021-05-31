public class RotateMatrix {

    public int[][] rotateMatrix(int[][] input){
        int row = input.length;
        int col = input[0].length;
        int[][] tmp = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j=0; j< col; j++) {
                tmp[j][row-1-i] = input[i][j];
            }
        }

        return tmp;
    }

    public void printMatrix(int[][] input) {
        for(int i = 0; i < input.length; i++) {
            for(int j=0; j< input[0].length; j++) {
                System.out.print(input[i][j]+", ");
                if(j == input[0].length-1) System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        int[][] result = rm.rotateMatrix(matrix);
        rm.printMatrix(result);
    }
}
