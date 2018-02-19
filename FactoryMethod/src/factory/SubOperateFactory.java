package factory;

import operate.AbstractOperate;
import operate.SubOperate;

public class SubOperateFactory implements OperaterFactoryInterface {

    @Override
    public AbstractOperate createOperate() {
        return new SubOperate();
    }
}
