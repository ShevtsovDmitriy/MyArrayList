import java.util.Arrays;

public class MyArrayList implements MyIntList{

    protected int[] list;
    protected int index;

    public MyArrayList() {
        list = new int[10];
        index = -1;
    }

    public MyArrayList(int[] initArr){
        list = new int[10];
        System.arraycopy(initArr, 0, list, 0, initArr.length);
        index = initArr.length - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyArrayList that = (MyArrayList) o;

        return index == that.index && Arrays.equals(list, that.list);

    }

    protected void increase(){
        int[] buf = new int[list.length];
        System.arraycopy(list, 0, buf, 0, list.length);
        list = new int[Math.round(list.length*1.5f)];
        System.arraycopy(buf, 0, list, 0, buf.length);
    }

    public void add(int element){
        if (index == list.length - 1){
            increase();
        }
        list[++index] = element;
    }

    public int getByIndex(int index){
        if ((index > this.index) || (index < 0)){
            throw new IndexOutOfBoundsException("Индекс находится вне границ массива");
        }
        return list[index];
    }

    public void Sort(){
        int temp;
        for(int i=0; i < index; i++){
            for(int j=1; j < index; j++){
                if(list[j-1] > list[j]){
                    temp=list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i <= index; i++) {
            str += list[i] + " ";
        }
        return str;
    }

    public Integer min(){
        if (index == -1){
            return null;
        }
        int min = list[0];
        for (int i = 0; i <= index; i++){
            if (list[i] < min){
                min = list[i];
            }
        }
        return min;
    }

    public Integer max(){
        if (index == -1){
            return null;
        }
        int max = list[0];
        for (int i = 0; i <= index; i++){
            if (list[i] > max){
                max = list[i];
            }
        }
        return max;
    }

    public Integer found(int element){
        if (index == -1){
            return null;
        }
        for (int i = 0; i <= index; i++){
            if (list[i] == element){
                return i;
            }
        }
        return null;
    }

    public void remove(int index){
        if ((index > this.index) || (index < 0)){
            throw new ArrayIndexOutOfBoundsException("Индекс находится вне границ массива");
        }
        System.arraycopy(list, index + 1, list, index, this.index - index);
        this.index--;
    }
}