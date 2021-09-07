import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SLinkedTest {
    @Test
    void testAddTail() {
        SLinkedList s = new SLinkedList();
        assertEquals("[]", s.toString(), "Deve imprimir []");
        s.addTail("MSP");
        assertEquals("[MSP]", s.toString(), "Deve imprimir [MSP]");
        s.addTail("ATL");
        assertEquals("[MSP, ATL]", s.toString(), "Deve imprimir [MSP, ATL]");
        s.addTail("BOS");
        assertEquals("[MSP, ATL, BOS]", s.toString(), "Deve imprimir [MSP, ATL, BOS]");
        s.addTail("MIA");
        assertEquals("[MSP, ATL, BOS, MIA]", s.toString(), "Deve imprimir [MSP, ATL, BOS, MIA]");
    }

    //@Test
    //void testRemoveFirst() {
        //SLinkedList s = new SLinkedList();
        //assertEquals("[]", s.toString(), "Deve imprimir []");
        //s.addTail("MSP");
        //assertEquals("[MSP]", s.toString(), "Deve imprimir [MSP]");
        //s.addTail("BOS");
        //assertEquals("[MSP, BOS]", s.toString(), "Deve imprimir [MSP, BOS]");
        //s.removeFirst();
        //assertEquals("[BOS]", s.toString(), "Deve imprimir [BOS]");
        //s.removeFirst();
        //assertEquals("[]", s.toString(), "Deve imprimir []");
        //assertThrows(EmptySLinkedList.class, () -> { s.removeFirst(); });
    //}

}
