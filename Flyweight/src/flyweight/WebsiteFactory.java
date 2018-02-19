package flyweight;

import java.util.HashMap;

public class WebsiteFactory {

    private HashMap<String, Website> flyweights = new HashMap<String, Website>();

    public Website websiteFromType(String type){

        if(!flyweights.containsKey(type)){
            flyweights.put(type, new ConcreteWebsite(type));
        }
        return flyweights.get(type);
    }

    public int size(){
        return flyweights.size();
    }
}
