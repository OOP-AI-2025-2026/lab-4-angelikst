package ua.opnu.task_1;

import java.util.ArrayList;

public class DiscountBill2 {
    private boolean regularCustomer;
    private ArrayList<Item> items;

    public void DiscountBill2(Employee clerk, boolean isRegular) {
        super(clerk);
        this.regularCustomer = isRegular;
        this.items = getItems();
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
        for (Item it : items)
            if (it.getDiscount() > 0 && regularCustomer) discountCounter++;
        return discountCounter;
    }
}
