# Patterns

## Method
- Underline the literal requirements of the sentence (ask for a functions? output type?.
- Data that the sentence its giving, don't invent inputs.
- First solve the problem just using pencil in a table, next write the plan in coments, next code.
- Before to store something: "I need store this because___".
- After each change, run all the test (is something solved its broke now).

## Molds
- The first N that comply X: functon isX(n) boolean + while (count < N). Start in the first possible candidate, not in the answer.
- Problems in T cases: read T, cicle with T iterations: read, calculate, print. With no prompts, no store cases.
- Streak: current_streak and best. Current rise; when it breaks, compare with best and restart always. Also check at the ends of the cicle.
- Max/min: initialize in the first element (never 0). Take care about the empty case.
- Sum of proper divisors: a cicle with an acumulator, i < num.
- Percentajes: compare using integers, with no decimals.

## Mistakes that I already did.
- "till N" inclusive or exclusive? Try using a small N.
- A branch with 2 tasks under the same condition: separate them.
- Position vs Value: the name must say what it save.
- size() - 1 with a empty vector (with no sign) and arr[i+i] at the last.
- A for that repeats the same body: the "memory" it's in the variables, not in the draw.

## Outputs
- Copy the format under the page. Prompts just if the example shows it (or using System.err).
- Constraints are guarantees: they aren't validated. They seve types, runtime, and adge cases.

## Fast java
- System.out.println(x); Math.max(a, b); s.equals(t), never ==.
- After nextInt(), nextLine() return a empty line.
- Arraylist<Integer> l = new Arraylist<>(); l.add(x); l.get(i); l.size();
- HashMap<String,Integer> m: put, get, containsKey, gerOrDefault(k, 0), entrySet().
- int[][] m = new int[filas][cols]; m[i][j].
