package lk.ijse.Controller;


import lk.ijse.Model.Pasenger;
import lk.ijse.Service.PassengerService;
import lk.ijse.dto.passengerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("passenger")
public class passengerController {

    @Autowired
    private PassengerService passengerService;

@PostMapping("/addPasenger")
    public void addPasenger(@RequestBody passengerDTO pasengerdto){
    passengerService.savePasenger(pasengerdto);
    System.out.println("controller"+pasengerdto);
}

@GetMapping("/allPasenger")
    public List<passengerDTO>getAll(){
    	System.out.println("allPasenger");
    return passengerService.getAllPasenger();
}




}
