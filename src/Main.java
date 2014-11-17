/**
 * Created by Дмитрий on 23.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        SortedArrayList mal = new SortedArrayList();
        mal.addCopy(3);
        mal.addCopy(5);
        mal.addCopy(9);
        mal.addCopy(4);
        mal.addCopy(3);
        System.out.println(mal);
        System.out.println(mal.found(9));
    }
}
