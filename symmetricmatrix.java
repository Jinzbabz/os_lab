import java.util.Scanner;
class SymmetricMatrix 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
      if (matrix[i][j] != matrix[j][i]) {
      symmetric = false; 
    break;
                }
            }
        }

        if (symmetric) {
        System.out.println("The matrix is Symmetric");
        } else {
        System.out.println("The matrix is Not Symmetric");
        }

        sc.close();
    }
}