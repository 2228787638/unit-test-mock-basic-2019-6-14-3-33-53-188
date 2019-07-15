package cashregister;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        Item item =new Item("item",5);
        Item items []={item};
        FakePrinter fakePrinter = new FakePrinter();
        Purchase purchase = new Purchase(items);
        Printer printer =new Printer();
        CashRegister cashRegister = new CashRegister(fakePrinter);
        //when
        cashRegister.process(purchase);
        //then
        Assertions.assertTrue(fakePrinter.isCalled());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        FakePurchase fakePurchase = new FakePurchase();
        FakePrinter fakePrinter =new FakePrinter();
        fakePurchase.setMessage("Test");
        CashRegister cashRegister = new CashRegister(fakePrinter);
        //when
        cashRegister.process(fakePurchase);
        //then
        Assertions.assertEquals(fakePrinter.printString(),fakePurchase.asString());
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        

    }

}
