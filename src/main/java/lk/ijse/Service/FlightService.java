package lk.ijse.Service;

import lk.ijse.Model.Flight;
import lk.ijse.dto.FlightDTO;

import java.util.List;

public interface FlightService {
    void addFlight(FlightDTO flightDTO);

    List<FlightDTO> getAllFlights();

    void deleteFlight(Integer id);

    void updateFlight(FlightDTO flightDTO);

    Flight searchflight(String fromcity, String tocity);

//    List searchByName(String name);
}
