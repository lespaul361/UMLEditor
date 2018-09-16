/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lespaul361.umleditor;

/**
 *
 * @author David Hamilton
 */
public interface UMLMethod extends DefaultMethods{

    enum Method_Types {
        INTERFACE,
        ABSTRACT,
        NORMAL;
    }

    enum Method_Access_Modifiers {
        PUBLIC, PRIVATE, DEFAULT
    };

    enum Method_Modifiers {
        STATIC,
        FINAL,
        STATIC_AND_FINAL
    }
    

}
