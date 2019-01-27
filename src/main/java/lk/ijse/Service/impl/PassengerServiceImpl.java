package lk.ijse.Service.impl;

import lk.ijse.Model.Pasenger;
import lk.ijse.Repocitory.passengerRepo;
import lk.ijse.Service.PassengerService;
import lk.ijse.dto.passengerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private passengerRepo passengerRepo;

    @Override
    public void savePasenger(passengerDTO pasenger) {
        Pasenger pasenger1=new Pasenger(pasenger.getPassword(),pasenger.getName(),
                pasenger.getTp(),pasenger.getEmail(),pasenger.getDob(),pasenger.getAddress(),
                pasenger.getCity(),pasenger.getCountry());
        passengerRepo.save(pasenger1);
        System.out.println(pasenger);
    }

    @Override
    public List<passengerDTO> getAllPasenger() {
        List<passengerDTO> list= new ArrayList<>();
        List<Pasenger> allpas = passengerRepo.findAll();
        for(Pasenger p:allpas){
            list.add(new passengerDTO(p.getPaid(),p.getPassword(),p.getName(),p.getTp(),p.getEmail(),p.getDob(),
                    p.getAddress(),p.getCity(),p.getCountry()));
        }
        return list;
    }
}
