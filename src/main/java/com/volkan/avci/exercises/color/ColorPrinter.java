package com.volkan.avci.exercises.color;

import java.util.Map;

public class ColorPrinter {

    public void printHighestColors(Map<String, Integer> result, int colorMaxCount) {
        String output = "";
        if (result.size() > 1) {
            output = formatMultipleColor(result, colorMaxCount);
        } else {
            output = formatSingleColor(result, colorMaxCount);
        }
        System.out.println(output);
    }

    private String formatSingleColor(Map<String, Integer> result, int colorMaxCount) {
        String output ="" ;
        output += "En çok tekrar eden kelime " + colorMaxCount + " adet ile ";
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            output += entry.getKey() + " kelimesidir.";
        }
        return output;
    }

    private String formatMultipleColor(Map<String, Integer> result, int colorMaxCount) {
        String output = "";
        output += "En çok tekrar eden kelimeler " + colorMaxCount + " adet ile " ;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            output += entry.getKey() + ", ";
        }
        output = removeLastComma(output);
        output += " kelimeleridir.";
        return output;
    }

    private String removeLastComma(String output) {
        int lastIndex = output.lastIndexOf(",");
        output = output.substring(0,  + lastIndex) + output.substring(lastIndex+1, output.length()-1);
        return output;
    }
}
