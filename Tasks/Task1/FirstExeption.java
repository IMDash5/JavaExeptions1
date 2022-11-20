package Task1;

/**
 * FirstExeption
 */
public class FirstExeption {
    public static void main(String[] args) {
        div(5,0);
    }
    public static void div(int x, int y){
        if (y == 0){
            throw new RuntimeException("Деление на ноль невозможно");
        }
            System.out.println(x / y);
    }
    
}