import java.util.ArrayList;
public class StepTracker {
    /* to be implemented here */
    private int min;
    private ArrayList<Integer> steps = new ArrayList<Integer>();

    public StepTracker(int foo) {
        min = foo;
    }

    public void addDailySteps(int in) {
        steps.add(in);
    }

    public int activeDays() {
        int actives = 0;
        for (int day : steps) {
            if (day >= min) actives++;
        }
        return actives;
    }

    public double averageSteps() {
        double baz = 0;
        int days = 0;
        for (int day : steps) {
            days++;
            baz += day;
        }
        if (days == 0) return 0.0;
        return (double)(baz) / days;
    }
} 
