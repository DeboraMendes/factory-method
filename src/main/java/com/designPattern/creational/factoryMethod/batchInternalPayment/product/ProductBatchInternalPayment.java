package com.designPattern.creational.factoryMethod.batchInternalPayment.product;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;

/**
 * Representa o modelo do que é comum para todos os pagamentos internos em lote.
 */
public interface ProductBatchInternalPayment {

    Long getId();

    String getDescription();

    BatchInternalPaymentType getType();

}
