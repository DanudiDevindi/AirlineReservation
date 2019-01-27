package lk.ijse.Service;

import lk.ijse.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    void savePayment(PaymentDTO paymentDTO);

    List<PaymentDTO> getAllPayment();
}
