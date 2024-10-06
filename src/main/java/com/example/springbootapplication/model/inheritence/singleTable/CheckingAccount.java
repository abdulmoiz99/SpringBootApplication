package com.example.springbootapplication.model.inheritence.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("checking")
public class CheckingAccount extends Account {
  private int overdraftLimit;
}
