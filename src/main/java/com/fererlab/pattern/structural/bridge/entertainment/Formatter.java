package com.fererlab.pattern.structural.bridge.entertainment;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
