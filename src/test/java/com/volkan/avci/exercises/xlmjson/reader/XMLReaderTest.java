package com.volkan.avci.exercises.xlmjson.reader;

import com.volkan.avci.exercises.xlmjson.model.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XMLReaderTest {

    XMLReader xmlReader;

    @Before
    public void setUp() throws Exception {
        xmlReader = new XMLReader();
    }

    @Test
    public void xmlParserFromFileTest() {
        Customer customer = xmlReader.readXMLDataFromFile();
        assertEquals(3, customer.getInformation().size());
    }
}