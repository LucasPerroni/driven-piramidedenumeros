public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;

        for (int i = 1; i <= numero; i++) {
            String numeroConcatenado = "";

            for (int j = 0; j < i; j++) {
                numeroConcatenado += Integer.toString(i);
            }

            System.out.println(numeroConcatenado);
        }
    }
}
