package com.designPattern.creational.factoryMethod.batchInternalPayment.product;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Representa o modelo de especialização de pagamento interno em lote de aposta.
 */
@Data
public class BetProductBatchInternalPayment implements ProductBatchInternalPayment {

    private Long id;
    private String description;
    private BatchInternalPaymentType type;
    private LocalDateTime closingEventDateTime;

}
