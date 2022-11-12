package com.designPattern.creational.factoryMethod.batchInternalPayment.factory;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.ProductBatchInternalPayment;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.SalaryProductBatchInternalPayment;
import org.springframework.stereotype.Service;

/**
 * Representa a fábrica especialização na criação de pagamento interno em lote de salário.
 */
@Service("salaryBatchInternalPayment")
public class SalaryProductBatchInternalPaymentFactory implements BatchInternalPaymentFactory {

    @Override
    public BatchInternalPaymentType getBatchInternalPaymentType() {
        return BatchInternalPaymentType.SALARY;
    }

    @Override
    public ProductBatchInternalPayment createBatchInternalPayment() {
        return new SalaryProductBatchInternalPayment();
    }

}
