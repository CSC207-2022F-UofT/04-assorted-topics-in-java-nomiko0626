/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
public class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory,
                                List<Drivable>
                                        wishlist,
                                int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a DrivableTrader, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Returns the object's price.
     *
     * @param obj
     * @return the price of the object
     */
    @Override
    public int getSellingPrice(Drivable obj) {
        int super_price = super.getSellingPrice(obj);

        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }

        return super_price + obj.getMaxSpeed();
    }

}
