package Task1;
public class SecondExeption {
    public static void main(String[] args) {
        name(null);
    }
    public static void name(String a){
        if(a == null){
            throw new NullPointerException("Строка не может быть пустой");
        }
        System.out.println("Здравствуйте, " + a);
    }
}
