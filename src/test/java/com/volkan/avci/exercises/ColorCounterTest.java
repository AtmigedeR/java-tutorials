package com.volkan.avci.exercises;


import com.volkan.avci.exercises.color.ColorCounter;
import com.volkan.avci.exercises.color.ColorPrinter;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ColorCounterTest {

    ColorCounter colorCounter;
    ColorPrinter colorPrinter;
    List<String> singleMaxColors;
    List<String> multipleMaxColors;

    @Before
    public void init()
    {
        colorCounter = new ColorCounter();
        colorPrinter = new ColorPrinter();
        singleMaxColors = Arrays.asList("sarı","sarı", "kırmızı","sarı","yeşil","kırmızı");
        multipleMaxColors = Arrays.asList("sarı","sarı","kırmızı", "kırmızı","sarı","yeşil","kırmızı");
    }

    @Test
    public void countSingleMaxColor() {
        Map<String, Integer> result = colorCounter.countColor(singleMaxColors);
        assertEquals(result.size(),1);
    }
    @Test
    public void countMultipleMaxColor() {
        Map<String, Integer> result = colorCounter.countColor(multipleMaxColors);
        assertEquals(result.size(),2);
    }

    @Test
    public void printSingleHighestCountedColors() {
        Map<String, Integer> result = colorCounter.countColor(singleMaxColors);
        colorPrinter.printHighestColors(result, colorCounter.getColorMaxCount());
    }
    @Test
    public void printMultipleHighestCountedColors() {
        Map<String, Integer> result = colorCounter.countColor(multipleMaxColors);
        colorPrinter.printHighestColors(result, colorCounter.getColorMaxCount());
    }
}
