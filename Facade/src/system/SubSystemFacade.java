package system;

public class SubSystemFacade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    private SubSystemThree subSystemThree;

    private SubSystemFour subSystemFour;

    public SubSystemFacade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void showOneAndTwo(){
        subSystemOne.show();
        subSystemTwo.show();
    }

    public void showOneAndFour(){
        subSystemOne.show();
        subSystemFour.show();
    }

    public void showTwoAndThree(){
        subSystemTwo.show();
        subSystemThree.show();
    }
}
