/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.message.thrift.actor.cluser;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Handshake implements org.apache.thrift.TEnum {
  SEND(0),
  BACK(1);

  private final int value;

  private Handshake(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Handshake findByValue(int value) { 
    switch (value) {
      case 0:
        return SEND;
      case 1:
        return BACK;
      default:
        return null;
    }
  }
}
