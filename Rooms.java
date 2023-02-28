/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rooms;

class Hotel{
    int contactNo;
    String name;
    void disp(){
        System.out.println(contactNo+ name);
    }
}
class Room extends Hotel{
    String roomType;
    int roomNo, price, noOfGuests;
    void disp(){
        System.out.println("Name: "+ name+ " Contact Number: "+contactNo+" Number of Guests: "+noOfGuests+" Room Number: "+roomNo+" Room type: "+roomType+" Price: "+price);
    }
    void setData(String n, int cn, int g, int p, int rno){

    }
}


public class Rooms{
    public static void main(String[] args){
        System.out.println("test");

    }
}