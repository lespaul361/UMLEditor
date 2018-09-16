/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lespaul361.umleditor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Hamilton
 */
public final class Package implements DefaultMethods {

    private String packageName = "";
    public static final String PROP_PACKAGENAME = "packageName";
    private final List<UMLClass> umlClasses = new ArrayList<>(100);

    private Package(String name) {
        this.packageName = name;
    }

    private Package() {
    }

    /**
     * Creates an instance of a {@link Package}
     *
     * @param name the name of the package (ex. com.name.packagename)
     * @return the new Package
     */
    public static Package getPackageInstance(String name) {
        return new Package(name);
    }

    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Package name cannot be null");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Package name cannot be empty");
        }
        this.packageName = name;
    }

    /**
     * Adds a class extending {@link UMLClass}
     *
     * @param umlClass a class extending {@link UMLClass}
     */
    public void addUMLClass(UMLClass umlClass) {
        this.umlClasses.add(umlClass);
    }

    /**
     * Removes a {@link UMLClass} from the package
     *
     * @param umlClass the class to remove
     * @return true if class was found and removed
     */
    public boolean remove(UMLClass umlClass) {
        return umlClasses.remove(umlClass);
    }

    /**
     * Removes a {@link UMLClass} from the package
     *
     * @param index the index to the class to remove
     * @return the UMLClass removed
     */
    public UMLClass remove(int index) {
        return umlClasses.remove(index);
    }
}
