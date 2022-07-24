package com.example.learnjava.modifiersD;

import com.example.learnjava.modifiersC.SuperClass;

public class SubClassAgain extends SuperClass {

    public static void main(String[] args) {
        SubClassAgain subClassAgain = new SubClassAgain();
        System.out.println(subClassAgain.var_public);
        System.out.println(subClassAgain.var_protected);
//        System.out.println(subClassAgain.var_default); // Compiler Error
//        System.out.println(subClassAgain.var_private); // Compiler Error
    }
}
