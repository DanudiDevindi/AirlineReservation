package lk.ijse.Controller;
import lk.ijse.Model.Ticket;
import lk.ijse.Service.TicketService;
import lk.ijse.dto.TicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/addTicket")
   public void addTicket(@RequestBody TicketDTO ticketDTO){
        ticketService.addTicket(ticketDTO);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteTicket(@PathVariable Integer id){

        ticketService.deleteTicket(id);
    }
    @GetMapping("/allTicket")
    public List<TicketDTO> getAll(){
        return ticketService.getAllTicket();
    }


}
