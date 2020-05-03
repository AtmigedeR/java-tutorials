package com.volkan.avci.exercises.xlmjson.reader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.volkan.avci.exercises.xlmjson.model.Customer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Component
public class XMLReader {

    private XmlMapper xmlMapper;

    public XMLReader() {
        this.xmlMapper = new XmlMapper();
    }

    public Customer readXMLDataFromFile()
    {
        Customer customer = new Customer();
        try{
            File xmlFile = new ClassPathResource("customer.xml").getFile();
            String xml = inputStreamToString(new FileInputStream((xmlFile)));
            customer = xmlMapper.readValue(xml, Customer.class);
        }catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return customer;
    }

    private String inputStreamToString(FileInputStream fileInputStream) throws Exception{
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
