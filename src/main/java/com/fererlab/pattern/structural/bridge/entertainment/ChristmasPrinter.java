package com.fererlab.pattern.structural.bridge.entertainment;

import java.util.ArrayList;
import java.util.List;

public class ChristmasPrinter extends Printer {

    private Movie movie;

    public ChristmasPrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return "Ho Ho Ho!";
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getTitle()));
        return details;
    }
}
