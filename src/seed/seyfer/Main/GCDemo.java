package seed.seyfer.Main;

/**
 * Created by seyfer on 12/27/15.
 */
class GCDemo
{
    public static void main(String args[]) {
        int i;
        long a;
        Runtime r = Runtime.getRuntime();
        Long values[] = new Long[2000];

        System.out.println("Amount of free memory is " + r.freeMemory());

        for (a = 100000, i = 0; i < 2000; a++, i++) {
            values[i] = a;
        }

        System.out.println("Amount of free memory after creating array is " + r.freeMemory());

        for (i = 0; i < 2000; i++) {
            values[i] = null;
        }

        r.gc();
        System.out.println("Amount of free memory after garbage collection is " + r.freeMemory());
    }
}
