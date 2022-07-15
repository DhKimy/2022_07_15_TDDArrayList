package com.ll.exam;


public class ArrayList {
    int[] datum;
    int arSize = 0;
    ArrayList(){
        datum = new int[2];
    }
    public int size() {
        return arSize;
    }

    public void sizeUp(){
        int[] newArr = new int[datum.length * 2];
        for(int i = 0; i < size(); i++){
            newArr[i] = datum[i];
        }
        datum = newArr;
    }

    public void add(int data) {
        if(arSize >= datum.length){
            sizeUp();
        }
        datum[arSize] = data;
        arSize++;
    }

    public int get(int index) {

        return datum[index];
    }

    public void removeAt(int index) {
        for(int i = index + 1; i < size(); i++){
            datum[i - 1] = datum[i];
        }
        arSize--;
    }


    public int getArrayLength() {
        return datum.length;
    }


    public void showAllValues() {
        System.out.printf("== 전체 데이터 출력 ==");
        for(int i = 0; i < size(); i++){
            System.out.printf("%d : %d\n", i, datum[i]);
        }
    }
}
