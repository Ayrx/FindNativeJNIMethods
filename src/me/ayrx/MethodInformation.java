package me.ayrx;

import java.util.ArrayList;

public class MethodInformation {

    private String methodName;
    private String argumentSignature;
    private ArrayList<String> argumentTypes;
    private String returnType;
    private boolean isStatic;

    public MethodInformation(String methodName, String argumentSignature, ArrayList<String> argumentTypes, String returnType, boolean isStatic) {
        this.methodName = methodName;
        this.argumentSignature = argumentSignature;
        this.argumentTypes = argumentTypes;
        this.returnType = returnType;
        this.isStatic = isStatic;
    }

}
