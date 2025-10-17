Simple Banking Application
A console-based application built in Java for creating and managing multiple simple bank accounts.

📝 About The Project
This project was built as my first major application in Java. The primary goal was to apply my knowledge of Object-Oriented Programming (OOP) and Data Structures to build a functional program. It provides a simple and efficient command-line interface to manage multiple bank accounts, replacing the need to track them manually.

✨ Key Features
Here are some of the main features of the application:

Create New Accounts: Add new user accounts with a name and initial balance.

Automatic Account Numbers: Each new account is assigned a unique, automatically generated account number.

Deposit & Withdraw: Perform deposit and withdrawal transactions on specific accounts.

Balance Protection: The system prevents withdrawals that would exceed the current account balance.

View All Accounts: Display a list of all accounts with their details.

Main Menu:

Viewing All Accounts:

Getting Started
Follow these instructions to get a copy of the project up and running on your local machine.

Prerequisites
You will need to have the following installed on your computer:

Java Development Kit (JDK) 11 or higher.

Git

How to Run
Clone the repository:

Bash

git clone https://github.com/[your-username]/simple-banking-application.git
Navigate to the project directory:

Bash

cd simple-banking-application
Compile the Java files (assuming they are in a src folder):

Bash

javac src/*.java
Run the application:

Bash

java -cp src BankApp
💻 Tech Stack
Core Language: Java (JDK 11+)

Development Tools: Git, GitHub, VS Code

🧠 What I Learned
Building this project was a great learning experience. Here are some of the key things I learned and practiced:

Object-Oriented Programming: Designing a robust Account class using encapsulation (private variables), constructors, methods, and static variables for a shared counter.

Data Structures: Using an ArrayList to efficiently store and manage a dynamic list of Account objects.

User Input & Control Flow: Building an interactive and persistent command-line menu using Java's Scanner class, a while(true) loop, and a switch statement.

Error Handling: Implementing logic to handle user errors, such as searching for an account number that does not exist.

Version Control: Using Git and GitHub to manage the codebase and track changes throughout the project's lifecycle.
