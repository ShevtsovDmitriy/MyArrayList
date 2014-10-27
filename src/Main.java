/**
 * Created by Дмитрий on 23.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();
        MyArrayList second = new MyArrayList();
        mal.add(5);
        second.add(6);
        System.out.println(mal);
        System.out.print(mal.equals(second));
    }
}
