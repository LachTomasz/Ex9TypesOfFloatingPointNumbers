public class DoubleBin {

    static String zera = "0000000000000000000000000000000000000000000000000000000000000000";

    public static void main(String[] args) {
        //Variables
        double a[] = {0.25, 0.5, 1.0, 2.0, 512.0};
        double b[] = {0.01, 0.1, 1.0, 10.0, 100.0};
        double c[] = {1.367, 1367, 13.67, -13.67, 1.367e-12, 1.367e12};
        double d[] = {Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
        //Calculations
        for(double e : d){
            System.out.println("DEC: " + e);
            String temp = Long.toBinaryString(Double.doubleToLongBits(e));
            if(temp.length() < 64) temp = zera.substring(0,64-temp.length()) + temp;
            System.out.println("BIN: " + temp);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Bit znaku:\t" + temp.charAt(0));
            System.out.println("Cecha:\t\t" + temp.substring(1,12));
            System.out.println("Mantysa:\t" + temp.substring(12));
            System.out.println();

        }
    }
}
