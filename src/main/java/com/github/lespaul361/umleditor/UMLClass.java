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
public interface UMLClass {

    enum Class_Types {
        INTERFACE,
        ABSTRACT,
        NORMAL;
    }

    enum Class_Access_Modifiers {
        PUBLIC, PRIVATE, DEFAULT
    };

    enum Class_Modifiers {
        STATIC,
        FINAL,
        STATIC_AND_FINAL
    }
    
}
