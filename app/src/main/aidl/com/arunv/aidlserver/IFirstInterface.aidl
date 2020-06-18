// IFirstInterface.aidl
package com.arunv.aidlserver;
import com.arunv.aidlserver.Person;

// Declare any non-default types here with import statements

interface IFirstInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    void printMyName(String name);

    int add(int a, int b);

    List<Person> getPersonList();
}
