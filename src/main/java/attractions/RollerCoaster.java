package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity , ITicketed {
    Visitor visitor;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo() {
        if (visitor.getAge() > 12)
            if (visitor.getHeight() > 145) {
                return true;
            }
        return false;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor() {
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
