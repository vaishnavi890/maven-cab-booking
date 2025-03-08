package com.vaishnavi.cab.order.booking.functionality;

@FunctionalInterface
public interface EntityProcessor<T> {
    void process(T entity);
}
