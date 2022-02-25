
public class MatrizTrasposta {

    public static void main(String[] args) {
        int[][] m = {
            {0, 6},
            {-1, 2},
            {5, 0}
        };

    }

    public static int[][] trasnposta(int[][] a) {
        int[][] at = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                at[j][i] = a[i][j];
            }
        }
        return at;
    }

    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }
}
