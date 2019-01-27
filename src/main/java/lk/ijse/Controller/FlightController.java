package lk.ijse.Controller;
import lk.ijse.Model.Flight;
import lk.ijse.Service.FlightService;
import lk.ijse.dto.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Flight")
public class FlightController {

    @Autowired
    private FlightService flightService;
    
    //add flight

    @PostMapping("/addflight")
    public void addflight(@RequestBody FlightDTO flightDTO){
        flightService.addFlight(flightDTO);
    }
    
    // get All flights
    @GetMapping("/allFlight")
    public List<FlightDTO> getAll(){
        return flightService.getAllFlights();
    }
    // delete flight

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Integer id){
        flightService.deleteFlight(id);
    }
    
    // update flight
    @PutMapping("updateFlight")
    public void updateFlight(@RequestBody FlightDTO flightDTO ){
        flightService.updateFlight(flightDTO);
    }
    
    // search flight by two names

    @GetMapping("/findName/{fromcity}/{tocity}")
    public Flight searchCustomer(@PathVariable String fromcity,String Tocity){
        System.out.println(fromcity);
        return flightService.searchflight(fromcity,Tocity);

    }



//    @GetMapping("/findName/{name}")//    public List serchFlight(@PathVariable String name){
//        return flightService.searchByName(name);
//    }





}
