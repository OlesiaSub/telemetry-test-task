### Test task for Telemetry System with Azul project, 2022

#### Description:
This project contains three classes with an executable main method in them:
FirstMainClass, SecondMainClass and OuterMainClass, and two helper classes. Their behaviour mainly differs in messages 
printed by loggers and in the output of System.out.

This project does not include any complex operations as I assumed that the trace of usage of 
classes will be sufficient to demonstrate the requested statement.

#### Usage:
To build .jar file of the project enter the following command from the root folder*:

`./gradlew assemble`

Next, to see how the behaviour of the program differs depending on the order of arguments
specified in classpath, you can execute the commands listed below (from the root as well):

* `java build/libs/telemetry-test-task-1.0-SNAPSHOT.jar` will finish with an error, as no main class was specified either in manifest or in classpath variable.
* `java -cp build/libs/telemetry-test-task-1.0-SNAPSHOT.jar ru.hse.OuterMainClass something else`
will find and launch main method in OuterMainClass and ignore other arguments.
* `java -cp build/libs/telemetry-test-task-1.0-SNAPSHOT.jar ru.hse.second.SecondMainClass ru.hse.second.FirstMainClass`
will find and launch main method in SecondMainClass and ignore other arguments. (You can try out its variations
too, you will see that only the first valid argument will be used. If the first argument is invalid - you will see an error)
* ` java -cp build/libs/telemetry-test-task-1.0-SNAPSHOT.jar ru.hse.second.SecondMainClass` this example shows
that despite the fact that the FirstHelper class is located in ru.hse.first package - its usage in SecondMainClass
does not influence the behaviour of the program. Same with the usage of Helper class.


*If you experience issues with ./gradlew assemble - consider downgrading your Java version to any stable
version prior to 17.2, it might help.
