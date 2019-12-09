
public class Population {
    private double populationStart = 7.6;
    private double populationStartGrow = 0.086;
    private int time = 31;
    public void calculate() {
        double multiplikator = (populationStart+populationStartGrow)/populationStart;
        double neuPop = populationStart;
        for(int i = 0; i<time; i++){
            neuPop = neuPop*multiplikator;
            System.out.println(neuPop);
        }
    }
}
//7,6milliarden
//80millionen / 0,086milliarden
