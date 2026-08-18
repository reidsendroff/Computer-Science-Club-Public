# Mega Super Prompt: Build the Beginner-First CS Club Program

Copy the prompt below into an agent session rooted at this repository. It is executable as written.

---
You are the orchestrator for the Computer Science Club's 2026–2027 program. Deliver a coherent, beginner-first Java curriculum and the operational materials needed to run it. Work in the repository root.

## Mission and facts

- No prior coding experience is required.
- The first ten member meetings are a shared Java foundation; do not split into lanes early.
- Last year, attendance fell from about 15 to 3–4 after lessons jumped into binary search and BFS/DFS without prerequisites. Fix the program design, not the students.
- Every meeting ends with visible, runnable code.
- Direct teaching is limited to 8–10 minutes at a time; at least half of meeting time is hands-on.
- Every activity has core, support, and stretch choices, an exit ticket, and a recovery path.
- Do not use public rankings or permanent ability labels.
- Java terminology must be accurate. Teach methods, parameters, returns, scope, local variables, instance/static fields, and access modifiers. Prefer private fields/public behavior and `static final` constants; never normalize mutable public globals.
- Binary search starts only after the Java Foundations Gate. Graphs, BFS, and DFS come much later, after collections, stack/queue, maps/sets, recursion or iterative state, graph representation, and traversal reasoning.
- Group progression requires active-cohort attendance validity of at least 60% and at least 80% of checkpoint participants (20+ hands-on minutes) to complete every member-level gate item. Use the percentage selecting “too fast,” never an average of categories. Recovery stays in the shared meeting, rechecks occur within two attended meetings, and no recovery track becomes permanent.
- The repository is public. Never add resumes, contact details, rosters, attendance, academic grades, individual progress, private feedback, or credentials. Supplied officer grade levels require adviser/school approval before public push.
- Treat `CS Club 2025-2026/` as immutable. Preserve user changes. Unknown dates and logistics remain `TBD` until officially verified.

## Workflow

1. **Audit:** Read `AGENTS.md`, `docs/CLUB_CONTEXT.md`, `docs/CONTENT_STANDARDS.md`, the current-year README, scope and sequence, readiness gates, agenda, and relevant templates. Inventory existing files and user changes. Do not edit yet.
2. **Plan:** Propose the smallest set of artifacts needed. Map every topic to prerequisites, learner evidence, recovery, owner, and verification. Confirm that the first ten meetings remain shared Java foundations.
3. **Single writer:** After the plan is accepted or clearly implied, assign exactly one implementation writer in the shared checkout. Other agents and CLIs are read-only advisers. Preserve unrelated work and never rewrite the historical archive.
4. **Implement:** Use repository templates and conventions. Create lessons, slides outlines, exercise sets, solutions, and code. Compile examples. Update indexes and cross-links.
5. **Review:** Have an independent reviewer audit the diff for pacing, beginner accessibility, Java accuracy, prerequisites, privacy, unresolved links, unsupported dates, and runnable examples. The writer resolves supported findings.
6. **Verify:** Run `git diff --check` for tracked changes, a separate stage-free check for every untracked Markdown/Java file, a relative-Markdown-link check, a privacy scan, and `javac` on Java examples. Confirm the agenda contains no premature algorithm topics. Do not claim `git diff --check` covers untracked files and do not stage files merely to check them.

   Use this stage-free untracked whitespace/final-newline check (it exits nonzero for trailing spaces/tabs or a missing final newline):

   ```sh
   python3 - <<'PY'
   from pathlib import Path
   import subprocess, sys

   names = subprocess.check_output(
       ["git", "ls-files", "--others", "--exclude-standard", "-z"]
   ).decode().split("\0")
   problems = []
   for name in filter(None, names):
       path = Path(name)
       if path.suffix not in {".md", ".java"}:
           continue
       data = path.read_bytes()
       if data and not data.endswith(b"\n"):
           problems.append(f"{name}: missing final newline")
       for number, line in enumerate(data.splitlines(), 1):
           if line.endswith((b" ", b"\t")):
               problems.append(f"{name}:{number}: trailing whitespace")
   print("\n".join(problems))
   raise SystemExit(bool(problems))
   PY
   ```
7. **Report:** List exact files changed, tests run, reviewer findings resolved or deferred, and all `TBD` decisions. Do not commit or push unless explicitly asked.

## Required artifacts

- A week plan or lesson package using `templates/LESSON_PLAN_TEMPLATE.md`
- Slides outline, exercise set, solution editorial, and exit ticket
- Runnable Java starter/solution files when relevant
- Updated `lessons/README.md` and `code/README.md`
- Prerequisite and readiness-gate references
- A named recovery path and a meaningful advanced stretch path

## Acceptance criteria

- The first ten shared meetings follow: run/edit/main/printing; variables/types/String/Scanner; booleans/conditionals; loops; methods/parameters/returns/scope; arrays/strings/traversal; debugging/tests/stack traces; classes/objects/constructors/private fields/public methods; ArrayList/team mini-capstone; algorithm bridge with linear search/min/max/counting/complexity intuition.
- A group gate passes only with at least 60% active-cohort attendance validity and 80% checkpoint readiness using the denominator/evidence/recheck rules in `READINESS_GATES.md`; no permanent parallel track is allowed.
- Binary search appears no earlier than weeks 11–12 and only after a gate.
- BFS/DFS are scheduled only after all named prerequisites.
- At least 50% of each lesson is hands-on; no lecture block exceeds 10 minutes.
- Each meeting includes core/support/stretch, runnable output, and an exit ticket.
- There are no invented dates, private data, public rankings, or permanent labels.
- All links resolve and every Java example compiles.

Return a concise implementation report. If any acceptance item cannot be met, stop and explain the exact blocker rather than silently weakening the standard.

---
