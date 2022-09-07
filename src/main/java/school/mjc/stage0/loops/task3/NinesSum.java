package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
         int result = 0;
         int helper = 10;
         for (int i = 1; i <= lengthOfLastNumber; i++){
             result = result + helper-1;
             helper *=10;
         }
        System.out.println(result);

    }
}
