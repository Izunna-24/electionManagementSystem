package com.election_manager.electpro.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ElectionResult {
    private Long resultId;
    private Election election;
    private ElectionCategory electionCategory;
    private ElectionStatus electionStatus;
    private Candidate candidate;
    private Long numberOfVotesReceived;
    private LocalDate electionDate;
    private Long totalNumberOfVotesCasted;
}
