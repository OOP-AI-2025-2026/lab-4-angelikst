package Task1;

import Task1.Employee;
import Task1.GroceryBill;
import Task1.Item;

import java.util.ArrayList;

public class DiscountBill2 {

    private boolean RegularCustomer;
    private ArrayList<Item> productList = getItems();


    public DiscountBill(Employee clerk, boolean regularCustomer) {
        super(clerk);
        this.RegularCustomer = regularCustomer;
    }

    public double getTotal() {
        if (!RegularCustomer) {
            return super.getTotal();
        }

        double totalAfterDiscount = super.getTotal() - getDiscountAmount();
        return Math.round(totalAfterDiscount * 100) / 100.0;
    }

    public int getDiscountCount() {
        int counter = 0;

        for (Item item : productList) {
            if (RegularCustomer && item.getDiscount() > 0) {
                counter++;
            }
        }

        return counter;
    }

    public double getDiscountAmount() {
        if (!RegularCustomer) {
            return 0.0;
        }
        double discountSum = 0.0;

        for (Item item : productList) {
            discountSum += item.getDiscount();
        }
        return Math.round(discountSum * 100) / 100.0;
    }

    public double getDiscountPercent() {
        double full = super.getTotal();
        double reduced = getTotal();

        if (full == 0) {
            return 0.0;
        }

        double percent = 100 - ((reduced * 100) / full);

        return Math.round(percent * 100) / 100.0;
    }
}