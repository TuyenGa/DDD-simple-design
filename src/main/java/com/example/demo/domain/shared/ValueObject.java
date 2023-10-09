package com.example.demo.domain.shared;

import java.io.Serializable;

/**
 * A value object
 * */
public interface  ValueObject<T> extends Serializable {

    /**
     *  The value objects compare by the values of the attributes, they don't have an identity
     *
     * @param other value object
     * @return true if the given value object's and this value object's attributes are the same.
     * */
    boolean sameValueAs(T other);
}
