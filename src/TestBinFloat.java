public class TestBinFloat {
    public static void main(String[] args) {
        String[] tab = new String[]{"01111111100000000000000000000000",
            "01111111111111111111111111111111"};
        float x;
        for(String str:tab) {
            x = Float.intBitsToFloat(Integer.parseInt(str, 2));
            System.out.println(x);
        }

    }
}
