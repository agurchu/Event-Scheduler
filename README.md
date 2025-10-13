# Event Scheduler Project

## Overview
The **Event Scheduler** is a console-based Java application that allows users to manage events. Users can view, add, remove, and reschedule events through a menu-driven interface. The system supports three types of events: `PersonalEvent`, `WorkEvent`, and `SocialEvent`, each with a name, date, duration, and priority. This project is designed to help you practice object-oriented programming (OOP) concepts, including inheritance, encapsulation, and unit testing.

## Project Structure
The project is organized in the Java package `za.co.wethinkcode.scheduler`. The following files are included:

- **Source Files**:
    - `Event.java`: Abstract base class defining the `Event` interface.
    - `PersonalEvent.java`: Represents a personal event (to be implemented).
    - `WorkEvent.java`: Represents a work event (to be implemented).
    - `SocialEvent.java`: Represents a social event (to be implemented).
    - `EventScheduler.java`: Main application class with the console interface and event management logic.
    - `Main.java`: Entry point to run the application.

- **Test Files**:
    - `PersonalEventTest.java`: JUnit tests for `PersonalEvent`.
    - `WorkEventTest.java`: JUnit tests for `WorkEvent`.
    - `SocialEventTest.java`: JUnit tests for `SocialEvent`.
    - `EventSchedulerTest.java`: JUnit tests for `EventScheduler`.

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher.
- **JUnit**: Version 5 (Jupiter) for running tests.
- **IDE or Build Tool**: Use an IDE like IntelliJ IDEA, Eclipse, or VS Code, or a build tool like Maven/Gradle to manage dependencies and run tests.

## Setup Instructions
1. **Create a Java Project**:
    - Set up a new Java project in your preferred IDE.
    - Use the package `za.co.wethinkcode.scheduler` for all source and test files.
    - Place source files in the `src/main/java/za/co/wethinkcode/scheduler` directory.
    - Place test files in the `src/test/java/za/co/wethinkcode/scheduler` directory.

2. **Add Files**:
    - Copy the provided files (`Event.java`, `PersonalEvent.java`, `WorkEvent.java`, `SocialEvent.java`, `EventScheduler.java`, `Main.java`) into the source directory.
    - Copy the test files (`PersonalEventTest.java`, `WorkEventTest.java`, `SocialEventTest.java`, `EventSchedulerTest.java`) into the test directory.

3. **Configure JUnit**:
    - Ensure JUnit 5 is included in your project. If using Maven, add the following dependency to your `pom.xml`:
    
    - For Gradle, add:
      ```gradle
      testImplementation 'org.junit.jupiter:junit-jupiter:5.9.0'
      ```

4. **Run the Application**:
    - Run `Main.java` to start the Event Scheduler. Use the console menu to interact with the application.

## Your Task
Your primary task is to complete the implementation of the `PersonalEvent`, `WorkEvent`, and `SocialEvent` classes. These classes are currently empty templates that extend the abstract `Event` class. You must implement the constructors and methods to pass the provided unit tests.

### Implementation Guidelines
For each class (`PersonalEvent`, `WorkEvent`, `SocialEvent`):
- **Fields**:
    - `eventName`: A `String` for the event's name.
    - `eventDate`: A `String` for the event's date (format: `YYYY-MM-DD`).
    - `duration`: An `int` for the event's duration in minutes.
    - `priority`: A `String` with a fixed value (`Low` for `PersonalEvent`, `High` for `WorkEvent`, `Medium` for `SocialEvent`).

- **Constructors**:
    - Default constructor: Set default values (e.g., `"Personal Event"`, `"2025-01-01"`, `60` for `PersonalEvent`).
    - Parameterized constructor: Accept `eventName`, `eventDate`, and `duration` and initialize the fields.

- **Methods**:
    - `getEventName()`: Return the event name.
    - `setEventName(String)`: Update the event name.
    - `getEventDate()`: Return the event date.
    - `setEventDate(String)`: Update the event date.
    - `getDuration()`: Return the event duration.
    - `setDuration(int)`: Update the duration, ensuring it is non-negative.
    - `getPriority()`: Return the fixed priority value.

### Example Behavior
- **PersonalEvent**:
    - Default: Name = "Personal Event", Date = "2025-01-01", Duration = 60, Priority = "Low".
    - Setters should update fields, with `setDuration` rejecting negative values.
- **WorkEvent**:
    - Default: Name = "Work Event", Date = "2025-01-01", Duration = 120, Priority = "High".
- **SocialEvent**:
    - Default: Name = "Social Event", Date = "2025-01-01", Duration = 90, Priority = "Medium".

### Running Tests
- Run the JUnit tests (`PersonalEventTest`, `WorkEventTest`, `SocialEventTest`, `EventSchedulerTest`) to verify your implementations.
- All tests should pass once you correctly implement the event classes.
- Use your IDE's test runner or a command like `mvn test` (Maven) or `gradle test` (Gradle).

## Application Usage
Run `Main.java` to start the Event Scheduler. The console menu provides the following options:
1. **View Events**: Display all events with their name, date, duration, and priority.
2. **Add Event**: Create a new event by specifying its name, date, duration, and type (Personal, Work, or Social).
3. **Remove Event**: Remove an event by its name.
4. **Reschedule Event**: Update an event's date and duration.
5. **Exit**: Close the application.

## Testing
The provided test files verify the following:
- **PersonalEventTest**: Tests getters, setters, and default values for `PersonalEvent`.
- **WorkEventTest**: Tests getters, setters, and default values for `WorkEvent`.
- **SocialEventTest**: Tests getters, setters, and default values for `SocialEvent`.
- **EventSchedulerTest**: Tests adding and removing events in the `EventScheduler` class.

Ensure all tests pass by implementing the event classes correctly.

## Optional Extensions
Once you complete the core implementation, consider adding these features:
1. **Date Validation**: Ensure event dates follow the `YYYY-MM-DD` format and are valid.
2. **Event Sorting**: Add a method to sort events by date or priority.
3. **Conflict Detection**: Implement a feature to warn about events scheduled on the same date.
4. **Enhanced Input Validation**: Handle invalid inputs (e.g., negative durations, empty names) more robustly.

## Tips
- Refer to the test files to understand the expected behavior of each method.
- Test your implementation incrementally, running tests after each method to catch errors early.
- Use the console application to manually verify that your event classes work with the `EventScheduler`.

## Submission
- Submit your completed `PersonalEvent.java`, `WorkEvent.java`, and `SocialEvent.java` files.
- Ensure all tests pass and the application runs without errors.
- Optionally, include any extensions you implemented with a brief description.

Good luck, and have fun scheduling events!