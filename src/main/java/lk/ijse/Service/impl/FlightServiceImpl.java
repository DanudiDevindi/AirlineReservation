package lk.ijse.Service.impl;

import lk.ijse.Model.Flight;
import lk.ijse.Repocitory.FlightRepo;
import lk.ijse.Service.FlightService;
import lk.ijse.dto.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepo flightRepo;
    @Override
    public void addFlight(FlightDTO flightDTO) {
        Flight flight = new Flight(flightDTO.getTocity(),flightDTO.getFromcity(),flightDTO.getDeparture(),flightDTO.getArrival(),flightDTO.getFlightname(),flightDTO.getPrice());
        flightRepo.save(flight);


    }

    @Override
    public List<FlightDTO> getAllFlights() {
        List<FlightDTO> list= new ArrayList<>();
        List<Flight> allFli = flightRepo.findAll();
        for(Flight f: allFli){
            list.add(new FlightDTO(f.getTocity(),f.getFromcity(),f.getDeparture(),f.getArrival(),f.getFlightname(),f.getPrice()));

        }
        return list;
    }

    @Override
    public void deleteFlight(Integer id) {
        flightRepo.deleteById(id);


    }

    @Override
    public void updateFlight(FlightDTO flightDTO) {
        Flight flight = new Flight(flightDTO.getFid(),flightDTO.getTocity(),flightDTO.getFromcity(),flightDTO.getDeparture(),flightDTO.getArrival(),flightDTO.getFlightname(),flightDTO.getPrice());
        if(flight.getFid()!=null){
            flightRepo.save(flight);


          }

        }

    @Override
    public Flight searchflight(String fromcity, String tocity) {
        System.out.println(fromcity);
        Flight flights=flightRepo.findByStatusAndNameNamedParamsNative(fromcity,tocity);
        System.out.println(flights);
        return flights;
    }
}

//    @Override
//    public List searchByName(String name) {
//        return flightRepo.findByNameLike(name);
//    }

