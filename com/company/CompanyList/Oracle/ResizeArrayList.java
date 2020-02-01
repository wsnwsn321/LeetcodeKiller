package com.company.CompanyList.Oracle;

public class ResizeArrayList {
    public class ArrayList{
        private int[] array;
        private final int length =10000;
        private final double LOAD_FACTOR = 0.75;
        int size;
        ArrayList(){
            array = new int[length];
            size=0;
        }

        public void resize(){
            int[] temp = array;
            array = new int[length*2];
            for (int i=0;i<size;++i){
                array[i] = temp[i];
            }
        }

        public void add(int v){
            array[size++] = v;
            if ((double)size/length>=LOAD_FACTOR)
                resize();
        }

        public int get(int index) throws ArrayIndexOutOfBoundsException {
            if (index>=size||index<0)
                throw new ArrayIndexOutOfBoundsException("index out of bound");
            return array[index];
        }

        public boolean remove(int index){
            if (index>size||index<0) return false;
            for (int i = index+1;i<size;++i){
                array[i-1] = array[i];
            }
            size--;
            return true;
        }


    }
}
