# JPA-tutorial report

### Technical Problems
I encountered two problems while working with this task,
the first being difficulties to open and check on the H2 database file,
the other being that the assignment uses Collections within their diagrams on values that require more than one
value, this gives an error with the tests as they are of value Set.

### The Database
The database in this project is of the type H2, and is found at the top directory of the project, within the DB.my.db file.

I viewed the database using IntelliJ's built in database viewer, after tweaking the config (which gave me a headache).
The script created 7 Tables for the Creditcard test (more including the relationship test)
- Address
- Bank
- Creditcard
- Customer
- PinCode
and some join-tables:
- Customer_Address
- Customer_Creditcard

![Diagram](https://github.com/MikalDr/dat250assignment1/blob/main/DBDiagram.png?raw=true)


### Links
Here is the link to the JPA-tutorial github repo:
https://github.com/MikalDr/dat250-jpa-tutorial/tree/master