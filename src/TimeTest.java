import java.util.Random;

public class TimeTest {
    public static void test(MyIntList testedList, int elementCount){
        System.out.print("\n" + testedList.getClass().getName() + " tested\n");
        long startTime = System.currentTimeMillis();
        Random rnd = new Random();
        for (int i = 0; i < elementCount; i++) {
            testedList.add(rnd.nextInt(elementCount));
        }
        long endTime = System.currentTimeMillis();
        System.out.print("Method add for " + elementCount + " elements: " + (endTime - startTime) + " millis\n");

        startTime = System.currentTimeMillis();
        testedList.Sort();
        endTime = System.currentTimeMillis();
        System.out.print("Method sort for " + elementCount + " elements: " + (endTime - startTime) + " millis\n");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            testedList.found(rnd.nextInt(elementCount));
        }
        endTime = System.currentTimeMillis();
        System.out.print("Method found for " + elementCount + " elements: " + (endTime - startTime) + " millis\n");

        startTime = System.currentTimeMillis();
        testedList.min();
        endTime = System.currentTimeMillis();
        System.out.print("Method min for " + elementCount + " elements: " + (endTime - startTime) + " millis\n");

        startTime = System.currentTimeMillis();
        testedList.max();
        endTime = System.currentTimeMillis();
        System.out.print("Method max for " + elementCount + " elements: " + (endTime - startTime) + " millis\n");
    }

}
