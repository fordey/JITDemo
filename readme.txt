This project is being used to highlight the performance of JIT compilation (bytecode optimisation etc etc) from interpreter execution.

The fibonacci sequence generation is the algorithm chosen to be executed under both executions.

As i am running on a windows machine i downloaded/installed the windows ptime utility.

To run the java program under interpreter only use the following java command


ptime java -Xint -jar JITDemo.jar 48  --will do a fib sequence up to 48 elements.


use -Xint to use interpreter execution
c:\Software\timer>ptime java -Xint -jar JITDemo.jar 35

ptime 1.0 for Win32, Freeware - http://www.pc-tools.net
Copyright(C) 2002, Jem Berkes <jberkes@pc-tools.net>

===  java -Xint -jar JITDemo.jar 35 ===
0 : 0
1 : 1
2 : 1
3 : 2
4 : 3
5 : 5
6 : 8
7 : 13
8 : 21
9 : 34
10 : 55
...
...
...
26 : 121393
27 : 196418
28 : 317811
29 : 514229
30 : 832040
31 : 1346269
32 : 2178309
33 : 3524578
34 : 5702887
35 : 9227465

Execution time: 1.900 s


--using the JIT compiler
c:\Software\timer>ptime java -jar JITDemo.jar 35

ptime 1.0 for Win32, Freeware - http://www.pc-tools.ne
Copyright(C) 2002, Jem Berkes <jberkes@pc-tools.net>

===  java -jar JITDemo.jar 35 ===
0 : 0
1 : 1
2 : 1
3 : 2
4 : 3
5 : 5
6 : 8
7 : 13
8 : 21
9 : 34
10 : 55
11 : 89
..
..
28 : 317811
29 : 514229
30 : 832040
31 : 1346269
32 : 2178309
33 : 3524578
34 : 5702887
35 : 9227465

Execution time: 0.496 s

