/**
 * Created by Дмитрий on 23.10.2014.
 * Collection of ArrayLists for NetCracker
 */
public class Main {
    public static void main(String[] args) {
        /*SortedArrayList mal = new SortedArrayList();
        mal.add(2);
        mal.add(5);
        mal.add(9);
        mal.add(4);
        mal.add(3);
        mal.add(11);
        System.out.println(mal);
        System.out.println(mal.found(13));*/

        TimeTest.test(new MyArrayList(), 10000);
        TimeTest.test(new SortedArrayList(), 10000);

    }
}
