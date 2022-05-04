package com.zwd.enumtest.convert;

import com.zwd.enumtest.constant.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class IntegerCodeToEnumConverterFactory implements ConverterFactory<Integer,BaseEnum> {

    private static final Map<Class,Converter> CONVERTER_MAP = new HashMap<>();




    @Override
    public <T extends BaseEnum> Converter<Integer, T> getConverter(Class<T> targetType) {
        Converter converter = CONVERTER_MAP.get(targetType);
        if(converter == null){
            converter = new IntegerToEnumConverter<>(targetType);
            CONVERTER_MAP.put(targetType,converter);
        }
        return converter;
    }
}
