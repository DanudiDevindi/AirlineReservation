package lk.ijse.Service;


import lk.ijse.Model.Ticket;
import lk.ijse.dto.TicketDTO;

import java.util.List;

public interface TicketService {

    void deleteTicket(Integer id);
    void addTicket(TicketDTO ticketDTO);
    List<TicketDTO> getAllTicket();
}
