# ft-assignment-kanboard-1.2.15

Team repository for the Functional Testing assignment experiment on **LLM-generated JUnit 5 assertions** using **Kanboard 1.2.15**.

## Scope

This repo contains the second case-study setup and experiment artifacts for evaluating assertion generation under three zero-shot treatments:

1. **No comments**
2. **With assertion-intent comments**
3. **With comments + cleaned HTML context**

## Upstream Baseline

Source application/test baseline comes from BEWT:

- https://github.com/bonigarcia/BEWT/tree/main/kanboard/baseline/kanboard-1.2.15

## Goal

Measure and compare assertion quality across treatments using:

- **Functional outcome**: pass / fail / runtime error / not compiling
- **Qualitative label**: Correct / Over-assertive / Under-assertive / Wrong assertion / Not executable

## Branching

- `main`: stable baseline
- `exp/no-comments`
- `exp/with-comments`
- `exp/with-comments-html`