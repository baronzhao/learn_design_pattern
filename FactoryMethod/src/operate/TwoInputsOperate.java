package operate;

public class TwoInputsOperate extends AbstractOperate {

    private static int LEGAL_INPUTS_SIZE = 2;

    @Override
    public Boolean checkInputs() throws Exception {
        if(getInputs() != null && LEGAL_INPUTS_SIZE == getInputs().size()){
            return true;
        }
        return false;
    }

    @Override
    public Double getResult() throws Exception {
        return null;
    }
}
