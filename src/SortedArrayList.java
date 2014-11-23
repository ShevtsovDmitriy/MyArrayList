public class SortedArrayList extends MyArrayList implements MyIntList{

/*    @Override
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
*/
    public void add(int element) {
        if (index == list.length - 1){
            increase();
        }
        if (index == -1){
            super.add(element);
        }
        else{
            for (int i = 0; i <= index; i++) {
                if (list[i] > element){
                    System.arraycopy(list, i, list, i+1, list.length - i - 1);
                    list[i] = element;
                    index++;
                    return;
                }
            }
            list[++index] = element;
        }
    }

    @Override
    public void Sort() {
    }

    @Override
    public Integer min() {
        if(index > -1) return list[0];
        else return null;
    }

    @Override
    public Integer max() {
        if(index > -1) return list[index];
        else return null;
    }

    @Override
    public Integer found(int element) {
        if (index == -1) return null;
        else {
            if (element == list[0]) return 0;
            if (element == list[index]) return index;
            return binarySeach(0, index, element);
        }
    }

    private Integer binarySeach(int left, int right, int element){
        if (left >= right) return null;
        int middle = left + (right - left) / 2;
        if(list[middle] == element) return middle;
        else{
            if (element < list[middle]) return binarySeach(left, middle, element);
            else return binarySeach(middle + 1, right, element);
        }

    }
}
