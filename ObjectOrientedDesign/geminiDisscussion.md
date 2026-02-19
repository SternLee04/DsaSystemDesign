# The 3-Phase Mastery Schedule

### Phase 1: The "Grammar" (Days 1–5)
- What to learn: SOLID Principles and the Creational Patterns.
- The GoF Layer: Read the "Introduction" (first 30 pages) of GoF. It explains "Program to an interface, not an implementation." This is the single most important sentence in the book.
- The Modern Layer: Study Singleton, Factory, and Builder on Refactoring.Guru.
- Goal: Be able to explain why a private constructor is used in Singleton and why if-else blocks for object creation should be moved to a Factory.

### Phase 2: The "Vocabulary" (Days 6–12)
- What to learn: Structural and Behavioral Patterns.

- The Patterns:
    - Strategy: (Absolute Must) For interchangeable algorithms.
    - Observer: For event-driven systems (Notifications/Stock tickers).
    - Adapter: For connecting incompatible interfaces.
    - State: For systems with complex internal states (ATM/Vending Machine).
    - Decorator: For adding features without inheritance (Coffee shop toppings).

- How much to learn: For each pattern, you must know: 1. The UML Diagram, 2. One Real-world example, and 3. The Trade-offs (e.g., Singleton makes unit testing hard).

### Phase 3: The "Fluent" Execution (Days 13–21)
- What to learn: Applying patterns to "The Big 5" LLD Interview Problems.

- Daily Practice:
    - Day 13-14: Parking Lot (Use Factory for Vehicles, Strategy for Fees).
    - Day 15-16: Elevator System (Use State Pattern for Up/Down/Idle).
    - Day 17-18: Splitwise (Focus on the Transaction Entity and Observer).
    - Day 19-20: Movie Booking (BookMyShow) (Focus on Concurrency & Singleton for Database).
    - Day 21: Snake and Ladder (The simplest one to refine your "Game Loop" logic).

- The "FAANG Signal" Checklist (The Mastery Bar)
To pass as an SDE-1 at a FAANG company, your solution must check these 4 boxes in under 45 minutes:

    - Requirement Clarification: Did you ask, "Should the Parking Lot support monthly passes or just hourly?"

    - Entity Definition: Are your classes "Thin" (minimal logic) or "Fat" (messy)? Use Enums for fixed types.

    - Extensibility: If I say, "Now add a VIP discount," can you do it by adding one new class without touching existing ones? (This proves you used the Strategy Pattern correctly).

    - Concurrency Awareness: If two people book the same seat at the same time, how does your code handle it? (Mention synchronized or Locks).

## The 10/10 "Hybrid" Strategy
If you want to attain mastery without wasting time, use this "Sniper Approach":

### 1. The 80/20 Rule (What to actually read)

- Instead of the whole book, read only these specific GoF chapters (The "Holy Grail" of LLD):

    - Chapter 1 & 2: These are the most important pages. They teach the philosophy: "Favor object composition over class inheritance" and "Program to an interface, not an implementation.
    - "Creational: Factory Method, Abstract Factory, Singleton, Builder.
    - Structural: Adapter, Decorator, Facade.
    - Behavioral: Strategy, Observer, State, Command.

### 2. The Refactoring Guru "Visualizer"

- Use Refactoring Guru as your Primary Teacher.

    - Flow: Read the pattern on the website -> Look at the modern Java/C++ code -> Understand the "Problem" vs "Solution" visuals.
    - Why: It’s 10x faster to digest than the GoF text.
### 3. The "Interview Problem" Execution
- Don't just practice; build. For every pattern you learn, apply it to one of these FAANG favorites:

    - Learn Strategy Pattern -> Apply it to "Pricing Logic" in a Zomato LLD.
    - Learn State Pattern -> Apply it to an ATM Machine or Elevator.Learn 
    - Observer Pattern -> Apply it to a CricBuzz score updater.

- here is the link of more formal syllabus for OOD [link](https://www.educative.io/courses/grokking-the-low-level-design-interview-using-ood-principles).