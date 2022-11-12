package com.designPattern.creational.factoryMethod.batchInternalPayment.factory;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.BetProductBatchInternalPayment;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.ProductBatchInternalPayment;
import org.springframework.stereotype.Service;

/**
 * Representa a fábrica especialização na criação de pagamento interno em lote de aposta.
 */
@Service("betBatchInternalPayment")
public class BetProductBatchInternalPaymentFactory implements BatchInternalPaymentFactory {

    @Override
    public BatchInternalPaymentType getBatchInternalPaymentType() {
        return BatchInternalPaymentType.BET;
    }

    @Override
    public ProductBatchInternalPayment createBatchInternalPayment() {
        return new BetProductBatchInternalPayment();
    }

}
