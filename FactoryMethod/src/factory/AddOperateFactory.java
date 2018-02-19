package factory;

import operate.AbstractOperate;
import operate.AddOpreate;

public class AddOperateFactory implements OperaterFactoryInterface {

    @Override
    public AbstractOperate createOperate() {
        return new AddOpreate();
    }
}
