package com.volkan.avci.exercises.xlmjson.config;


import com.volkan.avci.exercises.xlmjson.reader.XMLReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class XMLParserConfiguration {

    @Bean
    public XMLReader xmlReader()
    {
        return  new XMLReader();
    }
}
