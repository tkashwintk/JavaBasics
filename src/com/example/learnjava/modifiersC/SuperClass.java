package com.example.learnjava.modifiersC;

/**
 * modifersC and modifersD are part of same example
 */
class AccessModifiersExample {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.var_default);
        System.out.println(subClass.var_protected);
        System.out.println(subClass.var_public);
 //     System.out.println(subClass.var_private); // Compiler Error
    }
}

public class SuperClass {

    private String var_private;
    protected String var_protected;
    public String var_public;
    String var_default;
}

class SubClass extends SuperClass{

}
