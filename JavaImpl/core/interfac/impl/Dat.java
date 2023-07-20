package core.interfac.impl;

import core.interfac.Printable;

import java.util.Date;

class Dat implements Printable {

    @Override
    public void printable() {
        Date date=new Date();
        System.out.println(date);
    }
    public static void main(String args[]){
        Dat dat=new Dat();
        dat.printable();
    }
}
