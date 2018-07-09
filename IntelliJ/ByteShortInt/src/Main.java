public class Main {
    public static void main(String[] args){

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        // System.out.println();

        // long as a width of 64
        long myLongValue = 100L;
        long longVal = 9_223_372_036_854_775_807L;
        // System.out.println();

        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 50;
        long totalVar = byteVar + shortVar + intVar;
        long longVar = 50000 + 10 * (totalVar);
        short shortTotal = (short)(1000 + 10 * (totalVar));
        System.out.println("longVar = " + longVar);
        System.out.println("shortTotat = " + shortTotal);
    }
}
