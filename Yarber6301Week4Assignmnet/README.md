Flexible Notification System (Initial Implementation)

Author: Andrew Q. Yarber

Version: 1.0

📝 Project Purpose
This software provides a modular framework for sending notifications through different channels (Email and SMS). It utilizes the Strategy Design Pattern to ensure the system is "Open-Closed"—open for extension (adding new services) but closed for modification.


📋 Prerequisites
To build and run this application, you must have the following installed:

Operating System: Windows, macOS, or Linux.

Runtime: Java JDK 17 or higher.

Terminal: Bash, Zsh, or PowerShell.


🚀 Quick Start (Under 5 Minutes)
Because all source files are located in the root directory, follow these steps to get the app running:

Compile all Java files:

Bash

javac *.java


Execute the demonstration program:

Bash

java Main


📦 Dependency Management
This project is built using standard Java libraries to minimize external dependencies.


Environment Setup: No external manifest (like pom.xml) is required. A developer can set up the environment simply by ensuring Java JDK 17+ is in their system path.


🏗 Architecture & Logic
Strategy Pattern: The AlertSystem delegates the notification task to a NotificationMedium interface. This allows implementations (Email, SMS) to be swapped at runtime without changing the AlertSystem code.

Composition over Inheritance: The project prioritizes composition to maintain high flexibility and modularity.

History Tracking: All sent notifications are stored in a java.util.ArrayList<String> to provide a persistent session log.


🛠 Maintenance: Adding New Services
The system is designed for a professional handover. To add a new service:

Create a new class in the root directory (e.g., SlackService.java).

Implement the NotificationMedium interface.

Inject the new class into the AlertSystem using setMedium().


🧪 Testing Suite
To verify the build's health and trust the software, run the Main class.

Command: 

java Main


Verification:

Confirms EmailService prints output to the console.

Confirms SMSService prints output to the console.

Verifies the internal ArrayList correctly logs and displays the session history.


⚙️ Environment Configuration
Source Control: A .gitignore file is included to exclude compiled .class files, IDE-specific folders (.vscode, .idea), and the docfolder to prevent repository clutter.

Simulated Services: No .env or API keys are required as the services currently use simulated console outputs.


📚 API Documentation (JavaDocs)
This project uses the Maven Javadoc Plugin to standardize technical documentation. Inline JavaDocs are present for all public methods and classes.

To generate the full HTML technical manual in the target/site/apidocs folder, run the following command from the root directory:

Bash

mvn javadoc:javadoc



⚖️ Licensing

This project is licensed under the MIT License—giving professionals the legal right to modify and distribute the code as needed.