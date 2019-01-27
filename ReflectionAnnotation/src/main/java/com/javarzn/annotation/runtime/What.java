package com.javarzn.annotation.runtime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация с правилом удержания RetentionPolicy.RUNTIME и полем description.
 *
 * @author Konstantin
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface What {
    String description();
}
