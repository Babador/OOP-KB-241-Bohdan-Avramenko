package lab03;

import java.util.Arrays;

public class Sprint {
    private final int capacity;
    private final int ticketsLimit;
    private Ticket[] tickets;
    private int ticketsCount;

    public Sprint(int capacity, int ticketsLimit) {
        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
        this.tickets = new Ticket[0];
        this.ticketsCount = 0;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted()) {
            return false;
        }
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport == null || bugReport.isCompleted()) {
            return false;
        }
        return addTicket(bugReport);
    }

    private boolean addTicket(Ticket ticket) {
        // 1. Перевірка ліміту кількості тікетів
        if (ticketsCount >= ticketsLimit) {
            return false;
        }

        if (getTotalEstimate() + ticket.getEstimate() > capacity) {
            return false;
        }

        tickets = Arrays.copyOf(tickets, ticketsCount + 1);
        tickets[ticketsCount] = ticket;
        ticketsCount++;
        return true;
    }

    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, tickets.length);
    }

    public int getTotalEstimate() {
        int total = 0;
        for (Ticket ticket : tickets) {
            total += ticket.getEstimate();
        }
        return total;
    }
}