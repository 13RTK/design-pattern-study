package com.designpattern.proxy.mybatisstudy.xmlparse;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class W3cXMLUtil {
    private static volatile DocumentBuilderFactory factory;

    public static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
        return newInstance().newDocumentBuilder();
    }

    private W3cXMLUtil() {
    }

    public static DocumentBuilderFactory newInstance() {
        if (factory == null) {
            synchronized (W3cXMLUtil.class) {
                if (factory == null) {
                    factory = DocumentBuilderFactory.newInstance();
                }
            }
        }

        return factory;
    }
}
