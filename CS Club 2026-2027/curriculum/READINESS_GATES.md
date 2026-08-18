# Readiness Gates

Gates protect learning; they do not sort people. Meetings remain shared and accessible before and after a gate. Names and individual results stay outside the public repository.

## Operational rules for every gate

### Checkpoint denominator and attendance validity

- The primary group decision is made at the checkpoint meeting, allowing an end-of-Week-10 decision before Week 11.
- Before the checkpoint, define the **active cohort** privately as members who attended at least two of the previous three available regular meetings; canceled meetings do not count. Do not publish its names or attendance records.
- A **checkpoint participant** is any member present for at least 20 minutes of hands-on gate work at the checkpoint. Every checkpoint participant appears once in the primary denominator, whether working alone or with a partner.
- Separately, count active-cohort members who complete at least 20 hands-on checkpoint minutes. The checkpoint is valid only when those active-cohort attendees are at least 60% of the privately defined active cohort. If coverage is below 60%, repeat the checkpoint at the next shared meeting and do not authorize progression, regardless of apparent readiness.
- A member absent from the checkpoint is not added to its denominator. On return, the leader provides the same-room support version and an equivalent individual recheck within that member's next two attended meetings. The later result does not retroactively alter the original group denominator or decision.
- Leaving before 20 hands-on minutes because of a documented school obligation does not add a member to the checkpoint denominator; keep the reason private. The attendance-validity safeguard prevents a small turnout from gaming progression.

### Member-level scoring

Each gate has a required checklist below. A member passes only after demonstrating **every** required item; leaders do not average partial scores. Evidence may come from a fresh task, mini-project, paired artifact plus individual explanation, or equivalent recheck.

Pair work is welcome, but evidence is individual: each partner must make or trace a fresh change, predict the result, and explain the checklist item without the other partner answering. Store the checklist privately under adviser-approved rules; publish only aggregate counts.

### Group calculation and pace signal

```text
checkpoint readiness % = checkpoint participants passing every item / checkpoint-participant denominator × 100
too-fast % = anonymous “too fast” responses / all valid pace responses × 100
```

Round percentages to one decimal place. The group progression threshold is **at least 80% readiness**. A shared recovery-first meeting is also triggered when **30% or more** of valid pace responses select “too fast.” Never assign numbers to pace categories or average them.

For a gate decision, seek anonymous pace responses from at least 60% of the checkpoint-participant denominator. If response coverage is lower, mark pace `insufficient response` and repeat the anonymous check; do not claim that pace passed.

### Inclusion after a gate

If the group threshold is met, the next topic remains one shared meeting. Members still building prerequisites use support variants in the same room and toward the same meeting objective; they are not assigned to a separate or indefinite recovery track. Leaders provide an equivalent recheck within the next two attended meetings and reintegrate the member into the unscaffolded core as soon as the checklist is complete.

If members remain blocked after that two-meeting window, pause later progression for a whole-group reassessment: inspect setup, pacing, prerequisite instruction, and task design; then reteach or redesign the next shared meeting. No readiness label or parallel track is permanent.

## Weekly core check

A member independently makes a small edit, runs the program, explains the visible result, and identifies one sensible debugging step. If not yet complete, offer a scaffolded same-room version and equivalent recheck at the next attended meeting. Use the same 80%/30% group reset rules.

## Java Foundations Gate (after Week 10)

A member must complete every item:

- [ ] Write and call a method with at least one parameter and a return value.
- [ ] Use a conditional and loop to traverse an array or `ArrayList` safely.
- [ ] Identify a local variable, parameter, and private instance field in context.
- [ ] Read a compiler or runtime error, identify a relevant location, and make a sensible fix.
- [ ] Implement linear search, counting, minimum, or maximum and explain how its work changes as the input grows.

Binary search may begin only when group readiness is at least 80%, the pace rule is satisfied, and sorted-data/index/interval tracing is built into the shared lesson. Members awaiting recheck participate through the same lesson's support variant; nobody is removed from the meeting.

## Graph Traversal Gate

This gate measures prerequisites, not knowledge of BFS or DFS. A member must complete every item:

- [ ] Represent a small undirected graph as an adjacency list and identify vertices, edges, and neighbors.
- [ ] Correctly perform and trace enqueue/dequeue operations in FIFO order.
- [ ] Correctly perform and trace push/pop operations in LIFO order.
- [ ] Trace a visited set and explain how marking prevents repeated processing.
- [ ] Given a frontier and adjacency list, predict the next item under FIFO and under LIFO behavior.

After the 80% group threshold and pace rule are satisfied, the shared class can use these frontier behaviors to discover and name BFS and DFS. No member must distinguish algorithms that have not yet been taught.

## Recovery menu

- Replay a smaller runnable example with a leader in the same room.
- Use a trace table or object/index diagram.
- Pair-program with roles that swap every five minutes and individual evidence at the end.
- Complete a related shared-meeting feature rather than a timed task.
- Recheck with a new but equivalent task within two attended meetings.

Never publish names, scores, absences, cohort membership, or readiness labels. Record only active-cohort size, checkpoint denominator/numerator, attendance-validity percentage, readiness percentage, pace response coverage, too-fast percentage, and the program change in the aggregate dashboard.
