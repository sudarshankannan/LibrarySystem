# LibrarySystem

## Table of Contents
- [About](#about)
    - [Authors](#authors)
    - [Introduction](#introduction)
    - [Architecture](#architecture)
 - [Demo](#demo)
 - [Instructions](#instructions)

## About
### Authors
- University Name - SJSU
- Course: Enterprise Software - CMPE172, Fall 2020 w/ Prof Shai Silberman
- Team Members
    - [Sudarshan Kannan](https://github.com/sudarshankannan)
    - Bolang Yu
    - Anudeep Gogineni

### Introduction
Libraries are institutions that have a wide variety of functions to perform in order to run a tight ship. From keeping track of books, acquiring new books, and registering users, librarians have a lot of responsibilities to manage. Thus, a library management system software is needed in order to help librarians and users effectively navigate the library system.

Our project will serve two personas: library patrons and library administrators (librarians,
etc.).
The following use cases will be supported for the library patrons
- Create an account
- Search for books

The following use cases will be supported for the librarians
- Add books to the library
- Search for books


### Architecture
| **Technology Stack**     |                       |
| :----------: | :------------------- |
| UI | HTML |
| Client | Browser |
| Framework + Build Tool  | Spring Boot |
| Middleware + Backend   | Java |
| Application Hosting  | AWS |
| Database        | RDS MySQL |

| **Three Tiers** |               |
| :----------: | :------------------- |
| Frontend | HTML |
| Middleware Logic | Java + Spring Boot|
| Backend  | RDS MySQL |

<details>
    <summary>Show architecture diagrams</summary>
</details>

## Demo
https://www.youtube.com/watch?v=WbP5RxfVQAki

## Screenshots
<details>
    <summary>Show screenshots</summary>
    ![Homepage](https://github.com/sudarshankannan/LibrarySystem/blob/master/src/main/resources/images/Homepage.png)

![Create Account](https://github.com/sudarshankannan/LibrarySystem/blob/master/src/main/resources/images/CreateAccount.png)

![Add Book](https://github.com/sudarshankannan/LibrarySystem/blob/master/src/main/resources/images/AddBook.png)
    
![Search Book](https://github.com/sudarshankannan/LibrarySystem/blob/master/src/main/resources/images/SearchBook.png)
    


</details>

## Instructions
### Local server 
<details open>
- In application.properties, be sure to replace PASSWORD with your password
- In Eclipse, be sure to right click on the "LibrarySystem" folder in your project explorer and click "Run As" -> Maven Build. If needed, be sure to specify in the configuration settings for the "goal" to be "package"
- ^^This is how you BUILD the package.
</details>
    
### Docker Instructions (Run on Docker)
```bash
cd LibrarySystem
./mvnw package
docker build -t lib-container .
docker run --net=host lib-container
//docker run -p 8085:8085 lib-container
docker stop lib-container
```
</details>

After completing the "Run on Docker" instructions, you can view the application by visiting localhost:8085 in your web browser.

https://docs.google.com/document/d/1zuMDMo0v0DpR-o11uhFZiQgS8rDho_hhnsxZJE9czXg/edit

https://docs.google.com/document/d/1X97zP42rUoYN-SSkhBCIOh66pdVAcSLYAeQidbhOOKs/edit#heading=h.wefz944ef7bo

