/**
 * Created by Дмитрий on 10.11.2014.
 */
public class SortedArrayList extends MyArrayList {

    @Override
    public void add(int element) {
        if (index == list.length - 1){
            increase();
        }
        list[++index] = element;
        if (index > 0){
            int i = index - 1;
            while (element < list[i]){
                int tmp = list[i];
                list[i] = element;
                list[i+1] = tmp;
                i--;
            }
        }
    }

    public void addCopy(int element) {
        if (index == list.length - 1){
            increase();
        }
        if (index == -1){
            super.add(element);
        }
        else{
            int count = index;
            for (int i = 0; i <= list.length-1; i++) {
                if (list[i] > element){
                    System.arraycopy(list, i, list, i+1, list.length - i - 1);
                    list[i] = element;
                    index++;
                    return;
                }
                else {
                    list[index] = element;
                    index++;
                }
            }
        }



    }

    @Override
    public void Sort() {
    }
}
