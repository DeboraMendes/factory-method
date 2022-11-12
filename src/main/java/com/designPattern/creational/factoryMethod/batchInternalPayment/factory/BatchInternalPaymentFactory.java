package com.designPattern.creational.factoryMethod.batchInternalPayment.factory;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.ProductBatchInternalPayment;

/**
 * Representa a fábrica para criação de pagamento interno em lote.
 */
public interface BatchInternalPaymentFactory {

    BatchInternalPaymentType getBatchInternalPaymentType();

    ProductBatchInternalPayment createBatchInternalPayment();

}
