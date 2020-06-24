import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n <= 20 && m <= 20) {

            int[][] matrix = new int[n][m];
            int count = 0;
            int row = 0;
            int sum = 0;
            int sum2 = 0;
            for (int x = 0; x < n; x++) {
                for (int z = 0; z < m; z++) {
                    matrix[x][z] = scanner.nextInt();
                }
            }
            int k = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                count = 0;
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if (count == k) {
                        row = i + 1;
                        i = n;
                        break;
                    }
                }
            }
            System.out.println(row);
        }
    }
}
