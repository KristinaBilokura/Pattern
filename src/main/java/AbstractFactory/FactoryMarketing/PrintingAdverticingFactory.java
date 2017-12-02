package AbstractFactory.FactoryMarketing;

import AbstractFactory.Advertising;
import AbstractFactory.PrintingFlyers;

public class PrintingAdverticingFactory implements MarketingFactory {
    @Override
    public Advertising create() {
        return new PrintingFlyers();
    }
}
