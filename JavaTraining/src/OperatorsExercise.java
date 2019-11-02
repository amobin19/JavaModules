public class OperatorsExercise {
    public static void main(String args[]){
        double val1 = 20.00;
        double val2 = 80.00;
        double sumMult = (val1 + val2) * 100;
        double modVal = sumMult % 40.00;
        boolean isZero = (modVal == 0) ? true : false;
        System.out.println(isZero);
        if(isZero == true){
            System.out.println("No remainder");
        }
        else {
            System.out.println("Got some remainder");
        }
    }
}
