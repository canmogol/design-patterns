package com.fererlab.pattern.structural.bridge.entertainment;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><body><h1>");
        builder.append(header);
        builder.append("</h1><dl>");
        for (Detail detail : details) {
            builder.append("<dt>");
            builder.append(detail.getLabel());
            builder.append("</dt><dd>");
            builder.append(detail.getValue());
            builder.append("</dd>");
        }
        builder.append("</dl></body></html>");
        return builder.toString();
    }

}
