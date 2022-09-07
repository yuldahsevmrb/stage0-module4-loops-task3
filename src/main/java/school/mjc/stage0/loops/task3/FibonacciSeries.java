package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int last = 0;
        int prelast = 1;
        if(lastFibonacci > 1){
            System.out.println(last);
            System.out.println(prelast);
            for (int i = 2; i < lastFibonacci; i++ ) {
                int current = last + prelast;
                System.out.println(last + prelast);
                last = prelast;
                prelast = current;
            }
        }
    }
}
