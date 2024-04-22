package com.owol.friko.base.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertiesUtil {
    private static Environment env;

    /**
     * Environment 객체를 주입받아 static 변수에 저장합니다.
     * @param environment Spring Environment 객체
     */
    @Autowired
    public  PropertiesUtil(Environment environment) {
        PropertiesUtil.env = environment;
    }

    /**
     * 지정된 키에 해당하는 properties 값을 반환
     * @param key properties 키
     * @return 키에 해당하는 값, 키가 없을 경우 null
     */
    public static String getProperty(String key) {
        return env.getProperty(key);
    }

    /**
     * 지정된 키에 해당하는 properties 값을 반환
     * 키가 없을 경우 defaultValue를 반환
     * @param key properties 키
     * @param defaultValue 키가 없을 경우 반환할 기본 값
     * @return 키에 해당하는 값, 키가 없을 경우 defaultValue
     */
    public static  String getProperty(String key, String defaultValue){
        return env.getProperty(key, defaultValue);
    }
}
