package com.election_manager.electpro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class Voter {
 private Long voterId;
 private String firstName;
 private String lastName;

 private ContactInformation contactInformation;
 private LocalDate dateOfBirth;

 @Enumerated(value = EnumType.STRING)
 private VoterEligibilityStatus eligibilityStatus;
}
