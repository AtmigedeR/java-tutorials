package com.volkan.avci.exercises.color;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorCounter {

    private Map<String, Integer> result;
    private int colorMaxCount = 0;

    public ColorCounter()
    {
        result = new HashMap<>();
    }
    public Map<String, Integer> countColor(List<String> colors) {

        for(String color : colors)
        {
            checkColorIsAlreadyCounted(color);
            checkColorIsNotCounted(color);
        }
        return findMostCountedColors();
    }

    private Map<String, Integer> findMostCountedColors()
    {
        Map<String, Integer> mostCountedColors = new HashMap<>();
        for(Map.Entry<String, Integer> entry : result.entrySet())
        {
            if(entry.getValue() == colorMaxCount)
            {
                mostCountedColors.put(entry.getKey(), entry.getValue());
            }
        }
        return mostCountedColors;
    }
    private void checkColorIsAlreadyCounted(String color)
    {
        if(result.containsKey(color))
        {
            result.put(color,  result.get(color)+1);
            if(result.get(color) > colorMaxCount)
            {
                colorMaxCount = result.get(color);
            }
        }
    }

    private  void checkColorIsNotCounted(String color)
    {
        if(!result.containsKey(color))
        {
            result.put(color, 1);
        }
    }

    public int getColorMaxCount() {
        return colorMaxCount;
    }
}
