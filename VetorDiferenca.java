
public class VetorDiferenca {

    public static void main(String[] args) {
        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        
        String res = diferenca(b, a);
        System.out.println(res);

    }

    public static String diferenca(int[] a, int[] b) {
        String res = "";
        for (int i = 0; i < a.length; i++) { // percorre a
            boolean achou = false; 
            for (int j = 0; j < b.length; j++) { //percorrer b
                if (a[i] == b[j]) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                res += a[i] + " ";
            }
        }
        return res;
    }

}
