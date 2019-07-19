Project : Toy Robot Simulator

Toy Robot simulation is a command line application in JAVA that can move around
a grid of 5 * 5 units.

This application can read in commands of the following (textual) form:

    PLACE X Y F
    MOVE
    LEFT
    RIGHT
    REPORT

- PLACE will put the toy robot on the table in position X,Y and facing NORTH,
  SOUTH, EAST or WEST.
- The origin (0,0) can be considered to be the SOUTH WEST most corner.
- The first valid command to the robot is a PLACE command, after that, any
  sequence of commands may be issued, in any order, including another PLACE
  command. The application should discard all commands in the sequence until
  a valid PLACE command has been executed.
- MOVE will move the toy robot one unit forward in the direction it is
  currently facing.
- LEFT and RIGHT will rotate the robot 90 degrees in the specified direction
  without changing the position of the robot.
- REPORT will announce the X,Y and F of the robot.

Example :

1.
Input :
    PLACE 0 0 NORTH
    MOVE
    REPORT

Expected output:
    0:1:NORTH

2.
Input :
    PLACE 0 0 NORTH
    LEFT
    REPORT

Expected output:
    0:0:WEST

3.
Input :
    PLACE 1 2 EAST
    MOVE
    MOVE
    LEFT
    MOVE
    REPORT

Expected output
    3:3:NORTH

Compile :

  1. Extract attached tar file into a directory.
     tar -vxf <tar_file>
  2. Go to toyrobot directory.
     cd toy-robot/src/com/toyrobot/
  3. Compile
     javac *

  4. Provide execute permissions to file if not available
     chmod 755 *

Run :

1. Go to src directory.
   cd toy-robot/src
2. Run : java com.toyrobot.ToyRobot

Test :

1. JUnit Test class : ToyRobotSimulationTest.java
