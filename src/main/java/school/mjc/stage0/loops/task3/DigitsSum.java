package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public void printDigitsSum(int t){
        int result = 0;

        int x = t;
        for (int i = 0; i <= String.valueOf(t).length()+1; i++){
            int ostatok = x%10;
            x /=10;
            result += Math.abs(ostatok);
        }
        System.out.println(result);

    }
}
