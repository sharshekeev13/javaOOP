package org.example;

import org.example.tasksA.aircraft.Aircraft;
import org.example.tasksA.aircraft.Chassis;
import org.example.tasksA.aircraft.Engine;
import org.example.tasksA.aircraft.Wing;
import org.example.tasksA.bird.Bird;
import org.example.tasksA.computer.*;
import org.example.tasksA.dog.Dog;

public class ExamplesA {


    //Timur Pratov
    static void run3taskA(){
        Aircraft aircraft = new Aircraft("МС-21");
        aircraft.setEngine(new Engine("/nДвигатель: Турбовентиляторный двигатель 870 км/ч"));
        aircraft.setWing(new Wing("/nКрыло: из полимерных композитных материалов, размах 36 м"));
        aircraft.setChassis(new Chassis("/nШасси: обычные бля!!!111!!1"));
        aircraft.getInfo();
    }


    //Timur Pratovv
    static void run7taskA(){
        Processor processor = new Processor("Intel", 2);
        RAM ram = new RAM();
        CD_ROM cd_rom = new CD_ROM();
        HDD hdd = new HDD("SSD", "Micron", "256 GB");
        Computer myComp = new Computer("HomeComp", "UX303LB", "Ubuntu");

        myComp.setHardDisk(hdd);

        myComp.switchOn();
        myComp.virusTest();
        myComp.getHardDisk().printCapacity();
        myComp.switchOff();
    }


    //Aktan Djenaliev
    static void run22taskA(){
        Bird bird = new Bird("Aktan");
        bird.eat();
        bird.attack();
        bird.fly();
        bird.sitDown();
    }


    //Kirill Molchanov
    static void run10taskA(){
        Dog puppy=new Dog("Sirko");
        puppy.showName();
        puppy.makeVoice();
        puppy.makeBite();
        puppy.makeJump();
        puppy.makeRun();
    }

}
