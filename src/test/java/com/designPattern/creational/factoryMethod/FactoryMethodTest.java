package com.designPattern.creational.factoryMethod;

import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentFactoryManager;
import com.designPattern.creational.factoryMethod.batchInternalPayment.BatchInternalPaymentType;
import com.designPattern.creational.factoryMethod.batchInternalPayment.factory.BatchInternalPaymentFactory;
import com.designPattern.creational.factoryMethod.batchInternalPayment.factory.BetProductBatchInternalPaymentFactory;
import com.designPattern.creational.factoryMethod.batchInternalPayment.factory.SalaryProductBatchInternalPaymentFactory;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.BetProductBatchInternalPayment;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.ProductBatchInternalPayment;
import com.designPattern.creational.factoryMethod.batchInternalPayment.product.SalaryProductBatchInternalPayment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

/**
 * O Factory Method, também conhecido como Método Fábrica,
 * é um padrão de projeto criacional que fornece
 * uma interface para criar objetos em uma superclasse,
 * mas permite que as subclasses alterem o tipo de objetos que serão criados.
 */
@RunWith(MockitoJUnitRunner.class)
public class FactoryMethodTest {

    @InjectMocks
    private BatchInternalPaymentFactoryManager batchInternalPaymentFactoryManager;

    @Spy
    private ArrayList<BatchInternalPaymentFactory> batchInternalPaymentFactories;

    @Before
    public void init() {
        batchInternalPaymentFactories.add(new BetProductBatchInternalPaymentFactory());
        batchInternalPaymentFactories.add(new SalaryProductBatchInternalPaymentFactory());
    }

    /**
     * Deve testar se a fábrica retonou a especialização do tipo solicitado.
     */
    @Test
    public void test() {
        ProductBatchInternalPayment bet = batchInternalPaymentFactoryManager.createBatchInternalPayment(BatchInternalPaymentType.BET);
        Assert.assertTrue(bet instanceof BetProductBatchInternalPayment);

        ProductBatchInternalPayment salary = batchInternalPaymentFactoryManager.createBatchInternalPayment(BatchInternalPaymentType.SALARY);
        Assert.assertTrue(salary instanceof SalaryProductBatchInternalPayment);
    }

}