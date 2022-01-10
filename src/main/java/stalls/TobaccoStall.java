package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    Visitor visitor;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo() {
        if (visitor.getAge() < 18) {
            return false;
        }
        return true;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
