package com.example.demo.domain.shared;

import java.io.Serializable;

public interface Entity<E, ID extends Serializable> {

    /**
     *  Entities compare by identity, not by attribute
     * @param other => the other entity
     * @return true if identities are the same, regardless of other attributes.
     * */
    boolean sameIdentityAs(E other);

    ID id();
}
