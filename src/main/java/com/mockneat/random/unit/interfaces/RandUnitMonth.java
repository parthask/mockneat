package com.mockneat.random.unit.interfaces;


import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.function.Supplier;

/**
 * Created by andreinicolinciobanu on 09/02/2017.
 */
public interface RandUnitMonth extends RandUnit<Month> {

    default RandUnitString display(TextStyle textStyle, Locale locale) {
        Supplier<String> supp = () -> supplier().get().getDisplayName(textStyle, locale);
        return () -> supp;
    }

    default RandUnitString display(TextStyle textStyle) {
        return display(textStyle, Locale.getDefault());
    }

    default RandUnitString display() {
        return display(TextStyle.FULL_STANDALONE);
    }
}
