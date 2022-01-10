package attractions;

import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor() {
        if (visitor.getAge() < 12) {
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }


}
