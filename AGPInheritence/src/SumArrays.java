public class SumArrays {

    public static void main(String[] args) {

        int[] num1 = {1, 9, 9, 9};
        int[] num2 = {7, 9, 9, 9, 9, 9, 9};

        int[] biggerArray = num1.length > num2.length ? num1 : num2;
        int[] smallerArray = num1.length <= num2.length ? num1 : num2;

        int[] summedArray = new int[biggerArray.length];
        System.arraycopy(biggerArray, 0, summedArray, 0, biggerArray.length);

        for (int i = 0; i < smallerArray.length; i++) {
            summedArray[i] += smallerArray[i];
        }

        for (int i = 0; i < summedArray.length; i++) {
            System.out.println(summedArray[i]);
        }
    }
}