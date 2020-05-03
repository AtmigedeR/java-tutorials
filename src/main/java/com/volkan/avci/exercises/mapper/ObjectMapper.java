package com.volkan.avci.exercises.mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    public <S,T> void map(S source, T target, Map<String, String> config) {

        Class<?> sourceClazz = source.getClass();
        Class<?> targetClazz = target.getClass();
        Field[] sourceFields = sourceClazz.getDeclaredFields();
        //Field[] targetFields = targetClazz.getFields();

        for(Field field : sourceFields)
        {
            try{
                 Field targetField = targetClazz.getDeclaredField(field.getName());
                if(targetField != null )
                {
                   field.setAccessible(true);
                   targetField.setAccessible(true);
                   Object value = field.get(source);
                   targetField = field;
                   System.out.println(targetField.get(target));
                }
            }catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
    }
}
