package lk.ijse.Controller;

import lk.ijse.Service.PaymentService;
import lk.ijse.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/addpayment")
    public void addPayment(@RequestBody PaymentDTO paymentDTO){
        paymentService.savePayment(paymentDTO);
        System.out.println("controller"+paymentDTO);
    }
    @GetMapping("/allPayment")
    public List<PaymentDTO> getAll(){
        return paymentService.getAllPayment();
    }
}
