package com.ambersec.cloud.infrastructure.persistence.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * Functionality common to all Spring Jdbc repositories.
 * Created by pine on 2016/6/6.
 */
public abstract class SpringJdbcRepository {

    @Resource(name="jdbcTemplate")
    protected JdbcTemplate jdbcTemplate;

    /**
     * mysql common sql for page
     * but this sql can cause sql injection
     * @param sql
     * @param pageIndex start with 0
     * @param pageSize
     * @return
     */
    @Deprecated
    protected final String getPagingSql(String sql,int pageIndex,int pageSize){
        StringBuilder sb = new StringBuilder();
        if(pageIndex < 0){
            pageIndex = 0;
        }
        if(pageSize < 1){
            pageSize = 1;
        }
        int start = pageIndex * pageSize;
        sb.append(sql);
        sb.append(" limit ").append(start).append(",").append(pageSize);
        return sb.toString();
    }
}
