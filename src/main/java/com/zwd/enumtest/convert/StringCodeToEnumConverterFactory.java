package com.zwd.enumtest.convert;

import com.zwd.enumtest.constant.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class StringCodeToEnumConverterFactory implements ConverterFactory<String, BaseEnum> {
    private static final Map<Class, Converter> CONVERTERS = new HashMap<>();


    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        Converter<String, T> converter = CONVERTERS.get(targetType);
        if (converter == null) {
            converter = new StringToEnumConverter<>(targetType);
            CONVERTERS.put(targetType, converter);
        }
        return converter;
    }
}
