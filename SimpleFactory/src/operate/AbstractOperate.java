package operate;

import java.util.List;

/**
 * 抽象运算类
 */
public abstract class AbstractOperate {

    private List<Double> inputs;

    public abstract Boolean checkInputs() throws Exception;

    public abstract Double getResult() throws Exception;

    public List<Double> getInputs() {
        return inputs;
    }

    public void setInputs(List<Double> inputs) {
        this.inputs = inputs;
    }
}
