package com.vaishnavi.cab.order.booking.utility;

import com.vaishnavi.cab.order.booking.model.Driver;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DriverUtility {
    // Sorting drivers by name
    public static List<Driver> sortDriversByName(List<Driver> drivers) {
        return drivers.stream()
                .sorted(Comparator.comparing(Driver::name))
                .collect(Collectors.toList());
    }

    // Mapping driver names to a list
    public static List<String> getDriverNames(List<Driver> drivers) {
        return drivers.stream()
                .map(Driver::name)
                .collect(Collectors.toList());
    }
}
