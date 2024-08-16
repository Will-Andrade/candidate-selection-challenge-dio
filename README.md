# Candidate Selection Process

This project simulates a candidate selection process for a company. It involves analyzing candidates based on their pretended salary range and attempting to contact selected candidates via a simulated phone call process.

## Table of Contents
- [Tools](#tools)
- [Installation & Running the Application](#installation--running-the-application)
- [How to Use The Project](#how-to-use-the-project)
- [Challenges Faced](#challenges-faced)
- [Next Steps](#next-steps)
- [Credits](#credits)

# Tools
For this project, I used:
- Java

This project aims to practice basic Java concepts such as loops, conditionals, methods, and user input handling using the Scanner class.

## Installation & Running the Application

To run this project locally, follow these steps:

Clone the repository:

- HTTPS
```bash
$ git clone https://github.com/Will-Andrade/candidate-selection-challenge-dio.git
```

- SSH
```bash
$ git clone git@github.com:Will-Andrade/candidate-selection-challenge-dio.git
```

To compile and run the application, use the following commands:

```bash
$ cd candidate-selection-challenge-dio
$ javac -d bin src/br/com/andraDev/Main.java
$ java -cp bin br.com.andraDev.Main
```

## How to Use The Project
After running the application, you will be prompted to input the pretended salary range for each candidate. Based on the input, candidates will be selected, and an attempt to contact them will be made.

- Candidate Selection
Analyzing Candidates:
The system will analyze each candidate's pretended salary. Based on the salary, it will decide whether to call the candidate, make a counter offer, or wait for other candidates' results.

- Simulated Phone Call:
For selected candidates, the system will simulate a phone call. The call will be attempted up to three times before giving up.

Demo:

Salary Input:
```bash
Please, enter your pretended salary range below.
1900.50
```

Selection Result:
```bash
CALL CANDIDATE!
```

Phone Call Simulation:
```bash
We were able to get in touch with Willian in 2 tries.
```

Printing the Selected Candidates:
```bash
The candidate: Willian was selected.
```

## Challenges Faced

A big challenge was simulating the phone call process with retries and handling cases where the candidate could not be reached. I also diverged from the initial idea of the project and needed to find a way to dinamically put all 5 selected candidates inside a **List** to log them later to the console instead of hard coding them.

## Next Steps

I am satisfied with how the project is right now but some welcome changes could be:
- Implement unit tests for the methods to ensure the application behaves as expected.
- Add more functionality, such as handling more complex candidate data and refining the selection criteria.
- Improve user interaction by providing more detailed feedback and handling invalid inputs gracefully.

## Credits
The idea for this project came from the Digital Innovation One (DIO) Java with Spring Boot bootcamp. But other than that, all code was created by me, Willian Andrade.
