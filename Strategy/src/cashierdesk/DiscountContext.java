package cashierdesk;

public class DiscountContext {

    DiscountIterface discountIterface = null;

    public DiscountContext(Double totalPrice, Integer discountType) {
        AbstractDiscount abstractDiscount = null;
        switch (discountType){
            case 1:
                abstractDiscount = new RebateDiscount(0.8D);
                break;
            case 2:
                abstractDiscount = new RebateDiscount(0.5D);
                break;
            case 3:
                abstractDiscount = new ReturnDiscount(300D,80D);
                break;
            case 4:
                abstractDiscount = new ReturnDiscount(100D,20D);
                break;
            case 0:
            default:
                abstractDiscount = new RebateDiscount(1D);
                break;
        }
        abstractDiscount.setTotalPrice(totalPrice);
        this.discountIterface = abstractDiscount;
    }

    public Double getPayPriceResult(){
        return discountIterface.discout();
    }
}
