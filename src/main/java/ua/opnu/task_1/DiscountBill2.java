package ua.opnu.task_1;

import java.util.ArrayList;

public class DiscountBill2 {

    private GroceryBill bill;
    private boolean regularCustomer;

    public DiscountBill2(Employee clerk, boolean isRegular) {
        this.bill = new GroceryBill(clerk);
        this.regularCustomer = isRegular;
    }

    public Employee getClerk() {
        return bill.getClerk();
    }
    public void add(Item item) {
        bill.add(item);
    }
    public ArrayList<Item> getItems() {
        return bill.getItems();
    }
    public double getTotal() {
        double total = bill.getTotal();
        if (!regularCustomer) return total;

        return Math.round((total - getDiscountAmount()) * 100.0) / 100.0;
    }
    public int getDiscountCount() {
        if (!regularCustomer) return 0;

        int count = 0;
        for (Item item : bill.getItems()) {
            if (item.getDiscount() > 0) count++;
        }
        return count;
    }

    public double getDiscountAmount() {
        if (!regularCustomer) return 0.0;

        double sum = 0;
        for (Item item : bill.getItems()) {
            sum += item.getDiscount();
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public double getDiscountPercent() {
        double full = bill.getTotal();
        if (!regularCustomer || full == 0) return 0.0;
        double after = getTotal();
        return 100 - ((after * 100) / full);
    }
}
