package Task3;
import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 4, 0, 18, 5};
        int[] array2 = {1, 3, 2, 1, 9};
        System.out.println(Arrays.toString(DivArray(array1, array2)));
    }
    public static int[] DivArray(int[] x, int[] y){
        if(x.length != y.length){
            throw new RuntimeException("Один из массивов слишком большой");
        }
        int[] NewArr = {1, 2, 3, 4, 5}; 
        for(int i = 0; i < x.length; i++){
            NewArr[i] = x[i] / y[i];
        }
        return NewArr;
    }
}
