package operate;

public class DivOperate extends TwoInputsOperate {

    private Double ILLEGAL_DIVISOR = 0d;

    @Override
    public Boolean checkInputs() throws Exception {
        if(super.checkInputs()){
            if(ILLEGAL_DIVISOR.equals(getInputs().get(0))){
                throw new Exception("Error Inputs");
            }
            return true;
        }
        return false;
    }

    @Override
    public Double getResult() throws Exception {
        if(checkInputs()){
            return getInputs().get(0) / getInputs().get(1);
        }
        throw new Exception("Error Inputs");
    }
}
