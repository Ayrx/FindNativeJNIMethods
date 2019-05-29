package me.ayrx;

import java.util.ArrayList;

public class MethodInformation {

    private String methodName;
    private ArrayList<String> argumentTypes;
    private String returnType;
    private boolean isStatic;

    public MethodInformation(String methodName, ArrayList<String> argumentTypes, String returnType, boolean isStatic) {
        this.methodName = methodName;
        this.argumentTypes = argumentTypes;
        this.returnType = returnType;
        this.isStatic = isStatic;
    }

}
