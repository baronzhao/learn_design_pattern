package factory;

import operate.AbstractOperate;
import operate.DivOperate;

public class DivOperateFactory implements OperaterFactoryInterface {

    @Override
    public AbstractOperate createOperate() {
        return new DivOperate();
    }
}
