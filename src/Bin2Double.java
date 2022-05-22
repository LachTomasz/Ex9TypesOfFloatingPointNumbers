public class Bin2Double {
    public static void main(String[] args) {
        String Liczba = "111110000011110000111000110010";
        long n = Long.parseLong(Liczba, 2);
        double x = Double.longBitsToDouble(n);
        System.out.println("BIN:\t\t\t" + Liczba);
        System.out.println("Całkowita:\t\t" + n);
        System.out.println("Zmiennoprzecinkowa:\t" + x);
    }
}
