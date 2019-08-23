package com.microservices.accounting.service;

import com.microservices.accounting.dto.PaymentDetailsDto;
import com.microservices.accountingservice.api.dto.InvokePaymentDto;

public interface PaymentService {

    PaymentDetailsDto invokePayment(InvokePaymentDto invokePaymentDto);

    PaymentDetailsDto revertPayment(int paymentId);
}
