
import junit.framework.Assert;
import org.junit.Test;
import tdd.Dollar;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author andre
 */
public class MoneyTest {

    public MoneyTest() {
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }
}
