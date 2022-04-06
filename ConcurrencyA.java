import java.util.Random;
import static java.lang.System.currentTimeMillis;
class Summation extends Thread {
    private int[] arr;
    private int low, high, partial;
    private Summation(int[] arr, int low, int high)
    {
        this.arr = arr; this.low = low; this.high = Math.min(high, arr.length);
    }
    private int getPartialSum()
    {
        int i = this.partial;
        return i;
    }
    public void run()
    { partial = sum (arr, low, high);
    }
    private static int sum() {
        return sum();
    } public static int sum(int[] arr)
    { return sum(arr, 0, arr.length);
    }
    public static int sum(int[] arr, int low, int high)
    { int total = 0;
        int i;
        for (i = low; i < high; i++) total += arr[i];
        return total;
    }
    public static int parallelSum(int[] arr)
    { return parallelSum(arr, Runtime.getRuntime().availableProcessors());
    }
    private static int parallelSum(int[] arr, int threads)
    { int size = (int) Math.ceil(arr.length * 1.0 / threads);
        Summation[] sums = new Summation[threads];
        for (int i = 0; i < threads; i++) {
            sums[i] = new Summation(arr, i * size, (i + 1) * size);
            sums[i].start();
        }
        try {
            for (Summation sum : sums) {
                sum.join();
            }
        } catch (InterruptedException ignored) { }
        int total = 0;
        for (Summation sum : sums) {
            total += sum.getPartialSum();
        }
        int total1 = total;
        return total1;
       }
    }
    public class ConcurrencyA {
    public static void main(String[] args)
    { Random rand = new Random();
        var arr = new int[200_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }
        long start = currentTimeMillis();
        System.out.println(Summation.sum(arr)); System.out.println ("Single Thread sum >> " +
                (currentTimeMillis() - start));
        start = currentTimeMillis();
        System.out.println(Summation.parallelSum(arr)); System.out.println ("Parallel array sum >> " +
                (currentTimeMillis() - start));
    }
}