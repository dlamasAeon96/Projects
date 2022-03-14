public class Fibonacci
{ public static int fibonaccirecursive(int e) {
    if (!(e <= 1)) {
        int i = fibonaccirecursive
                (e - 1) + fibonaccirecursive
                (e - 2);
        return i;
    } else { return 0;
    }
}
public static int fibonacciiterative(int t) {
        if(t<=1)
        { return 0;
        }int r=0;
    int k=1;
    int cc=1;
    int i;
    for(i=2;i<=t;i++)
        { r = k + cc;
            cc=k;
            k =r;
        }return r;
    }
    public static void main(String[] args) { int i,Input=36,fib1,fib2;
        System.out.print ("Input\tFibIterative\tFibRecursive\n------  In Nanoseconds");
        System.out.print ("\t------------\n");
        long beginningTime,finishingtime;
        long TimeException1,TimeException2;
        //28 to 36
        for(i=28;i<=Input;i++)
        {
            beginningTime  = System.nanoTime();

            fib1 = fibonacciiterative(i);
            finishingtime  = System.nanoTime();
            TimeException1  = (long)((finishingtime - beginningTime) );
            beginningTime = System.nanoTime();

             fib2 = fibonaccirecursive(i);
            finishingtime = System.nanoTime();
            TimeException2 = (long)((finishingtime - beginningTime) );
            System.out.print(i +"\t\t"+TimeException1+" NS  \t\t\t   "+TimeException2+"\t NS \n");
        }
    }
}