package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction  implements ISecurity{

    Visitor visitor;

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo() {
        if (visitor.getAge() >= 15) {
            return false;
        }
        return true;
    }

}
