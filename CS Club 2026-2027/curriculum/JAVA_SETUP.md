# Java Setup

Goal: every student can run code in the first meeting. Setup should take no more than 10 minutes; after that, switch to the fallback.

## Path A: school-supported local Java

The supported JDK version and editor are `TBD` pending school-device verification.

Once installed, verify in a terminal:

```sh
java -version
javac -version
```

During kickoff, create `ClubIntro.java` from facilitator-led steps; no reusable starter/base file is stored in this repository. From that folder:

```sh
javac ClubIntro.java
java ClubIntro
```

Expected output: `Welcome to Computer Science Club!`

## Path B: zero-install browser fallback

The approved browser IDE is `TBD` pending school filtering, account, privacy, and Java-version checks. Before recruitment, leaders must verify that it:

- runs Java without a student creating a public profile;
- works on school devices and network;
- supports saving or downloading code safely;
- does not expose personal information by default.

Keep a tested direct link/QR code in the private event checklist. Do not invent or announce a platform before verification.

## Path C: pair-and-rotate fallback

If a device fails, pair students on a working device. One person describes the next change while the other types; swap after five minutes. Both must run one personal modification before leaving.

## Common Week 2 issue: `Scanner`

After `nextInt()`, the newline remains unread. A following `nextLine()` may return an empty string. Either read the leftover newline once or read the number as a line and parse it. Demonstrate this deliberately instead of letting it appear as a mysterious failure.

## Leader preflight

- Test local compile/run and the browser fallback on a school device.
- Prepare offline code copies and expected output.
- Confirm file/class names match exactly.
- Keep installation/admin steps out of the main lesson.
