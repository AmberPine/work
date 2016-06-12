package com.ambersec.cloud.domain.shared;

import java.io.Serializable;

/**
 * an entity
 * Created by pine on 2016/6/6.
 */
public interface Entity<T> extends Serializable {
    /**
     * Entities compare by identity, not by attributes.
     *
     * @param other The other entity.
     * @return true if the identities are the same, regardles of other attributes.
     */
    boolean sameIdentityAs(T other);
}
