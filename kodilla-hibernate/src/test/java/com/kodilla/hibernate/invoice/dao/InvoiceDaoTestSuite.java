package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item1 = new Item(new Product("xyz"), new BigDecimal(100), 22 );
        Item item2 = new Item(new Product("xxx"), new BigDecimal(200), 30);

        Invoice invoice = new Invoice("2222222", Arrays.asList(item1, item2));

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();


        //Then
        assertEquals(id, invoiceDao.findOne(id).getId());

        //Clean up
        invoiceDao.delete(invoice);
    }
}