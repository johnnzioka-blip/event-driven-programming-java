# Week 1 Self-Assessment

## Learning Outcome 1: Define EDP Components
1. **What is an event?** An action or occurrence detected by a program (e.g., clicking a button, pressing a key)[cite: 7].
2. **What is an event source?** The component that generates the event (e.g., a keyboard, a mouse click)[cite: 9].
3. **What is an event listener?** An object that waits or listens for an event to occur from a source (e.g., an ActionListener attached to a button)[cite: 7, 18].
4. **What is an event handler?** The block of code that runs when an event is caught and processed (e.g., updating a text label when a button is clicked)[cite: 7, 17].
5. **Component Relationship Diagram:** 
   User Action → Event Source → Event Object → Event Queue → Event Loop Handler → GUI Update[cite: 33]

## Learning Outcome 2: Compare Paradigms
6. **How does procedural differ from event-driven?** Procedural runs code step-by-step in a strict, linear order controlled by the program, while event-driven lets the user control the flow by interacting with elements in any order[cite: 12, 21].
7. **Main advantage for GUIs?** It allows users to interact freely, make mistakes, and recover easily without crashing the app[cite: 21].
8. **When to choose procedural?** For simple, linear scripts or command-line programs where steps always happen in the exact same order.

## Learning Outcome 3: Event Loop and Queue
9. **What is the event loop?** A continuous loop that checks the queue for new events and runs their handlers[cite: 9, 10].
10. **What is the event queue?** A holding line where events wait in order before being processed by the loop[cite: 9, 10].
11. **Why never block the event loop?** Because it freezes the entire user interface and prevents any other clicks or actions from being processed[cite: 10, 11].
12. **What is the EDT?** The Event Dispatch Thread in Java Swing, which handles all GUI updates safely[cite: 23].

## Learning Outcome 4: Real-World Examples
13. **Five real-world systems:** ATM machines, microwave ovens, traffic lights, elevators, and smartphone touchscreens[cite: 7, 8].
14. **ATM components:** Source = Keypad button, Event = Button pressed, Listener = ATM software, Handler = Verify PIN[cite: 7].
15. **Why modern apps are event-driven?** Because users expect interactive, responsive user interfaces where they can click, scroll, and type at any time.
