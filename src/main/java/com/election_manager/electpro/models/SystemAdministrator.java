package com.election_manager.electpro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class SystemAdministrator {
    private String firstName;
    private String lastName;
    @Id
    private Long adminId;
    private AdminPrivilege adminPrivilege;
    private String username;
    private String password;
    private ContactInformation contactInformation;


}
