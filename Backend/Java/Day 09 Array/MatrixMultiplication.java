/* 19. MatrixMultiplication
Given:
int[][] a = {
    {1, 2},
    {3, 4}
};
int[][] b = {
    {5, 6},
    {7, 8}
};
Multiply the two matrices.
Expected:
19 22
43 50
Hint: This requires three nested loops. */

class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                int sum = 0;

                for (int k = 0; k < a[i].length; k++) {
                    sum += a[i][k] * b[k][j];
                }

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}

