package AbstractFactory;

public class Media implements Advertising {
    @Override
    public void write(){
        System.out.println("Video advertising");
    }
}
