package Task1;
import java.math.BigDecimal;
import java.util.ArrayList;
public class DiscountBill2 {
    private boolean regularCustomer;
    private int discountCount;
    private double discountAmount;

    public void DiscountBill(Employee clerk, boolean regularCustomer) {
        super(clerk);
        this.regularCustomer = regularCustomer;
        this.discountCount = 0;
        this.discountAmount = 0.0;
    }

    public void add(Item i) {
        super.add(i);

        if (regularCustomer && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }


    public double getTotal() {
        double total = super.getTotal();

        if (!regularCustomer) {
            return total;
        }

        return Math.round((total - discountAmount) * 100.0) / 100.0;
    }

    public int getDiscountCount() {
        return regularCustomer ? discountCount : 0;
    }

    public double getDiscountAmount() {
        return regularCustomer ? discountAmount : 0.0;
    }

    public double getDiscountPercent() {
        if (!regularCustomer) return 0.0;

        double full = super.getTotal();
        double withDiscount = getTotal();

        if (full == 0) return 0.0;

        return 100 - (withDiscount * 100) / full;
    }
}
