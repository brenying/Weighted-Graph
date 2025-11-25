# Week 13 Graphs – Depth-First Search on a Weighted Graph

## Objective

The Week 13 Graphs program demonstrates creating a weighted graph, adding vertices and edges, and performing a depth-first search (DFS) starting from a chosen node.

### Skills Learned

- Constructing a graph using adjacency lists.
- Adding weighted edges between vertices.
- Implementing and executing depth-first search (DFS).
- Understanding graph traversal and connectivity patterns.
- Working with custom `graph` classes in Java.

### Tools Used

- Java programming language.
- Custom `graph` class with methods for:
  - Adding vertices
  - Adding weighted edges
  - Performing DFS traversal

## Steps

1. Create an instance of the `graph` class.
2. Add the vertices: **A, B, C, D, E, F, S**.
3. Add weighted edges representing connections:
   - `S → A (3)`
   - `S → C (2)`
   - `S → F (6)`
   - `C → A (2)`
   - `A → B (6)`
   - `A → D (1)`
   - `B → E (1)`
   - `C → D (3)`
   - `D → E (4)`
   - `F → E (2)`
4. Run a DFS traversal starting from vertex **S**.
5. The DFS output shows the order in which nodes are visited.
