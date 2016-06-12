package com.ambersec.cloud.infrastructure.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * get sql statement from sql.properties
 * Created by pine on 2016/6/6.
 */
public class SqlHandler {

    private final static Logger Log = LoggerFactory.getLogger(SqlHandler.class);

    private static final String PROPERTIES_FILE = "sql.properties";
    private static Properties props;

    static {
        try {
            props = PropertiesLoaderUtils.loadAllProperties(PROPERTIES_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     *
     */
    public static void init(){
    }

    /**
     * @param keyMaybeDefaultValue key and default value
     * @return
     * @throws Exception
     */
    public static String getProperties(String... keyMaybeDefaultValue) throws RuntimeException {
        if (keyMaybeDefaultValue == null || keyMaybeDefaultValue.length <= 0) {
            throw new RuntimeException("support a key at least!");
        }
        if (keyMaybeDefaultValue.length == 1) {
            return props.getProperty(keyMaybeDefaultValue[0]).toString();
        } else if (keyMaybeDefaultValue.length == 2) {
            return props.getProperty(keyMaybeDefaultValue[0], keyMaybeDefaultValue[1]).toString();
        } else {
            Log.error("get sql statement error by key:{0}", keyMaybeDefaultValue[0].toString());
            throw new RuntimeException(String.format("there is no sql statement by key[%s]", keyMaybeDefaultValue[0].toString()));
        }
    }
}
