package com.suren.beans;

import java.util.Date;

public class WishMessageGenerator {


private Date date; //dependent object

public WishMessageGenerator(){
System.out.println("WishMessageGenerator , 0 param constructor");
}

// setter method supporting setter injection 

public void setDate(Date date){
 System.out.println("WishMessageGenerator.setDate(-)");
 this.date =date;
}

public String generateMessage(String user)
{
 System.out.println("WishMessagegenerator.generateMessage()");
 
//get current hour of the day

int hour = date.getHours();

//generate wish message

if(hour<12)
  return "good morning :" +user;
 else if(hour<16)
  return "good afternoon: "+user;
 else if(hour<20)
  return "good evening: " +user;
else 
  return "Good night: " +user;
}
}
