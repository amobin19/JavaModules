public class TypesExercise {
    public static void main(String args[]){
        int var = 5;
        System.out.println(var);
        byte byteVal = 3;
        short shortVal = 4;
        int intVal = 5;
        long longVal = 50000L + (10L * (byteVal + shortVal + intVal));
        System.out.println(longVal);
        short newShortVal = (short) longVal;
        System.out.println(newShortVal);
    }
}
