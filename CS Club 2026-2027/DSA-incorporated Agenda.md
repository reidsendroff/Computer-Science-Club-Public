# DSA-Incorporated Agenda: December–Year End

Status: leadership draft. This agenda begins only after the ten-meeting Java foundation and the [Java Foundations Gate](curriculum/READINESS_GATES.md). Calendar dates, rooms, competitions, and school approvals remain `TBD` until officially verified.

DSA means **data structures and algorithms**. This plan makes DSA a continuation of Java—not a sudden switch to competitive-programming lectures. Meeting numbers determine the sequence; calendar months are estimates and may shift around holidays, cancellations, recovery meetings, and school events.

## Transition from Java to DSA

Before Meeting 11, the group must satisfy all existing gate rules:

- at least 60% active-cohort attendance validity;
- at least 80% of checkpoint participants complete every Java Foundations Gate item;
- fewer than 30% of valid anonymous pace responses select “too fast”; and
- members who need more support receive same-room recovery and an equivalent recheck.

If the gate is not satisfied, the next meeting is a shared Java recovery build. The club never skips prerequisites to match a month on the calendar.

## DSA meeting format (60 minutes)

- 0:00–0:05 — hook, goal, and connection to prior Java work
- 0:05–0:13 — visual trace or live demonstration
- 0:13–0:35 — guided implementation in Java
- 0:35–0:50 — core, support, or stretch challenge
- 0:50–0:56 — member demos and comparison of approaches
- 0:56–1:00 — runnable result, exit ticket, and anonymous pace/fun check

At least half of every meeting is spent writing, tracing, testing, or debugging code. No explanation block exceeds ten minutes.

## Estimated year map

| Approximate period | Meetings | Focus |
| --- | ---: | --- |
| December | 11–13 | Binary search and sorting foundations |
| January | 14–17 | Sets, maps, stacks, and queues |
| February | 18–20 | Two pointers, recursion, and graph representation |
| March | 21–23 | Graph readiness, BFS, and DFS |
| April | 24–26 | Priority queues, weighted graphs, and shortest paths |
| May | 27–29 | Dynamic-programming introduction or DSA capstone |
| Year end | 30 | Showcase, reflection, and leadership handoff |

This is a sequence, not a deadline. If fewer meetings are available, preserve Meetings 11–23, then choose either the shortest-path phase or the capstone. Dynamic programming is the first item to omit.

## Phase 1 — Search and sorting foundations

### Meeting 11 — Binary search by tracing intervals

- **Prerequisites:** sorted arrays, indexes, loops, conditionals, methods, and linear search
- **Build:** implement binary search after tracing `low`, `high`, and `mid` on cards or a table
- **Evidence:** explain why the remaining interval becomes smaller after each comparison
- **Support:** use a completed trace table and fill one row at a time
- **Stretch:** return the first occurrence of a duplicate value

### Meeting 12 — Binary-search debugging laboratory

- **Build:** repair off-by-one, incorrect comparison, and loop-condition bugs
- **Evidence:** identify the broken invariant and create a boundary test
- **Support:** compare a correct and incorrect trace side by side
- **Stretch:** write a reusable search method and test empty and one-element arrays

### Meeting 13 — Sorting through visible state changes

- **Prerequisites:** traversal, comparisons, swaps, and method decomposition
- **Build:** implement and visualize selection sort or insertion sort
- **Evidence:** state what portion of the collection is already ordered after each pass
- **Support:** sort physical cards before translating the steps into Java
- **Stretch:** compare operation counts on sorted, reversed, and random inputs

Do not rush through multiple sorting algorithms. One deeply understood algorithm is more valuable than several memorized implementations.

## Phase 2 — Data structures for real tasks

### Meeting 14 — `HashSet`: membership and uniqueness

- **Build:** detect duplicate usernames, words, or game items
- **Evidence:** explain when a set is more direct than repeated array searching
- **Support:** trace set contents after each operation
- **Stretch:** compare set-based and nested-loop solutions using operation counts

### Meeting 15 — `HashMap`: keys, values, and frequency counting

- **Build:** create a word-frequency or score-frequency analyzer
- **Evidence:** correctly update a value for an existing key
- **Support:** use a key/value table and a partially completed update method
- **Stretch:** report the most frequent item with a clear tie rule

### Meeting 16 — Stacks and last-in, first-out behavior

- **Build:** implement an undo history, bracket checker, or navigation history
- **Evidence:** trace push, peek, and pop without losing state
- **Support:** use physical cards as the stack before coding
- **Stretch:** evaluate a simple postfix expression

### Meeting 17 — Queues and first-in, first-out behavior

- **Build:** model a printer queue, support line, or turn system
- **Evidence:** trace enqueue, peek, and dequeue in the correct order
- **Support:** act out the queue before implementing it
- **Stretch:** run a small event simulation with arriving and completed tasks

## Phase 3 — Algorithm patterns and graph prerequisites

### Meeting 18 — Two pointers on arrays and strings

- **Prerequisites:** indexes, loops, conditionals, and sorted-data reasoning where needed
- **Build:** reverse a sequence, test a palindrome, or find a target pair
- **Evidence:** explain what each pointer represents and why it moves
- **Support:** annotate left/right positions on each loop iteration
- **Stretch:** remove duplicates from a sorted array in place

### Meeting 19 — Recursion and the call stack

- **Prerequisites:** methods, parameters, returns, conditionals, and stack tracing
- **Build:** implement a small recursive string, array, or number task
- **Evidence:** identify the base case and show how one call becomes a smaller call
- **Support:** use call-frame cards and compare with an iterative version
- **Stretch:** generate combinations for a small input

### Meeting 20 — Graphs as data

- **Prerequisites:** `ArrayList`, maps/sets, object references, stacks, and queues
- **Build:** represent a small club, route, or game map as an adjacency list
- **Evidence:** identify vertices, edges, neighbors, and connected components visually
- **Support:** begin with a drawn graph and a partially completed adjacency list
- **Stretch:** support directed or labeled edges

## Graph Traversal Gate and recovery

Before BFS or DFS, use the existing [Graph Traversal Gate](curriculum/READINESS_GATES.md). Members must individually demonstrate adjacency-list reading, queue order, stack order, visited-state reasoning, and the next frontier item.

If the gate does not pass, Meeting 21 becomes a shared graph-navigation game and recovery build. No separate permanent group is created.

## Phase 4 — Graph traversal

### Meeting 21 — Breadth-first search with a queue

- **Build:** explore a maze, social graph, or route graph level by level
- **Evidence:** trace queue and visited-set state after each step
- **Support:** use a prewritten graph and complete the trace before coding
- **Stretch:** calculate unweighted distance or reconstruct a path

### Meeting 22 — Depth-first search with recursion or a stack

- **Build:** explore the same graph deeply before backtracking
- **Evidence:** compare the DFS frontier with the prior BFS frontier
- **Support:** use an explicit stack before introducing recursive DFS
- **Stretch:** count connected components or detect a simple cycle

### Meeting 23 — BFS versus DFS challenge

- **Build:** solve two small graph problems and choose the traversal deliberately
- **Evidence:** justify the choice using frontier behavior and the desired result
- **Support:** use a decision checklist and smaller graphs
- **Stretch:** implement both traversals behind one shared interface

## Phase 5 — Weighted graphs and shortest paths

Proceed only when members can trace BFS/DFS, maintain visited state, use a priority queue, and explain weighted versus unweighted edges.

### Meeting 24 — Priority queues

- **Build:** create a task scheduler or emergency-response simulation
- **Evidence:** predict which item is removed next and explain the comparator
- **Support:** use a visible priority table and provided class scaffold
- **Stretch:** compare natural ordering with a custom comparator

### Meeting 25 — Weighted graphs and path cost

- **Build:** extend an adjacency list to store nonnegative edge weights
- **Evidence:** calculate path costs and explain why fewest edges may not be cheapest
- **Support:** use a small labeled graph and path-cost worksheet
- **Stretch:** design a reusable edge class with validation

### Meeting 26 — Dijkstra’s algorithm

- **Build:** compute shortest paths on a small nonnegative weighted graph
- **Evidence:** trace the priority queue, current best distances, and finalized vertices
- **Support:** complete a full paper trace before filling method sections
- **Stretch:** reconstruct and display the shortest route

Negative weights and advanced shortest-path algorithms are outside the core agenda.

## Phase 6 — Optional extension or capstone

Leadership chooses this phase using remaining meetings, member feedback, and demonstrated readiness.

### Option A — Dynamic-programming introduction

#### Meeting 27 — Repeated subproblems

- Compare plain recursion with memoization on a small example.
- Identify the state, base cases, and repeated work.

#### Meeting 28 — Build a DP table

- Solve a small counting or minimum-cost problem using a one-dimensional table.
- Explain what each entry means before writing the transition.

#### Meeting 29 — DP debugging and application

- Repair incorrect initialization, iteration order, or transitions.
- Apply the pattern to a new but closely related task.

### Option B — DSA capstone

Use three meetings to build a small Java application that meaningfully uses at least two studied structures or algorithms. Examples include:

- route finder using graphs and BFS or Dijkstra;
- text analyzer using maps, sets, sorting, and searching;
- puzzle or maze solver using queues, stacks, BFS, or DFS; or
- scheduling simulator using queues and priority queues.

Every team must submit runnable code, a short algorithm explanation, test cases, and a demo. Support variants may reduce feature scope; stretch variants may add visualization, performance measurement, or a second algorithm for comparison.

## Meeting 30 — Showcase and year-end reflection

- Demonstrate capstones or favorite DSA builds.
- Let members explain one algorithm with a trace or visualization.
- Collect anonymous feedback about pace, confidence, and next-year interests.
- Record reusable lessons and decisions without publishing names or individual performance.
- Complete the leadership handoff using the school-approved process and date, both `TBD`.

## Engagement rules throughout the DSA phase

- Begin with a puzzle, simulation, physical model, or useful application—not notation alone.
- Trace each algorithm before requiring a blank-page implementation.
- End every meeting with code that visibly works.
- Offer meaningful stretch work without letting advanced members set the core pace.
- Use pair roles that rotate: driver, navigator, tester, and explainer.
- Use contests only as optional applications after teaching the required concepts.
- Follow every challenge with an editorial and recovery opportunity.

## Monthly leadership checkpoint

Review only aggregate, non-identifying information:

1. retention compared with the first stable three-meeting cohort;
2. percentage producing the meeting’s runnable core evidence;
3. anonymous pace and fun responses;
4. common prerequisite gaps;
5. one concrete change for the next month; and
6. whether the next DSA phase is authorized by the relevant readiness evidence.

## Decisions still `TBD`

- exact meeting calendar and number of post-foundation meetings;
- adviser-approved projects and external competitions;
- whether the spring extension uses dynamic programming or a capstone;
- available devices and school-supported Java version; and
- showcase date, room, audience, and school approval.
