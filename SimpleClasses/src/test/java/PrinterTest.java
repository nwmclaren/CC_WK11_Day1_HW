import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50,20);
    }

    @Test
    public void checkPages(){
        int pages = printer.getNoPages();
        assertEquals(50,pages);
    }

    @Test
    public void canPrint(){
        printer.print(5,5);
        assertEquals(25,printer.getNoPages());
    }

    @Test
    public void canNotPrint(){
        printer.print(20,5);
        assertEquals(50, printer.getNoPages());
    }

    @Test
    public void checkToner(){
        printer.print( 10, 1);
        assertEquals(10,printer.getToner());
    }

}
