package lk.ijse.Repocitory;

import lk.ijse.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {

}
