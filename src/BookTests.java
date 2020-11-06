/*import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class BookTests {

    @Test public void testBookConstructor1() {
        Asset b1 = new Asset("dumb book");

    }
    @Test public void testBookConstructor2() {
        // Book b1 = new Book("dumb book", "john");
        //   Assert.assertEquals(b1.getRenter(), "john");

    }
    @Test public void testGetName() {
        Asset b1 = new Asset("dumb book");
        Assert.assertEquals(b1.getName(), "dumb book");
        Asset b2 = new Asset("dumber book");
        Assert.assertEquals(b2.getName(), "dumber book");
        Assert.assertEquals(b1.getName(), "dumb book");
    }
    @Test public void testRent() {
        Asset b2 = new Asset("dumber book");
        Asset b1 = new Asset("dumb book");
        Assert.assertNull(b1.getRenter());
        Assert.assertNull(b2.getRenter());
        Assert.assertNull(b1.getDueDate());
        Assert.assertNull(b2.getDueDate());
        b1.rent("jorge");
        Assert.assertEquals("jorge", b1.getRenter() );
        Assert.assertNull(b2.getRenter());
        Assert.assertEquals(b1.getDueDate(), LocalDate.now().plusDays(7));
        Assert.assertNull(b2.getDueDate());


    }
    @Test public void testReturn() {
        Asset b2 = new Asset("dumber book");
        Asset b1 = new Asset("dumb book");
        Assert.assertNull(b1.getRenter());
        Assert.assertNull(b2.getRenter());
        b1.rent("jorge");
        Assert.assertEquals("jorge",b1.getRenter());
        Assert.assertNull(b2.getRenter());
        b1.returnToLibrary();
        Assert.assertNull(b1.getRenter());
        Assert.assertNull(b2.getRenter());

    }



}

 */
