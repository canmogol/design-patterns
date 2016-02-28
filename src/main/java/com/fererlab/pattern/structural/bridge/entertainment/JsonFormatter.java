package com.fererlab.pattern.structural.bridge.entertainment;

import java.util.List;

public class JsonFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\"header\":\"");
        builder.append(header);
        builder.append("\",");
        for (Detail detail : details) {
            builder.append("\"");
            builder.append(detail.getLabel());
            builder.append("\":\"");
            builder.append(detail.getValue());
            builder.append("\",");
        }
        builder.append("}");
        return builder.toString();
    }
}
