public class Main {
    public static void main(String[] args){

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;

        // width of a float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Pounds -> Kilograms
        double pounds = 200;
        double convertedKilograms = pounds * 0.45359237d;
        System.out.println("kilograms = " + convertedKilograms);
        // 90.7185
        double pi = 3.141_592_7d;
    }
}
