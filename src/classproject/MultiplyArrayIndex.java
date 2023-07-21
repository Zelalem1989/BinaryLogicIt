package classproject;

public class MultiplyArrayIndex {

    public static int arrayMultiplayer(int[] Arr){

        int val = 1;

        for (int a : Arr) {
            val *= a;
        }

        return val;
    }

    public static void main(String[] args) {
        int[] array = {10,21,20,15};

        System.out.println(arrayMultiplayer(array));
    }
}
