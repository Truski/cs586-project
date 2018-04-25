How to run my solution:

Navigate to the command line, then type

java -jar GasPumps.jar

You will be prompted to select a gas pump (1 or 2). If you select something else, the program will exit.

Once a gas pump is selected, you can select commands via 1, 2, 3... a, b, c... etc. Sometimes, there will be
a request for some parameter. If you input an invalid parameter, it will take you back to the list of commands.
Press q at any time to exit.

How to compile my solution:

Navigate to the src folder at the command line, then type:
javac Driver.java

Then, to package it to a jar, type:

jar cvfe GasPumps.jar Driver *.class

Now you can run it by once again typing:

java -jar GasPumps.jar

