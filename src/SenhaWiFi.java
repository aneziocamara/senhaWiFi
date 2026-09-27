public class SenhaWiFi {
    public static void main(String[] args) {

        int a = 7;
        int b = 3;
        int c = 12;

        SenhaWiFi objeto = new SenhaWiFi();
        String resultado = objeto.senha(a, b, c);
        System.out.println("A senha do WiFi é: "+resultado);
    }


    public String senha(int a, int b, int c) {
        if (a > 5) {
            if (b > 5) {
                return "P";
            } else if (c > 10) {
                if (a + b > c) {
                    return "S";
                } else {
                    return "T";
                }
            } else {
                return "F";
            }
        } else if (c > a) {
            return "U";
        } else {
            return "P";
        }
    }
}
