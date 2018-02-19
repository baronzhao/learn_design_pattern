package adapter;

public class LibAdapter implements LibAdapterInterface{
    private ReadOnlyLib lib = new ReadOnlyLib();

    @Override
    public void customMethod(){
        lib.show();
    }
}
