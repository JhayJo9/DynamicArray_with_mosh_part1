/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcel1;

/**
 *
 * @author JhayJ
 */
public class Array {
    private int[] items;
    private int counts;
    // contrators
    public Array(int length){
        items = new int[length];
    }
    // method
    public void insert(int item){
        if(items.length == counts){
            int[] newItem = new int [counts * 2];
            
            for(int i = 0;i < counts;i++){
            newItem[i] = items[i];
                
            items = newItem;
        }
        }
        items[counts++] = item;
    }
    // method
    public void print(){
        for(int i = 0;i < counts;i++){
            System.out.println(items[i]);
        }
    
    }
    
}
