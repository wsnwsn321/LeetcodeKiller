package com.company.CompanyList.Amazon;

import java.util.HashSet;
import java.util.Set;

public class DoggyDayCare {
    public class Dogpark{
        private int maximumSize;
        private int curSize;
        private String type;
        Set<dog> inPark;
        public Dogpark(int maximumSize,String type){
            this.maximumSize = maximumSize;
            this.type = type;
            this.curSize=0;
            inPark = new HashSet<>();
        }
        public void addDog(dog d){
            if (acceptableSize(d)){
                this.curSize++;
                inPark.add(d);
            }
        }

        public boolean acceptableSize(dog d){
            return this.type.equals(d.size);
        }
        public void vaccinate(dog d){
            if (inPark.contains(d))
                d.setVaccinated(true);
        }
    }

    public class dog{
        private int id;
        private boolean vaccinated;
        private String size;
        public dog(int id, boolean vaccinated,String size){
            this.id=id;
            this.vaccinated =vaccinated;
            this.size =size;
        }

        public String getSize() {
            return size;
        }

        public int getId() {
            return id;
        }


        public boolean isVaccinated() {
            return vaccinated;
        }
        public void setVaccinated(boolean vaccinated) {
            this.vaccinated = vaccinated;
        }
    }

    public void main(String[] args) {
        //dog bg = new dog();
    }
}
