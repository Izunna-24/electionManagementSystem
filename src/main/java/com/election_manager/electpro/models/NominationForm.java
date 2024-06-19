package com.election_manager.electpro.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class NominationForm {
    private Candidate candidate;
    private NominationFormStatus status;
    private Long formId;
    private String partyAffiliation;
    private LocalDate dateSubmitted;
    private LocalDate dateApproved;
    private String position;
}
