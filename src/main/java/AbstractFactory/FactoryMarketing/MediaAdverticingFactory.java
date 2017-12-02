package AbstractFactory.FactoryMarketing;


import AbstractFactory.Advertising;
import AbstractFactory.Media;

public class MediaAdverticingFactory implements MarketingFactory {
    @Override
    public Advertising create() {
        return new Media();
    }
}
