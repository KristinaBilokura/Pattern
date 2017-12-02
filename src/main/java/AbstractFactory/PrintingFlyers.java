package AbstractFactory;

public class PrintingFlyers implements Advertising {
    @Override
    public void write(){
        System.out.println("Prist the flyers");
    }
}
