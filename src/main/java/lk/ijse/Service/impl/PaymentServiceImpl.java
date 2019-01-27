package lk.ijse.Service.impl;

import lk.ijse.Model.Payment;
import lk.ijse.Repocitory.PaymentRepo;
import lk.ijse.Service.PaymentService;
import lk.ijse.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public void savePayment(PaymentDTO paymentDTO) {
        Payment payment = new Payment(paymentDTO.getName(),paymentDTO.getCountry(),paymentDTO.getBankname(),paymentDTO.getCreditcardno(),paymentDTO.getFlightname(),paymentDTO.getPrice());
        paymentRepo.save(payment);
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        List<PaymentDTO> list = new ArrayList<>();
        List<Payment> allpay = paymentRepo.findAll();
        for(Payment p:allpay){
            list.add(new PaymentDTO(p.getPid(),p.getName(),p.getCountry(),p.getBankname(),p.getCreditcardno(),p.getFlightname(),p.getPrice()));

        }
        return list;
    }
}

