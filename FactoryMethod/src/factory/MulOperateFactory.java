package factory;

import operate.AbstractOperate;
import operate.MulOperate;

public class MulOperateFactory implements OperaterFactoryInterface {

    @Override
    public AbstractOperate createOperate() {
        return new MulOperate();
    }
}
