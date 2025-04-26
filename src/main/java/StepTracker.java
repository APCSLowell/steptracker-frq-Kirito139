import java.util.ArrayList;
public class StepTracker {
    /* to be implemented here */
    private int min;
    private ArrayList<Integer> steps = new ArrayList<Integer>();

    public StepTracker(int min) {
        this.min = min;
    }

    public void addDailySteps(int in) {
        steps.add(in);
        return;
    }

    public int activeDays() {
        int foo = 0;
        for (int day : steps) {
            if (day >= min) foo ++;
        }
        return foo;
    }

    public double averageSteps() {
        double baz = 0;
        int days = 0;
        for (int day : steps) {
            days ++;
            baz += day;
        }
        return (double)(baz) / days;
    }
} 
