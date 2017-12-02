package AbstractFactory;

import AbstractFactory.FactoryMarketing.BBAdverticingFactory;
import AbstractFactory.FactoryMarketing.MarketingFactory;
import AbstractFactory.FactoryMarketing.MediaAdverticingFactory;
import AbstractFactory.FactoryMarketing.PrintingAdverticingFactory;

public class Marketing {
    public static void main(String[] args) throws Exception {
        MarketingFactory marketingFactory = putType("ff");
        Advertising advertising = marketingFactory.create();
        advertising.write();
    }
    static MarketingFactory putType(String type) throws Exception {
        if(type.equalsIgnoreCase("media")){
            return  new MediaAdverticingFactory();
        }else if(type.equalsIgnoreCase("flyers")){
            return new PrintingAdverticingFactory();
        }else if(type.equalsIgnoreCase("bigboard")){
            return new BBAdverticingFactory();
        }else{
            throw new Exception();
        }
    }
}
