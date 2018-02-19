package observer3;

import java.util.Date;

public class ReadableObserverOne {

    public void showDate(Date date){
        System.out.println("ReadableObserverOne show date: " + date.toString());
    }
}
