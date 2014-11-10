/**
 * Created by Дмитрий on 10.11.2014.
 */
public class SortedArrayList extends MyArrayList {

    @Override
    public void add(int element) {
        if (index == list.length - 1){
            increase();
        }

    }
}
