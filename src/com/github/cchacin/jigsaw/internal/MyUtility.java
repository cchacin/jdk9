package com.github.cchacin.internal;

import com.google.common.collect.Collections2;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyUtility {

    public static Set<String> buildSetStrings() {
        final Set<String> strings = new HashSet<String>();
        strings.add("Java");
        strings.add("Groovy");
        strings.add("Jython");
        strings.add("JRuby");
        strings.add("Python");
        strings.add("Ruby");
        strings.add("Perl");
        strings.add("C");
        strings.add("C++");
        strings.add("C#");
        strings.add("Pascal");
        strings.add("Fortran");
        strings.add("Cobol");
        strings.add("Scala");
        strings.add("Clojure");
        strings.add("Basic");
        strings.add("PHP");
        strings.add("Flex/ActionScript");
        strings.add("JOVIAL");
        return strings;
    }
}
