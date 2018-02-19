package operate;

/**
 * 乘法运算类
 */
public class MulOperate extends TwoInputsOperate {

    @Override
    public Double getResult() throws Exception {
        if(checkInputs()){
            return getInputs().get(0) * getInputs().get(1);
        }
        throw new Exception("Error Inputs");
    }
}
