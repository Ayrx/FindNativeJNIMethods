package me.ayrx;

import java.util.ArrayList;

public class MethodInformation {

    private String methodName;
    private ArrayList<String> argumentTypes;

    public MethodInformation(String methodName, ArrayList<String> argumentTypes) {
        this.methodName = methodName;
        this.argumentTypes = argumentTypes;
    }

}
