package com.bridgelabz.junit.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ListManagerTest {
    private ListManager listManager;
    private List<Integer>list;

    //object set krna and empty list create
    @BeforeEach
    void setUp(){
        System.out.println("Creating new object of List manager and new arraylist");
        listManager=new ListManager();
        list=new ArrayList<>();
    }


   @Test
    public void shouldAddElementToList(){
       listManager.addElement(list,3);

       //should match the size of list after adding one element
       Assertions.assertEquals(1,list.size());
       // check list contains the element or not
       Assertions.assertTrue(list.contains(3));
   }

   @Test
    public void shouldRemoveElementFromTheList(){

   }

}
