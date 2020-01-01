package com.miq.scenario.dto;

import lombok.Builder;

@Builder
public class ScenarioStep {
  private String errMessage;
  private String stepDuration;
  private String scenarioLine;
}