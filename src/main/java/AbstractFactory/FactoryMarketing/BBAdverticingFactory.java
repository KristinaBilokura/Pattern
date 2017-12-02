package AbstractFactory.FactoryMarketing;


import AbstractFactory.Advertising;
import AbstractFactory.BigBoard;



public class BBAdverticingFactory implements MarketingFactory {
    @Override
    public Advertising create() {
        return new BigBoard();
    }
}
