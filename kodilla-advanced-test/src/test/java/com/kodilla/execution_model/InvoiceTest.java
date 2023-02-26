package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    Invoice invoice = new Invoice();
    Item tea = new Item("Tea", 1.75);
    Item sugar = new Item("sugar", 4.80);
    Item lemon = new Item("Lemon", 1.30);

    @Test
    public void addingNewElementsToListAndCheckingNUmberOfElementsOnList() {
        invoice.addItem(tea);
        invoice.addItem(sugar);
        invoice.addItem(lemon);

        int numberOfItems = invoice.getSize();
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetNameAndPriceOfAnItem() {
        invoice.addItem(tea);
        invoice.addItem(sugar);
        invoice.addItem(lemon);

        Item result = invoice.getItem(0);
        assertEquals("Tea", result.getName());
        assertEquals(1.75, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullIfIndexIsNegativeOrFromOutOfTheList() {
        invoice.addItem(tea);
        invoice.addItem(sugar);
        invoice.addItem(lemon);

        assertEquals(null,invoice.getItem(-1));
        assertEquals(null,invoice.getItem(4));
    }
    @Test
    public void shouldReturnZeroIfListWillBeCleared(){
        invoice.addItem(tea);
        invoice.addItem(sugar);
        invoice.addItem(lemon);
        int checkingNumberOfItemsBeforeClear = invoice.getSize();

        invoice.clear();

        assertEquals(3,checkingNumberOfItemsBeforeClear);
        assertEquals(0,invoice.getSize());
    }
}