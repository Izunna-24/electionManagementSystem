package com.election_manager.electpro.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Candidate {
    private String firstName;
    private String lastName;
    private Long contactId;
    private ContactInformation contactInformation;
    private String partyAffiliation;
    private String biography;
    private NominationForm nominationForm;
    private LocalDate dateOfBirth;
    private String positionContested;

}
