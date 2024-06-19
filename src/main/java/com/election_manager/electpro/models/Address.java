package com.election_manager.electpro.models;

import lombok.Data;

@Data
public class Address {
    private Long addressId;
    private String streetName;
    private String zipCope;
    private Long houseNumber;
    private String postalCode;
}
