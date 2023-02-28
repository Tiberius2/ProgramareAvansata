import java.util.Scanner;
public class Bonus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of vertices in the regular graph: ");
            int n = sc.nextInt();
            System.out.print("Enter the degree of each vertex in the regular graph: ");
            int k = sc.nextInt();
            sc.close();

            if (k >= n) {
                System.out.println("Error: the degree of each vertex must be less than the number of vertices.");
                return;
            }

            if ((n * k) % 2 != 0) {
                System.out.println("Error: the product of the number of vertices and the degree must be even.");
                return;
            }

            int[][] A = new int[n][n];

            // initialize the adjacency matrix A
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if ((j-i) % n <= k/2 || (i-j) % n <= k/2) {
                        A[i][j] = 1;
                        A[j][i] = 1;
                    }
                }
            }

            // print the adjacency matrix A
            System.out.println("Adjacency matrix of the regular graph:");
            printMatrix(A);
        }

        public static void printMatrix(int[][] A) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
