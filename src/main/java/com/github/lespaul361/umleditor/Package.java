/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lespaul361.umleditor;

import java.beans.PropertyChangeSupport;
import java.io.File;

/**
 *
 * @author David Hamilton
 */
public class Package {

    private String packageName;
    public static final String PROP_PACKAGENAME = "packageName";
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    private Package(String name) {
        this.packageName = name;
    }

    private Package() {
    }

    public static Package getPackageInstance(String name) {
        return new Package(name);
    }

    public static Package getPackageInstance(File fileName) {
        return null;
    }    ;

    /**
     * @return the packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * @param packageName the packageName to set. Use full qualified names such
     * as com.username.package
     */
    public void setPackageName(String packageName) {
        java.lang.String oldPackageName = this.packageName;
        this.packageName = packageName;
        propertyChangeSupport.firePropertyChange(PROP_PACKAGENAME, oldPackageName, packageName);
    }

}
