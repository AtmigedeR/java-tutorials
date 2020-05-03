package com.volkan.avci.exercises;

import com.volkan.avci.exercises.mapper.ObjectMapper;
import com.volkan.avci.exercises.mapper.Source;
import com.volkan.avci.exercises.mapper.Target;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperTest {

    Source source;
    Target target;
    Map<String, String> config;

    @Before
    public void setUp()
    {
        source = new Source();
        source.setColor("Red");
        source.setKind("Car");
        target = new Target();
        config = new HashMap<>();
        config.put("kind", "type");
    }

    @Ignore
    @Test
    public void sourceToTargetWithoutConfiguration() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.map(source, target, null);
        System.out.println(target.getColor());
    }
}
