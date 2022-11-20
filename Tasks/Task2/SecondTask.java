package Task2;
import java.util.Arrays;


public class SecondTask {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 1, 0, 6, 5};
        int[] array2 = {1, 2, 0, 1, 9};
        System.out.println(Arrays.toString(SubArray(array1, array2)));
    }
    public static int[] SubArray(int[] x, int[] y){
        if(x.length != y.length){
            throw new IndexOutOfBoundsException("Один из массивов слишком большой");
        }
        int[] NewArr = {1, 2, 3, 4, 5}; 
        for(int i = 0; i < x.length; i++){
            NewArr[i] = x[i] - y[i];
        }
        return NewArr;
    }
    
}
