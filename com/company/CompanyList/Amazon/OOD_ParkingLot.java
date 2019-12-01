package com.company.CompanyList.Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class OOD_ParkingLot {
    enum color{
        RED,GREEN,BLACK
    }
    enum Vsize{
        S,M,L
    }

    abstract class Vehicles{
        String license_plate;
        color c;
        Vsize size;

    }

    private class Car extends Vehicles{
        Car(String lp, color c){
            this.license_plate = lp;
            this.c = c;
            this.size = Vsize.M;
        }
    }
    private class Motor extends Vehicles{
        Motor(String lp, color c){
            this.license_plate = lp;
            this.c = c;
            this.size = Vsize.M;
        }
    }

    class ParkingLot{
        Stack<Slot> emptySSlot;
        Stack<Slot> emptyMSlot;
        Stack<Slot> emptyLSlot;
        Map<Vehicles,Slot> occupiedSpace;
        ParkingLot(){
            emptySSlot = new Stack<>();
            emptyMSlot = new Stack<>();
            emptyLSlot = new Stack<>();
            occupiedSpace = new HashMap<>();
        }
        public boolean parkVehicle(Vehicles v){
            if (v.size==Vsize.S){
                if (emptySSlot.size()==0)
                    return false;
                else {
                    Slot take = emptySSlot.pop();
                    occupiedSpace.put(v,take);
                }
            }
            return true;
        }

        public Slot retriveVehicle(Vehicles v){
            if (!occupiedSpace.containsKey(v))
                return null;
            Slot free = occupiedSpace.get(v);
            if (free.size ==Vsize.S)
                emptySSlot.push(free);
            return free;
        }
    }

    class Slot{
        private int id;
        private Vsize size;

    }


}
