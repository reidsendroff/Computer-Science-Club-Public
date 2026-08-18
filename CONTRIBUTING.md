# Contributing

## Before you start

Read [AGENTS.md](AGENTS.md), [club context](docs/CLUB_CONTEXT.md), and [content standards](docs/CONTENT_STANDARDS.md). Do not change the 2025–2026 archive.

## Add a lesson

1. Confirm its prerequisites in the [prerequisite map](CS%20Club%202026-2027/curriculum/PREREQUISITE_MAP.md).
2. Copy the relevant file from `templates/`.
3. Include a core task, optional support, optional stretch, an exit ticket, and runnable code.
4. Compile all Java examples and test the learner instructions from a clean folder.
5. Run the [lesson review checklist](CS%20Club%202026-2027/operations/LESSON_REVIEW_CHECKLIST.md).
6. Add links to `lessons/README.md` and, when applicable, `code/README.md`.

## Pull request checklist

- The lesson spends at least half its time on hands-on work.
- No explanation segment exceeds 10 minutes.
- The core task can be completed by a beginner with the listed prerequisites.
- Support and stretch choices are private, flexible, and non-stigmatizing.
- The ending produces visible, runnable code.
- Unknown dates and logistics are marked `TBD`.
- No private student information or credentials are present.
- Relative Markdown links resolve and Java code compiles.

Use clear commit messages such as `Add week 3 conditionals lesson`. Do not commit generated binaries such as `.class` files.
