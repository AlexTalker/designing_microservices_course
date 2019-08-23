package com.microservices.accounting.service;

import com.microservices.accountingservice.api.dto.InvokePaymentDto;
import com.microservices.accountingservice.api.dto.PaymentDetailsDto;

public interface PaymentService {

    PaymentDetailsDto invokePayment(InvokePaymentDto invokePaymentDto);

    PaymentDetailsDto revertPayment(int paymentId);
}
