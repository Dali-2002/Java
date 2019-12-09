public class Dice
{

    public int roll() {
        int value = (int)(Math.random()*6)+1;
        return value;
    }
    
    public void rollOnce() {
        System.out.println(roll());
    }
    
    public void roll1000() {
        int[] rollValues = new int[6];
        for(int i = 0; i < 1000; i++) {
            int x = roll();
            for(int z = 0; z<rollValues.length; z++){
            if(x == z+1) {
                rollValues[z] ++;
            }
        }
        }
        
        for(int j = 0; j<rollValues.length; j++){
            System.out.println("rolled " + rollValues[j] + " times " + (j+1) );
        }
    }
}
