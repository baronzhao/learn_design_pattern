package cashierdesk;

public abstract class AbstractDiscount implements DiscountIterface {

    private Double totalPrice;

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
