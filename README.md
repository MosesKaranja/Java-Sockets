<html lang="en">
  <head>
  </head>
  <body>
    <h2>Java Sockets</h2>
    <p>The Following is a project showcasing communication from client to server using sockets. To run the project install Intellij IDE and install Java JDK Version 11 which is the Long Term Support Version as of this project.</p> 
    <h2>Running the Project</h2>
    <p>The Project has been split up into two major directories, the Client and Server Drectory located in Java-Sockets > src > main > java</p>
    <p>To run the project start of by running SocketServer2.java located in Server directory.</p>
    <p>Then run the StudentInfo.java located in Client > ui directory. This will open up an interface where you can provide student data that will all be sent to the Server through sockets all in one instruction.<p>
    <h2>About the Files</h2>
    <h3>ClientProtocol.java</h3>
    <p>This class checks if the response recieved is valid and if the response recieved is invalid it throws an Exception</p>
    <p></p>
    <h3>SocketClient2.java</h3>
    <p>This is the class that is responsible for making .a connection to the SocketServer.</p>
    <p>It's also a class that is responsible for making requests to the SocketServer.</p>
    <h3>ServerProtocol.java</h3>
    <p>This is the class that is used to process the request from the client and produce an output in the terminal.</p>
    <h3>SocketServer2.java</h3>
    <p>This is the class that starts up the SocketServer and Waits to recieve input from the SocketClient.</p>
    <p>This is the class that needs to be started<p>
    <h3>UI Classes</h3>
    <p>There are three UI Classes all in JavaFx LayoutNavigation.java, Layouts.java and StudentInfo.java</p>
    <p>StudentInfo.java is the main UI class that will put the ui together and that needs to be started after SocketServer2.java</p>
  </body>
</html>
