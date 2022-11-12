package com.designPattern.creational.factoryMethod.batchInternalPayment;

import com.designPattern.creational.factoryMethod.batchInternalPayment.factory.BatchInternalPaymentFactory;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.ProductBatchInternalPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Responsável pela gerência das fábricas para criação de pagamento interno em lote.
 */
@Service
@RequiredArgsConstructor
public class BatchInternalPaymentFactoryManager {

    private final List<BatchInternalPaymentFactory> batchInternalPaymentFactories;

    public ProductBatchInternalPayment createBatchInternalPayment(BatchInternalPaymentType type) {
        return batchInternalPaymentFactories.stream()
                .filter(factory -> type.equals(factory.getBatchInternalPaymentType()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Fábrica não encontrada para o tipo: " + type.name()))
                .createBatchInternalPayment();
    }

}