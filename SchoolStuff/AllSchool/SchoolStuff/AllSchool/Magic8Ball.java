public class Magic8Ball
{

    public Magic8Ball()
    {
        
    }

    public void roll() {
        double value = Math.random();
        if(value<=0.15){
            System.out.println("Nein");
        }
        else if(value<=0.55){
            System.out.println("Ja");
        }
        else {
            System.out.println("Vielleicht");
        }
    }
}
