import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test

    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NVR", "SPB", 500, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "NVR", 300, 9, 11);
        Ticket ticket3 = new Ticket("MSK", "SPB", 700, 8, 7);
        Ticket ticket4 = new Ticket("MSK", "SPB", 200, 6, 7);
        Ticket ticket5 = new Ticket("MSK", "YAR", 300, 11, 10);
        Ticket ticket6 = new Ticket("YAR", "SPB", 700, 4, 3);
        Ticket ticket7 = new Ticket("TVR", "SPB", 900, 10, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 9, 11);
        Ticket ticket9 = new Ticket("ROS", "SPB", 500, 10, 12);
        Ticket ticket10 = new Ticket("MSK", "ROS", 900, 11, 10);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.search("MSK", "SPB");
        Ticket[] expected = {ticket4, ticket8, ticket3};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test

    public void testSortTickets1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NVR", "SPB", 500, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "NVR", 300, 9, 11);
        Ticket ticket3 = new Ticket("MSK", "SPB", 700, 8, 7);
        Ticket ticket4 = new Ticket("MSK", "SPB", 200, 6, 7);
        Ticket ticket5 = new Ticket("MSK", "YAR", 300, 11, 10);
        Ticket ticket6 = new Ticket("YAR", "SPB", 700, 4, 3);
        Ticket ticket7 = new Ticket("TVR", "SPB", 900, 10, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 9, 11);
        Ticket ticket9 = new Ticket("ROS", "SPB", 500, 10, 12);
        Ticket ticket10 = new Ticket("MSK", "ROS", 900, 11, 10);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.search("NVR", "SPB");
        Ticket[] expected = {ticket1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test

    public void testSortTickets2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NVR", "SPB", 500, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "NVR", 300, 9, 11);
        Ticket ticket3 = new Ticket("MSK", "SPB", 700, 8, 7);
        Ticket ticket4 = new Ticket("MSK", "SPB", 200, 6, 7);
        Ticket ticket5 = new Ticket("MSK", "YAR", 300, 11, 10);
        Ticket ticket6 = new Ticket("YAR", "SPB", 700, 4, 3);
        Ticket ticket7 = new Ticket("TVR", "SPB", 900, 10, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 9, 11);
        Ticket ticket9 = new Ticket("ROS", "SPB", 500, 10, 12);
        Ticket ticket10 = new Ticket("MSK", "ROS", 900, 11, 10);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.search("NVR", "MSK");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testSortTicketsComporator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NVR", "SPB", 500, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "NVR", 300, 9, 11);
        Ticket ticket3 = new Ticket("MSK", "SPB", 700, 8, 7);
        Ticket ticket4 = new Ticket("MSK", "SPB", 200, 6, 7);
        Ticket ticket5 = new Ticket("MSK", "YAR", 300, 11, 10);
        Ticket ticket6 = new Ticket("YAR", "SPB", 700, 4, 3);
        Ticket ticket7 = new Ticket("TVR", "SPB", 900, 10, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 9, 11);
        Ticket ticket9 = new Ticket("ROS", "SPB", 500, 10, 12);
        Ticket ticket10 = new Ticket("MSK", "ROS", 900, 11, 10);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK", "SPB", comparator);
        Ticket[] expected = {ticket3, ticket4, ticket8};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testSortTicketsComporator1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NVR", "SPB", 500, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "NVR", 300, 9, 11);
        Ticket ticket3 = new Ticket("MSK", "SPB", 700, 8, 7);
        Ticket ticket4 = new Ticket("MSK", "SPB", 200, 6, 7);
        Ticket ticket5 = new Ticket("MSK", "YAR", 300, 11, 10);
        Ticket ticket6 = new Ticket("YAR", "SPB", 700, 4, 3);
        Ticket ticket7 = new Ticket("TVR", "SPB", 900, 10, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 9, 11);
        Ticket ticket9 = new Ticket("ROS", "SPB", 500, 10, 12);
        Ticket ticket10 = new Ticket("MSK", "ROS", 900, 11, 10);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("YAR", "SPB", comparator);
        Ticket[] expected = {ticket6};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testSortTicketsComporator2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NVR", "SPB", 500, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "NVR", 300, 9, 11);
        Ticket ticket3 = new Ticket("MSK", "SPB", 700, 8, 7);
        Ticket ticket4 = new Ticket("MSK", "SPB", 200, 6, 7);
        Ticket ticket5 = new Ticket("MSK", "YAR", 300, 11, 10);
        Ticket ticket6 = new Ticket("YAR", "SPB", 700, 4, 3);
        Ticket ticket7 = new Ticket("TVR", "SPB", 900, 10, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 9, 11);
        Ticket ticket9 = new Ticket("ROS", "SPB", 500, 10, 12);
        Ticket ticket10 = new Ticket("MSK", "ROS", 900, 11, 10);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("YAR", "MSK", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }
}
