package Task1;
import java.math.BigDecimal;
import java.util.ArrayList;

public class DiscountBill extends GroceryBill {
    private boolean regularCustomer;
    private ArrayList<Item> itemsList = getItems();

    public DiscountBill(Employee clerk, boolean regularCustomer) {
        super(clerk);
        this.regularCustomer = regularCustomer;
    }

    public double getTotal() {
        if (!regularCustomer) return super.getTotal();
        else {
            return Math.round((super.getTotal() - getDiscountAmount()) * 100) / 100.0;
        }
        public int getDiscountCount () {

            int count = 0;

            for (Item it : itemsList)
                if if (it.getDiscount() > 0 && regularCustomer)
                count++;


            return count;

        }
        public double getDiscountAmount() {
            double amount = 0;
            if (!regularCustomer) {
                return 0;
            }
            for (Item item : itemsList) {

                amount += item.getDiscount();
            }  return Math.round(amount * 100) / 100.0;
        }
        public double getDiscountPercent() {
            return Math.round((100 - ((getTotal() * 100) / super.getTotal())) * 1e13) / 1e13;
        }
    }
}
