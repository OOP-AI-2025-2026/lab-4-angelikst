package ua.opnu.task_1;
import java.util.ArrayList;

public class DiscountBill extends GroceryBill {

    private boolean regularCustomer;

    public DiscountBill(Employee clerk, boolean isRegular) {
        super(clerk);
        this.regularCustomer = isRegular;
    }

    public double getTotal() {
        double total;
        if (!regularCustomer)
            total = super.getTotal();
        else
            total = super.getTotal() - getDiscountAmount();

        return Math.round(total * 100.0) / 100.0;
    }

    public int getDiscountCount() {
        int discountCounter = 0;
        for (Item it : getItems())
            if (it.getDiscount() > 0 && regularCustomer) discountCounter++;
        return discountCounter;
    }

    public double getDiscountAmount() {
        double discountSum = 0;
        for (Item it : getItems())
            if (it.getDiscount() > 0 && regularCustomer) discountSum += it.getDiscount();
        return discountSum;
    }

    public double getDiscountPercent() {
        double totalFull = super.getTotal();
        double totalAfterDiscount = getTotal();

        if (totalFull == 0) return 0.0;

        double percent = 100 - ((totalAfterDiscount * 100) / totalFull);

        return Math.round(percent * 100.0) / 100.0;
    }
}
