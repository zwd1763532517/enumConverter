package com.zwd.enumtest.convert;

import com.zwd.enumtest.constant.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnumConverter<T extends BaseEnum> implements Converter<Integer,T> {
    private Map<Integer,T> enumMap = new HashMap<>();

    public IntegerToEnumConverter(Class<T> enumType){
        T[] enumConstants = enumType.getEnumConstants();
        for (T enumConstant : enumConstants) {
            enumMap.put(enumConstant.getCode(),enumConstant);
        }
    }


    @Override
    public T convert(Integer source) {
        T t = enumMap.get(source);
        if(ObjectUtils.isEmpty(t)){
            throw new IllegalArgumentException("无法匹配对应的枚举类型");
        }
        return t;
    }
}
