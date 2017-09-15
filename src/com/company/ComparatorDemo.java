package com.company;

import java.util.*;

public class ComparatorDemo {
  public static void main(String[] args) {
    List<Address> addresses = new ArrayList<>();
    addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
    addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
    addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
    addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));
    System.out.println("Before sorting");
    print(addresses);
    addresses.sort( new Comparator<Address>() {
      @Override
      public int compare(Address o1, Address o2) {
        return o1.getState().compareTo( o2.getState() );
      }
    });
    System.out.println(addresses);
    System.out.println("\nAfter sorting by state");
    addresses.sort((o1, o2) -> o2.getCity().compareTo( o1.getCity() ) );
    System.out.println(addresses);
    System.out.println("\nAfter sorting by city");
  }
  private static void print(List<Address> addresses) {
    for(Address address : addresses) {
      System.out.println(address);
    }
  }
}