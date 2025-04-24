package nikoloz_chomakhidze_1.midterm1.t2.sub;

import nikoloz_chomakhidze_1.midterm1.t2.yogurt.A21;
import nikoloz_chomakhidze_1.midterm1.t2.recipe.wig.A22;

public class R21 {
    public static void main(String[] args) {
        A21 rectangle = new A21();
        A22 monthInfo = new A22();

        // Area of rectangle
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of the rectangle: " + area);

        // Get month name using A22
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        int monthNumber = monthInfo.getMonth();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month: " + months[monthNumber - 1]);
        } else {
            System.out.println("Invalid month number");
        }
    }
}
