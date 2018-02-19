package observer2;

import java.util.Observable;

public class JdkConcreteSubject extends Observable {

    private String  status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        super.setChanged();
    }
}
