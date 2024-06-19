package com.election_manager.electpro.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Election {
    private LocalDate startDate;
    private LocalDate endDate;
    private ElectionCategory category;
    private ElectionStatus electionStatus;
    private Long electionId;
    private ElectionResult electionResult;
}
