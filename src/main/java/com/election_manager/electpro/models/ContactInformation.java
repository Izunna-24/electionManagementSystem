package com.election_manager.electpro.models;

import lombok.Data;

@Data
public class ContactInformation {
    private Long contactId;
    private String phoneNumber;
    private String stateOfOrigin;
    private String country;
    private String email;
    private String localGovernment;
    private Address address;
}
