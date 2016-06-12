package com.ambersec.cloud.domain.shared;

/**
 * Abstract entity classes, can be used as the base class for all domain entities,
 * providing ID and version properties
 * Created by pine on 2016/6/6.
 */
public abstract class AbstractEntity<T> implements Entity<T>{
    /**
     * unique id
     */
    protected String id;

    protected String version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
