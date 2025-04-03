package com.bridgelabz.junit.basic;

import java.util.List;

public class ListManager {
    public void addElement(List<Integer>list,int element){
        list.add(element);
    }
    public void removeElement(List<Integer>list, int index){
        if(index>=0 && index< list.size()) {
            list.remove(index);
        }
    }
    public int getSize(List<Integer>list){
        return list.size();
    }
}
