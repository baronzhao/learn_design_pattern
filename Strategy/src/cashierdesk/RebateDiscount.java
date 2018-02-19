package cashierdesk;

public class RebateDiscount extends AbstractDiscount {

    private Double rebateRate;

    public RebateDiscount(Double rebateRate) {
        this.rebateRate = rebateRate;
    }

    @Override
    public Double discout() {
        return getTotalPrice() * rebateRate;
    }
}
