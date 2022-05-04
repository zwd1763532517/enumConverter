package com.zwd.enumtest.configure;

import com.zwd.enumtest.convert.IntegerCodeToEnumConverterFactory;
import com.zwd.enumtest.convert.StringCodeToEnumConverterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    public void addFormatters(FormatterRegistry registry){
        registry.addConverterFactory(new IntegerCodeToEnumConverterFactory());
        registry.addConverterFactory(new StringCodeToEnumConverterFactory());
    }
}
