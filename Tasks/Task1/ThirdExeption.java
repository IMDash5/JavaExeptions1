package Task1;

public class ThirdExeption {
    public static void main(String[] args) {
        array(5);
    }
    public static void array(int x){
        int[] arr = {0, 1, 34, 2, 54};
        if(x >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Индекс слишком большой");
        }        
        System.out.println(arr[x]);
    }
}
