package bridge;

public abstract class PhoneBrand {
    protected PhoneSoftware software;

    public void setPhoneSoftware(PhoneSoftware software){
        this.software = software;
    }

    public abstract void run();
}
