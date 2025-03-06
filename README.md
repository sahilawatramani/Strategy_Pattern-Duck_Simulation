# Strategy Pattern - Duck Simulation  
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)  

## Overview  
The **Strategy Pattern - Duck Simulation** is a Java-based implementation of the **Strategy Design Pattern**, which promotes flexibility and maintainability by encapsulating behaviors into separate strategy classes.  

This simulation models different types of ducks with unique **quacking**, **swimming**, and **flying** behaviors. Instead of hardcoding these behaviors into each duck class, the **Strategy Pattern** is applied, allowing behaviors to be set dynamically at runtime.  

---

## Strategy Pattern Explanation 
The **Strategy Pattern** is a behavioral design pattern that enables selecting an algorithm’s behavior at runtime. Instead of implementing multiple behaviors inside a class, we define separate strategy classes and dynamically assign them to objects.  

###  Key Benefits: 
✔️ **Encapsulation of Behaviors** - Avoids code duplication by isolating behaviors.  
✔️ **Dynamic Behavior Assignment** - Behaviors can be changed at runtime.  
✔️ **Open-Closed Principle** - New behaviors can be added without modifying existing code.  

---

##  Project Structure  
This project follows a modular approach where different functionalities are broken down into separate classes.  

###  1️⃣ Interfaces (Strategy Interfaces)
| File Name        | Description |
|-----------------|-------------|
| `FlyBehaviour.java` | Defines the interface for flying behavior |
| `SwimBehaviour.java` | Defines the interface for swimming behavior |
| `QuackBehaviour.java` | Defines the interface for quacking behavior |

###  2️⃣ Behavior Implementations (Concrete Strategies) 
These classes provide specific implementations for different duck behaviors.  

| File Name        | Description |
|-----------------|-------------|
| `CanFly.java` | Implements flying behavior for ducks that can fly |
| `CantFly.java` | Implements behavior for ducks that cannot fly |
| `SwimWithLegs.java` | Implements swimming behavior for ducks that swim with legs |
| `Floating.java` | Implements floating behavior for ducks that do not swim |
| `Quack.java` | Implements normal quacking behavior |
| `MuteQuack.java` | Implements behavior for ducks that do not quack |
| `Squeak.java` | Implements squeaking behavior for rubber ducks |

###  3️⃣ Ducks (Context Classes)  
Each duck type extends the `Duck` class and is assigned appropriate behaviors dynamically.  

| File Name        | Description |
|-----------------|-------------|
| `Duck.java` | Abstract class that acts as a blueprint for all duck types |
| `MallardDuck.java` | Represents a Mallard duck with specific behaviors |
| `RedHeadDuck.java` | Represents a Red Head duck with specific behaviors |
| `RubberDuck.java` | Represents a Rubber duck that squeaks instead of quacking |
| `DecoyDuck.java` | Represents a Decoy duck that neither quacks nor flies |

###  4️⃣ Main Execution File  
| File Name        | Description |
|-----------------|-------------|
| `Main.java` | Entry point of the application, initializes different duck types and tests their behaviors |

---

##  How to Run the Project?  
###  1. Clone the Repository 
```sh
git clone <your-repository-link>
cd Strategy-Pattern-Duck-Simulation
```
###  2. Compile the Java Files 
```sh
javac src/*.java
```
###  3. Run the Program 
```sh
java src.Main
```

---

## Expected Output
```
-----------
I'm a Mallard Duck
Quack
I believe I can Swim...
I can fly
-----------
-----------
I'm a Rubber Duck
Squeak
I believe I can Float
I can't fly
-----------
-----------
I'm a Red Head Duck
Quack
I believe I can Swim...
I can fly
-----------
I'm a Decoy Duck
I don't quack
I believe I can Float
I can't fly
-----------
```

---

##  Commit Structure 
This repository follows a **structured commit approach**, where each file and function has been committed separately for better readability and version control.  

###  Example Commit Messages  
- `Added abstract Duck class with behaviors for quacking, swimming, and flying`  
- `Implemented performQuack(), performSwim(), and performFly() methods in Duck class`  
- `Implemented CanFly and CantFly classes for flying behaviors`  
- `Added Main class to initialize and test different duck types`  

---

##  UML Diagram
The project follows the Strategy Design Pattern as illustrated below:
![022fig01 png](https://github.com/user-attachments/assets/9073118b-d069-42aa-aff1-762a7ebf0a59)


##  License 
This project is licensed under the **MIT License**. You are free to use, modify, and distribute it under the following conditions:  

**MIT License**  
```
MIT License

Copyright (c) 2025 Sahil Awatramani

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## Repository Link 
 **[GitHub Repository](https://github.com/sahilawatramani/Strategy_Pattern-Duck_Simulation)**  
