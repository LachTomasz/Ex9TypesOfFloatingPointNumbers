public class Bin2Float {
    public static void main(String[] args) {
        String Liczba = "111110000011110000111000110010";
        int n = Integer.parseInt(Liczba, 2);
        float x = Float.intBitsToFloat(n);
        System.out.println("BIN:\t\t\t" + Liczba);
        System.out.println("Całkowita:\t\t" + n);
        System.out.println("Zmiennoprzecinkowa:\t" + x);
    }
}
