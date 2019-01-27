package lk.ijse.Service;


import lk.ijse.dto.passengerDTO;

import java.util.List;

public interface PassengerService {
    void savePasenger(passengerDTO pasenger);

    List<passengerDTO> getAllPasenger();
}
