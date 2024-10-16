package discountCalculatorForMembers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class discountCalculatorForMembersTest {

    @Test
    public void memberShipNone() {
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.NONE;

        double originalPrice = 501.01;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals( originalPrice, finalPrice, 0.01);
    }

    @Test
    public void memberShipSilverWithDiscount(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.SILVER;

        double originalPrice = 101.00;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

         assertEquals( 95.95, finalPrice, 0.01 );

    }

    @Test
    public void memberShipSilverWithNoDiscount(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.SILVER;

        double originalPrice = 100.00;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals( 100.00, finalPrice, 0.01 );

    }

    @Test
    public void memberShipSilverLessThan100(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.SILVER;

        double originalPrice = 99.98;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals( 99.98, finalPrice, 0.01 );

    }

    @Test
    public void memberShipGoldGreaterThan50(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.GOLD;

        double originalPrice = 51.01;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals( 45.90, finalPrice, 0.01 );

    }

    @Test
    public void memberShipGoldEquals50(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.GOLD;

        double originalPrice = 50.00;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals( 50.00, finalPrice, 0.01 );

    }

    @Test
    public void memberShipGoldLessThan50(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.GOLD;

        double originalPrice = 49.99;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals( 49.99, finalPrice, 0.01 );

    }

    @Test
    public void memberShipPlatinumGreaterThan100(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.PLATINUM;

        double originalPrice = 101;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals(80.80, finalPrice, 0.01);

    }

    @Test
    public void memberShipPlatinumEqual50(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.PLATINUM;

        double originalPrice = 50;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals(40.00, finalPrice, 0.01);

    }

    @Test
    public void memberShipPlatinumLessThan50(){
        discountCalculator calculator = new discountCalculator();
        discountCalculator.MembershipLevel membership = discountCalculator.MembershipLevel.PLATINUM;

        double originalPrice = 49;
        double finalPrice = calculator.calculateFinalPrice(originalPrice, membership);

        assertEquals(39.2, finalPrice, 0.01);

    }
}
