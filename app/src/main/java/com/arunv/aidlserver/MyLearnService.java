package com.arunv.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MyLearnService extends Service {
    public MyLearnService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }

    private final IFirstInterface.Stub mBinder = new IFirstInterface.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public void printMyName(String name) throws RemoteException {
            Log.i("-----> ", "Name : " + name);
        }

        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public List<Person> getPersonList() throws RemoteException {
            List<com.arunv.aidlserver.Person> person = new ArrayList<>();
            person.add(new Person("A", 10));
            person.add(new Person("B", 20));
            person.add(new Person("C", 30));
            person.add(new Person("D", 40));
            person.add(new Person("E", 50));
            person.add(new Person("F", 60));
            return person;
        }

    };

}
