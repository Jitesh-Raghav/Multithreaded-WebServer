Multithreaded Web Server
This repository contains a Java-based multithreaded web server implementation for handling concurrent client connections.

Features:
-Utilizes multithreading to handle multiple client connections simultaneously.
-Simple response mechanism to demonstrate server functionality.
-Can be tested using JMeter for performance evaluation.

Usage:
-Running the Server
-Clone the repository to your local machine.
-Compile the Server_MultiThreaded.java file using javac:
javac MultiThreaded/Server_MultiThreaded.java
-Run the server using the following command:
java MultiThreaded.Server_MultiThreaded
The server will start listening on port 8010.

Testing with JMeter(Optional, but preffered):
-Download and install Apache JMeter official site.
-Open JMeter and create a new Test Plan.
-Add a Thread Group to the Test Plan.
-Add an HTTP Request sampler(TCCP) to the Thread Group and configure it to send requests to the server's IP address and port.
-Run the Test Plan to simulate client requests and evaluate server performance.

Running with Client Class:
-Compile the Client_MultiThreaded.java file in your CMD using javac.
-Compile and run the Server class using cmd.
-Run the compiled Client class with the server's IP address and port as arguments to establish a connection.

ERRORS:
-If you get an error similar to "could not load main class" etc, try to remove the "package MultiThreaded;" from the top of class.
-Change the directory of your client & server classes outside the package MultiThreaded.
-Then try to compile and run the programs again in cmd.
-They should work fine now.

Contributors:
Jitesh-Raghav - Creator and maintainer
