package com.volkan.avci.exercises.xlmjson.controller;

import com.volkan.avci.exercises.xlmjson.model.Customer;
import com.volkan.avci.exercises.xlmjson.reader.XMLReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XMLReaderController {

    private final XMLReader xmlReader;

    @Autowired
    public XMLReaderController(XMLReader xmlReader) {
        this.xmlReader = xmlReader;
    }

    @GetMapping(value = "/readXml", produces = {"application/json"})
    public Customer getXmlData()
    {
        return xmlReader.readXMLDataFromFile();
    }
}
