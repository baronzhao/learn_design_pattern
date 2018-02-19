package cashierdesk;

public class ReturnDiscount extends AbstractDiscount {

    private Double conditionPrice;
    private Double returnAmount;

    public ReturnDiscount(Double conditionPrice, Double returnAmount) {
        this.conditionPrice = conditionPrice;
        this.returnAmount = returnAmount;
    }

    @Override
    public Double discout() {
        if(getTotalPrice() >= conditionPrice){
            return getTotalPrice() - Math.floor(getTotalPrice()/conditionPrice) * returnAmount;
        }
        return getTotalPrice();
    }
}
