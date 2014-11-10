import static org.junit.Assert.*;

public class MyArrayListTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        MyArrayList testArr = new MyArrayList();
        testArr.add(1);
        testArr.add(5);
        testArr.add(2);
        testArr.add(7);
        MyArrayList expectingResult = new MyArrayList(new int[]{1, 5, 2, 7});
        assertEquals(testArr, expectingResult);
    }

    @org.junit.Test
    public void testGetByIndex() throws Exception {
        MyArrayList tesrArr = new MyArrayList(new int[]{1, 5, 2, 7});
        int result = tesrArr.getByIndex(1);
        int expectidResult = 5;
        assertEquals(result, expectidResult);
    }

    @org.junit.Test
    public void testGetByIndexWithIndexOutOfBounds() throws Exception {
        MyArrayList tesrArr = new MyArrayList(new int[]{1, 5, 2, 7});
        int result = tesrArr.getByIndex(9);

    }

    @org.junit.Test
    public void testSort() throws Exception {
        MyArrayList testArr = new MyArrayList();
        testArr.add(1);
        testArr.add(5);
        testArr.add(2);
        testArr.add(7);
        MyArrayList expectingResult = new MyArrayList(new int[]{1, 2, 5, 7});
        assertEquals(testArr, expectingResult);
    }

    @org.junit.Test
    public void testMin() throws Exception {
        MyArrayList testArr = new MyArrayList();
        testArr.add(1);
        testArr.add(5);
        testArr.add(2);
        testArr.add(7);
        Integer result = testArr.min();
        Integer expectingResult = 1;
        assertEquals(result, expectingResult);
    }

    @org.junit.Test
    public void testMax() throws Exception {
        MyArrayList testArr = new MyArrayList();
        testArr.add(1);
        testArr.add(5);
        testArr.add(2);
        testArr.add(7);
        Integer result = testArr.max();
        Integer expectingResult = 7;
        assertEquals(result, expectingResult);
    }

    @org.junit.Test
    public void testFound() throws Exception {
        MyArrayList testArr = new MyArrayList();
        testArr.add(1);
        testArr.add(5);
        testArr.add(2);
        testArr.add(7);
        Integer result = testArr.found(2);
        Integer expectingResult = 2;
        assertEquals(result, expectingResult);
    }

    @org.junit.Test
    public void testRemove() throws Exception {
        MyArrayList testArr = new MyArrayList();
        testArr.add(1);
        testArr.add(5);
        testArr.add(2);
        testArr.add(7);
        testArr.remove(2);
        MyArrayList expectingResult = new MyArrayList(new int[]{1, 5, 7});
        assertEquals(testArr, expectingResult);
    }
}