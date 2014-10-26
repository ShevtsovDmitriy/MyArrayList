/**
 * Created by Дмитрий on 23.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();
        mal.add(7);
        mal.add(2);
        mal.add(1);
        mal.add(3);
        mal.add(4);
        mal.add(5);
        mal.add(9);
        mal.add(7);
        mal.add(8);
        mal.add(6);
        mal.add(10);

        System.out.println(mal);
        mal.remove(-1);
        System.out.println(mal);

    }
}
