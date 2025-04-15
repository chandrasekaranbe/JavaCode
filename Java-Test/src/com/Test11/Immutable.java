package com.Test1;

import java.util.ArrayList;
import java.util.List;

final class Immutable {

    private final  String name;
    private final List<String> petnameList;

    public Immutable(String name, List<String> petnameList) {
        this.name = name;
        this.petnameList = petnameList;
    }

    public String getName() {
        return name;
    }

    public List<String> getPetnameList() {
        return new ArrayList<>(petnameList);
    }
}
