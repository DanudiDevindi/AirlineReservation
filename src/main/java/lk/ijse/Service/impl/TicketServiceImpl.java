package lk.ijse.Service.impl;
import lk.ijse.Model.Ticket;
import lk.ijse.Repocitory.TicketRepo;
import lk.ijse.Service.TicketService;
import lk.ijse.dto.TicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo ticketRepo;



    @Override
    public void deleteTicket(Integer id) {
        ticketRepo.deleteById(id);

    }

    @Override
    public void addTicket(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket(ticketDTO.getTocity(),ticketDTO.getFromcity(),ticketDTO.getDate(),ticketDTO.getPasengerNo(),ticketDTO.getFclass());
        ticketRepo.save(ticket);
    }

    @Override
    public List<TicketDTO> getAllTicket() {
        List<TicketDTO> list = new ArrayList<>();
        List<Ticket> allTik = ticketRepo.findAll();
        for(Ticket t: allTik){
            list.add(new TicketDTO(t.getTid(),t.getTocity(),t.getFromcity(),t.getDate(),t.getPasengerNo(),t.getFclass()));

        }
        return list;
    }


}
