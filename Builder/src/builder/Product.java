package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<String>();

    public void addPart(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("This product have these parts:");
        String delimiter = null;
        for (String part : parts) {
            if(delimiter != null){
                System.out.print(delimiter);
            }else {
                delimiter = ",";
            }
            System.out.print(part);
        }
    }
}
