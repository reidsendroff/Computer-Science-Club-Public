# Repository Instructions for Agents

## Mission

Help the Computer Science Club run a welcoming, beginner-first 2026–2027 program. The first ten member meetings are a shared Java foundation. Algorithms begin only after members demonstrate the prerequisite skills in the readiness gates.

## Nonnegotiable Context

- Treat `CS Club 2025-2026/` as an immutable archive. Do not rename, delete, reorganize, or "clean up" its files.
- The repository is public. Never add resumes, contact information, attendance, academic grades, individual progress, private feedback, or access credentials. The six officer names and roles were explicitly supplied as working public-facing context. Keep grade levels private unless adviser/school approval is documented.
- Unknown school dates, rooms, approvals, costs, and competition dates must remain `TBD` until checked against an official source.
- Use accurate Java language: methods, parameters, return values, local variables, instance fields, static fields, and access modifiers. Prefer private fields with public behavior and `static final` constants; do not normalize mutable public global state.
- Do not split beginners into permanent or public levels. Use core, support, and stretch variants, anonymous pace checks, readiness gates, and recovery paths.

## Meeting Standard

Every lesson must:

1. state prerequisites and one observable outcome;
2. limit direct instruction to 8–10 minutes at a time;
3. reserve at least half the meeting for hands-on work;
4. offer core, support, and stretch variants without public labels;
5. end with visible, runnable code and a short exit ticket;
6. include setup, starter code, solutions, and a recovery path.

## Content Workflow

1. Audit relevant context and existing artifacts.
2. Plan the smallest coherent change and list prerequisites.
3. Use one writer for implementation.
4. Review against `docs/CONTENT_STANDARDS.md` and `CS Club 2026-2027/operations/LESSON_REVIEW_CHECKLIST.md`.
5. Run link checks and compile Java examples before publishing.

Prefer the reusable prompts in `.agents/prompts/`. Keep durable decisions in `CS Club 2026-2027/operations/LEADERSHIP_DECISION_LOG.md`, not only in chat.

## Scope and Naming

- Current-year materials belong under `CS Club 2026-2027/`.
- Reusable meeting artifacts belong in `lessons/` and `code/` using the conventions in their README files.
- Use descriptive names; avoid `Copy of`, unexplained version numbers, or duplicated sources.
- Preserve existing user edits and avoid unrelated changes.
- Never stage, commit, or push unless the user explicitly asks for that Git action.
