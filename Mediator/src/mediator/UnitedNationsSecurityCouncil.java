package mediator;

public class UnitedNationsSecurityCouncil implements UnitedNations {

    private America america;

    protected Iraq iraq;

    @Override
    public void declare(String message, Country country) {
        if(country == america){
            iraq.receiveMessage(message);
        }
        if(country == iraq){
            america.receiveMessage(message);
        }
    }

    public America getAmerica() {
        return america;
    }

    public void setAmerica(America america) {
        this.america = america;
    }

    public Iraq getIraq() {
        return iraq;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }
}
