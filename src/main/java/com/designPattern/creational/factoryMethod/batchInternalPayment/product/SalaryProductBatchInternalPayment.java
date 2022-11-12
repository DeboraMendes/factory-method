package com.designPattern.creational.factoryMethod.batchInternalPayment.product;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;
import lombok.Data;

import java.time.YearMonth;

/**
 * Representa o modelo de especialização de pagamento interno em lote de salário.
 */
@Data
public class SalaryProductBatchInternalPayment implements ProductBatchInternalPayment {

    private Long id;
    private String description;
    private BatchInternalPaymentType type;
    private YearMonth yearMonth;

}
