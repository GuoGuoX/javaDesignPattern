package strategy;

/**
 * 策略模式：
 */
public interface Strategy {
    void getPrice(Double d);
}
//新用户小量 不打折
class NewCustomerPrice implements Strategy{

    @Override
    public void getPrice(Double d) {
        System.out.println("您是新客户~~~交易价格为："+d);
    }
}
//新用户大量 打9.5折
class NewCustomerManyPrice implements Strategy{

    @Override
    public void getPrice(Double d) {
        System.out.println("您是新客户~~~交易价格为："+d*0.95);
    }
}

//老用户小量 打9折
class OldCustomerPrice implements Strategy{

    @Override
    public void getPrice(Double d) {
        System.out.println("您是老客户~~~交易价格为："+d*0.9);
    }
}

//老用户大量 打8.5折
class OldCustomerManyPrice implements Strategy{

    @Override
    public void getPrice(Double d) {
        System.out.println("您是老客户~~~交易价格为："+d*0.85);
    }
}
