package com.zmo.FlashCard;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {




        String url = "jdbc:postgresql://localhost:5432/flashcardDataBase";
        String username = "postgres1";
        String password = "postgres1";

        //TerminologyBank terminologyBank = new TerminologyBank();

        // Add sample terminology
Terminology[] terminologies = {
new Terminology("Polymorphism", "The ability of an object to take on many forms.", "1"),
new Terminology("Inheritance", "The mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class.", "1"),
new Terminology("Casting", "allows us to convert one data type into another", "1"),
new Terminology("widening", "Automatic Conversion, No Data Loss, Implicit Conversion - programmers don't need to perform explicit casting, making the code cleaner and less prone to errors", "1"),
new Terminology("narrowing", "Control and Precision,Memory Efficiency,Specificity", "1"),
new Terminology("truncation", " refers to the process of shortening or cutting off the precision or length of a value", "1"),

                new Terminology("primitive data types","Java has eight primitive data types, which are the building blocks of data manipulation","1"),
new Terminology("Java Virtual Machine (JVM)","It converts Java bytecode into machine language","1"),
new Terminology("Java Runtime Environment (JRE)","software layer that runs on top of a computer's operating system software and provides the class libraries and other resources that a specific Java program needs to run","1"),
new Terminology("Java Development Kit (JDK)","The Java Development Kit is a distribution of Java technology by Oracle Corporation. It implements the Java Language Specification and the Java Virtual Machine Specification and provides the Standard Edition of the Java Application Programming Interface","1"),
new Terminology("bytecode","When you compile a Java program, the Java compiler converts your code into bytecode","1"),

new Terminology("machine code","the elemental language of computers composed of 0s and 1s in long sequences that are executable only by the CPU","1"),

new Terminology("String","an object that represents a number of character values","1"),

new Terminology("Boolean Expression","a Java expression that, when evaluated, returns a Boolean value: true or false","1"),

new Terminology("Ternary Operator","The ternary operator in Java is a conditional operator that allows you to choose between two values based on a condition","1"),

new Terminology("state","Car object that is turned on will behave differently than a Car object that is turned off","1"),

new Terminology("behavior","refers to the actions that an object can perform","1"),

new Terminology("expression","a combination of variables, operators and method invocations that evaluate to a single value","1"),

new Terminology("statement","instructions that tell the programming language what to do","1"),

new Terminology("method","a set of instructions that can be called for execution using the method name","1"),

new Terminology("reusable","code that can be used again in different parts of a program or different programs","1"),

new Terminology("method signature","the combination of the method name and the parameter list","1"),

new Terminology("block","a set of statements enclosed in set braces { }","1"),

new Terminology("Assertion Error","a subclass of the Error class and it is thrown when an assertion fails","1"),

new Terminology("comparison operators","used to compare two values (or variables)","1"),

new Terminology("logical operators","AND (&&): : Returns true if both operands are true.\n" +
                "OR (||): : Returns true if either operand is true.\n" +
                "NOT (!): : Returns true if the operand is false.","1"),

new Terminology("overflow","Overflow is a condition that occurs when a variable is assigned a value\n" +
        " that is greater than the maximum value that the variable can store.","1"),

new Terminology("conditional statement / if-else"," a condition statement that is used in the execution of a computer program in pre-defined rules.","1"),

new Terminology("static initialization","a block that runs before the main( ) method in Java","1"),

new Terminology("array","a data structure that can store a fixed-size sequence of elements of the same data type","1"),

new Terminology("loop","a feature used to execute a particular part of the program repeatedly if a given condition evaluates to be true","1"),

new Terminology("index","an integer, and its value is between [0, length of the Array - 1]","1"),

new Terminology("scope","defines where a certain variable or method is accessible in a program","1"),

new Terminology("implied block","The code within the braces is the implied block. It will be executed if the condition x > 0 is true.","1"),

new Terminology("array.length","represents the array's total potential size","1"),

new Terminology("element","the basic building blocks of the language","1"),

new Terminology("for loop","iterates a given set of statements multiple times","1"),

new Terminology("while loop","a control flow statement that executes code repeatedly based on a given Boolean expression","1"),

new Terminology("do…while loop","used to execute a block of statements continuously until the given condition is true","1"),

new Terminology("break","primarily used to terminate the loop or switch statement in which it is present","1"),

new Terminology("continue","used to end the current iteration in a for loop (or a while loop), and continues to the next iteration","1"),

new Terminology("nested loop","a (inner) loop that appears in the loop body of another (outer) loop","1"),

new Terminology("block scope","a type of scope that is defined by a pair of curly braces ({}) in a program","1"),

new Terminology("Scanner","a class in the Java Utilities Package, and it serves the purpose of creating bi-directional communication between the software and its user","1"),

new Terminology("parse","to read the value of one object to convert it to another type","1"),

new Terminology("System.in / System.out"," the output stream connected to the console","1"),

new Terminology("stream","a pipeline through which data will flow and the functions to operate on the data","1"),

new Terminology("print formatted","As you can see, printf() can be used to format a variety of data types, including strings, numbers, booleans, characters, and dates.","1"),

new Terminology("string split","takes a string and splits it into an array of substrings based on a pattern delimiter","1"),

new Terminology("wrapper class","A wrapper class in Java is a class that contains a field that can store a primitive data type.","1"),

new Terminology("stack (memory)","used for static memory allocation and the execution of a thread","1"),

new Terminology("heap"," the area of memory used to store objects instantiated by applications running on the JVM","1"),

new Terminology("null","a value that shows that the object is referring to nothing","1"),

new Terminology("reference type","hold references to objects and provide a means to access those objects stored somewhere in memory","1"),

new Terminology("object","hold references to objects and provide a means to access those objects stored somewhere in memory","1"),

new Terminology("class","A class is a blueprint from which objects are created. It is a blueprint for an object","1"),

new Terminology("immutable","if its state cannot change after it is constructed","1"),

new Terminology("String.substring()","returns a part of the string from some starting index to an (optional) ending index","1"),

new Terminology("abstraction","the process of hiding certain details and showing only essential information to the user","1"),

new Terminology("NullPointerException","occurs when a variable that is being accessed has not yet been assigned to an object","1"),

new Terminology("reference equality (==) ","when two object references point to the same object","1"),

new Terminology("value equality (.equals())","primarily used to compare the 'value' of two object","1"),

new Terminology("static method","a method that belongs to a class rather than an instance of a class","1"),

new Terminology("memory address","models a reference into a memory location","1"),

new Terminology("pointer","THE ADDRESS OF SOME location in memory","1"),

new Terminology("instantiated","to call the constructor of a class that creates an instance or object of the type of that class","1"),

new Terminology("initialize","the process of assigning a value to the Variable","1"),

new Terminology("concatenation","the process of combining two or more strings to form a new string by subsequently appending the next string to the end of the previous strings","1"),

new Terminology("for each loop","a loop that can only be used on a collection of items","1"),

new Terminology("import ","It declares a Java class to use in the code below the import statement","1"),

new Terminology("package","A set of classes and interfaces grouped together","1"),

new Terminology("boxing","Placing a primitive variable in an object","1"),

new Terminology("unboxing","Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value","1"),

new Terminology("autoboxing","the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes","1"),

new Terminology("ArrayList","a resizable array, which is present in the java. util package","1"),

new Terminology("List","an ordered collection","1"),

new Terminology("Interface","a container that stores the signatures of the methods to be implemented in the code segment","1"),

new Terminology("Collection","an object that represents a group of objects","1"),

new Terminology("implementation class","used to implement an interface","1"),

new Terminology("data structure","a group of data elements through which data are stored and organized in the computer so they can be used more efficiently","1"),

new Terminology("BigDecimal","consists of an arbitrary precision integer unscaled value and a 32-bit integer scale","1"),

new Terminology("double rounding error","that occurs when a value is rounded twice","1"),

new Terminology("namespace","a way that is used for logical grouping of functionalities","1"),

new Terminology("Set","an interface declared in java. util package","1"),

new Terminology("Stack","a generic data structure that represents a LIFO (last in, first out) collection of objects allowing for pushing/popping elements in constant time","1"),

new Terminology("Map","a way to keep track of information in the form of key-value pairs","1"),

new Terminology("Queue","an object that represents a data structure designed to have the element inserted at the end of the queue, and the element removed from the beginning of the queue","1"),

new Terminology("HashMap","stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer)","1"),

new Terminology("TreeMap","an implementation of the Map interface, where its items are stored as key-value pairs and it is sorted either by natural ordering of its keys or through a Comparator","1"),

new Terminology("LinkedHashMap","an extension of the HashMap class and it implements the Map interface","1"),

new Terminology("HashSet","a class that extends AbstractSet and implements the Set interface in Java","1"),

new Terminology("LinkedHashSet","extends HashSet without adding any new methods","1"),

new Terminology("Natural Order","extends HashSet without adding any new methods","1"),

new Terminology("Encapsulation","integrating data (variables) and code (methods) into a single unit","1"),

new Terminology("alphanumeric order","he natural ordering of strings is alphanumeric order","1"),

new Terminology("Getters and Setters","methods used to protect your data and make your code more secure","1"),

new Terminology("loosely coupled","the classes are independent of each other","1"),

new Terminology("void","Used at method declaration and definition to specify that the method does not return any type","1"),

new Terminology("constructor","a block of code that initializes (constructs) the state and value during object creation","1"),

new Terminology("static","it belongs to the class, rather than a specific instance","1"),

new Terminology("public","an access modifier used for classes, attributes, methods and constructors, making them accessible by any other class","1"),

new Terminology("private","an access modifier used for attributes, methods and constructors, making them only accessible within the declared class","1"),

new Terminology("this","refers to the current object in a method or constructor","1"),

new Terminology("derived property","properties whose default value is calculated from an expression that you define","1"),

new Terminology("key/value pair","consists of two related data elements: A key, which is a constant that defines the data set (e.g., gender, color, price), and a value, which is a variable that belongs to the set","1"),

new Terminology("Overloading","having two or more methods (or functions) in a class with the same name and different arguments (or parameters)","1"),
////
new Terminology("superclass","The class from which the subclass is derived","1"),

        new Terminology("subclass", "A class that inherits from another class, also known as a derived class.", "1"),
        new Terminology("upcasting", "Casting an object of a subclass type to a superclass type.", "1"),
        new Terminology("down Casting", "Casting an object of a superclass type to a subclass type.", "1"),
        new Terminology("Overriding", "Providing a new implementation of a method in a subclass that is already defined in its superclass.", "1"),
        new Terminology("super", "A keyword in Java used to refer to the superclass of the current object.", "1"),
        new Terminology("extends", "A keyword in Java used to establish an inheritance relationship between classes.", "1"),
        new Terminology("is-a relationship", "A relationship between classes where one class is a subtype of another class.", "1"),
        new Terminology("Object", "A basic unit of object-oriented programming that represents a real-world entity.", "1"),
        new Terminology("implements", "A keyword in Java used to indicate that a class implements an interface.", "1"),
        new Terminology("has-a relationship", "A relationship between classes where one class contains an instance of another class.", "1"),
        new Terminology("object context", "The state and behavior of an object at a particular point in time during program execution.", "1"),
        new Terminology("abstract class", "A class in Java that cannot be instantiated and may contain abstract methods.", "1"),
        new Terminology("default", "A keyword in Java used to specify a default implementation in an interface.", "1"),
        new Terminology("SDLC (Software Development Lifecycle)", "A process used by software development teams to design, develop, and test software applications.", "1"),
        new Terminology("final", "A keyword in Java used to declare constants, prevent method overriding, and prevent class inheritance.", "1"),
        new Terminology("agile", "An iterative approach to software development that focuses on collaboration, flexibility, and customer feedback.", "1"),
        new Terminology("waterfall", "A traditional linear approach to software development where each phase must be completed before moving to the next phase.", "1"),
        new Terminology("protected", "A keyword in Java used to specify that a member (field or method) is accessible within its own package and by subclasses.", "1"),
        new Terminology("static method", "A method in Java that belongs to the class rather than an instance of the class.", "1"),
        new Terminology("instanceof", "A keyword in Java used to test if an object is an instance of a specific class or interface.", "1"),
        new Terminology("unit testing", "A software testing technique where individual units or components of a software application are tested in isolation.", "1"),
        new Terminology("units", "The smallest testable parts of a software application.", "1"),
        new Terminology("QA (Quality Assurance)", "The process of ensuring that software meets quality standards and requirements before it is released.", "1"),
        new Terminology("QC (Quality Control)", "The process of ensuring that software meets quality standards and requirements after it is released.", "1"),
        new Terminology("regression testing", "A software testing technique used to verify that recent changes to a software application have not adversely affected existing functionality.", "1"),
        new Terminology("exploratory testing", "An ad-hoc software testing technique where testers explore the software application with minimal planning.", "1"),
        new Terminology("stress testing", "A software testing technique used to evaluate a system's stability and reliability under extreme conditions.", "1"),
        new Terminology("abstract method", "A method in Java that is declared without implementation.", "1"),
        new Terminology("transitivity", "The property of a relation that allows for the inference of new relationships based on existing ones.", "1"),
        new Terminology("alpha testing", "A software testing phase where the software application is tested internally by developers or testers.", "1"),
        new Terminology("beta testing", "A software testing phase where the software application is released to a limited group of users for testing.", "1"),
        new Terminology("concrete method", "A method in Java that has a body and provides implementation.", "1"),
        new Terminology("Junit", "A popular open-source unit testing framework for Java.", "1"),
        new Terminology("syntax", "The set of rules that define the combinations of symbols and words that are considered to be correct in a programming language.", "1"),
        new Terminology("tdd (Test Driven Development)", "A software development approach where tests are written before the code and the code is developed incrementally to pass the tests.", "1"),
        new Terminology("abstract vs interface vs superclass", "A comparison of different ways to achieve abstraction and code reuse in Java.", "1"),
        new Terminology("assert", "A keyword in Java used for testing assumptions in code.", "1"),
        new Terminology("@Before", "A JUnit annotation used to specify setup methods that should be run before each test method.", "1"),
        new Terminology("@Test", "A JUnit annotation used to specify test methods.", "1"),
        new Terminology("@After", "A JUnit annotation used to specify teardown methods that should be run after each test method.", "1"),
        new Terminology("delta", "A small positive or negative value used to specify the acceptable difference between expected and actual values in assertions.", "1"),
        new Terminology("framework", "A software development tool or platform that provides a structure or scaffolding for building applications.", "1"),
        new Terminology("AssertEquals", "A method in JUnit used to compare expected and actual values.", "1"),
        new Terminology("annotation", "A form of syntactic metadata in Java that provides data about a program but does not affect the program's execution.", "1"),
        new Terminology("AssertTrue / AssertFalse", "Methods in JUnit used to assert whether a condition is true or false.", "1"),
        new Terminology("Arrange Act Assert", "A pattern used in unit testing to structure test cases into three distinct phases: arrange, act, and assert.", "1"),
        new Terminology("exception", "An event that occurs during the execution of a program and disrupts the normal flow of instructions.", "1"),
        new Terminology("runtime error", "An error that occurs during the execution of a program and cannot be detected until runtime.", "1"),
        new Terminology("compile error", "An error that occurs during the compilation of a program due to syntax or semantic issues.", "1"),
        new Terminology("Error", "A subclass of Throwable that represents serious problems that a reasonable application should not try to catch.", "1"),
        new Terminology("exception class", "A class in Java that represents a particular type of exception.", "1"),
        new Terminology("Checked Exception", "An exception in Java that is checked at compile-time, meaning it must be caught or declared.", "1"),
        new Terminology("try..catch", "A Java construct used to handle exceptions by catching them in a try block and handling them in a catch block.", "1"),
        new Terminology("Exception.getMessage()", "A method in Java used to retrieve the error message associated with an exception.", "1"),
        new Terminology("throws", "A Java keyword used in method declarations to indicate that the method may throw certain types of exceptions.", "1"),
        new Terminology("throw", "A Java keyword used to explicitly throw an exception.", "1"),
        new Terminology("stack trace", "A list of method calls that shows the sequence of nested calls leading to the point where the exception occurred.", "1"),
        new Terminology("thrown", "The past participle of the verb 'throw', used to describe when an exception is raised or generated.", "1"),
        new Terminology("handled", "Refers to when an exception is caught and dealt with in a program.", "1"),
        new Terminology("propagation", "The process of passing an exception up the call stack to be handled by higher-level code.", "1"),
        new Terminology("finally", "A Java keyword used to specify a block of code that will be executed whether an exception is thrown or not.", "1"),
        new Terminology("bury an exception", "To ignore or suppress an exception without properly handling it.", "1"),
        new Terminology("PrintWriter", "A class in Java used to write characters to a file.", "1"),
        new Terminology("Buffered Writer", "A class in Java used to write text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.", "1"),
        new Terminology("Buffer", "A temporary storage area used to store data temporarily while it is being moved from one place to another.", "1"),
        new Terminology("try-with-resource", "A Java language feature introduced in Java 7 that automatically closes resources at the end of the try block.", "1"),
        new Terminology("File Mode", "A set of permissions or attributes that determine how a file can be accessed or manipulated.", "1"),
        new Terminology("file permission", "A set of rules or settings that determine who can access or modify a file and what actions they can perform.", "1"),
        new Terminology("flush", "A method in Java used to write any buffered data to the underlying output stream.", "1"),

            //Terminology for chapter 2
            //
            //
            //

// Terminology for chapter 2
                new Terminology("SELECT", "Retrieves records from a database table", "2"),
                new Terminology("Relational Database", "Organizes data into rows and columns, which collectively form a table", "2"),
                new Terminology("(R)DBMS  (Relational Database Management System)", "A program that stores, manages, and retrieves data from a relational database", "2"),
                new Terminology("FROM", "A reserved word that specifies the tables or queries that contain data for a SELECT clause", "2"),
                new Terminology("AND / OR", "The AND operator displays a record if all conditions are TRUE, while the OR operator displays a record if any conditions are TRUE", "2"),
                new Terminology("Non-relational database  (NoSQL)", "A type of database that does not use the tabular schema of rows and columns found in relational databases", "2"),
                new Terminology("SQL", "Structured Query Language, used for managing and manipulating relational databases", "2"),
                new Terminology("Declarative Language", "A programming language that expresses the desired result without explicitly describing the process", "2"),
                new Terminology("ANSI SQL", "A standard for SQL defined by the American National Standards Institute", "2"),
                new Terminology("LIMIT", "A clause used to limit the number of rows returned in a query result", "2"),
                new Terminology("ORDER BY", "A clause used to sort the result set by one or more columns", "2"),
                new Terminology("Ascending Order (ASC)", "Specifies that the sorting should be done in ascending order", "2"),
                new Terminology("Descending Order (DESC)", "Specifies that the sorting should be done in descending order", "2"),
                new Terminology("WHERE", "A clause used to filter rows based on a specified condition", "2"),
                new Terminology("DDL (Data Definition Language)", "A subset of SQL used to define the structure of the database, such as creating and modifying tables", "2"),
                new Terminology("DML (Data Manipulation Language)", "A subset of SQL used to manipulate data in the database, such as inserting, updating, and deleting records", "2"),
                new Terminology("DCL (Data Control Language)", "A subset of SQL used to control access to the database, such as granting and revoking privileges", "2"),
                new Terminology("BETWEEN", "A SQL operator used to specify a range of values", "2"),
                new Terminology("Cell", "The intersection of a row and a column in a database table, containing a single value", "2"),
                new Terminology("Column", "A vertical arrangement of data elements in a table, representing a single field", "2"),
                new Terminology("Row", "A horizontal arrangement of data elements in a table, representing a single record", "2"),
                new Terminology("DISTINCT", "A keyword used to retrieve unique values from a column in a SELECT query", "2"),
                new Terminology("Entity", "A real-world object or concept represented in a database, typically mapped to a table", "2"),
                new Terminology("LIKE", "A SQL operator used to search for a specified pattern in a column", "2"),
                new Terminology("Clause", "A component of a SQL statement that performs a specific action, such as selecting, filtering, or ordering data", "2"),
                new Terminology("ILIKE", "A case-insensitive version of the LIKE operator in PostgreSQL", "2"),
                new Terminology("AS", "A keyword used to alias a column or table in a SELECT statement", "2"),
                new Terminology("Alias", "An alternative name assigned to a column or table in a SQL query", "2"),
                new Terminology("CHAR", "A fixed-length character data type in SQL, typically used for storing single characters", "2"),
                new Terminology("VARCHAR", "A variable-length character data type in SQL, typically", "2"),
                new Terminology("text", "A data type used to store alphanumeric characters, with variable length.", "2"),
                new Terminology("int", "A data type used to store integer values.", "2"),
                new Terminology("bigint", "A data type used to store large integer values.", "2"),
                new Terminology("decimal", "A data type used to store decimal numbers with fixed precision and scale.", "2"),
                new Terminology("precision", "The number of digits used to represent the fractional part of a decimal number.", "2"),
                new Terminology("scale", "The number of digits to the right of the decimal point in a decimal number.", "2"),
                new Terminology("table", "A collection of related data organized in rows and columns.", "2"),
                new Terminology("database", "A structured set of data held in a computer, especially one that is accessible in various ways.", "2"),
                new Terminology("GROUP BY", "A clause in SQL that groups rows that have the same values into summary rows.", "2"),
                new Terminology("subquery", "A query nested within another query.", "2"),
                new Terminology("aggregate function", "A function that operates on a set of values to return a single scalar value.", "2"),
                new Terminology("||  (in postgreSQL)", "The concatenation operator used to concatenate two or more strings into a single string.", "2"),
                new Terminology("offset", "The number of rows to skip before starting to return rows from a query.", "2"),
                new Terminology("sql data type casting", "The process of converting one data type into another data type.", "2"),
                new Terminology("COUNT()", "An aggregate function in SQL that returns the number of rows in a result set.", "2"),
                new Terminology("SUM()", "An aggregate function in SQL that returns the sum of all values in a column.", "2"),
                new Terminology("AVG()", "An aggregate function in SQL that returns the average value of a numeric column.", "2"),
                new Terminology("MIN()", "An aggregate function in SQL that returns the minimum value in a column.", "2"),
                new Terminology("MAX()", "An aggregate function in SQL that returns the maximum value in a column.", "2"),
                new Terminology("interval", "A data type used to represent a period of time.", "2"),
                new Terminology("INNER Join", "A type of SQL join that returns only the rows where there is a match in both tables.", "2"),
                new Terminology("OUTER Join", "A type of SQL join that returns all rows from both tables, with NULL values where there is no match.", "2"),
                new Terminology("Primary Key", "A unique identifier for a record in a database table.", "2"),
                new Terminology("JOIN", "A clause in SQL used to combine rows from two or more tables based on a related column between them.", "2"),
                new Terminology("Foreign Key", "A column or a set of columns in a table whose values match a Primary Key in another table.", "2"),
                new Terminology("Cardinality", "The number of distinct values in a column or a table.", "2"),
                new Terminology("1-to-1", "A relationship between two tables where each record in the first table corresponds to exactly one record in the second table.", "2"),
                new Terminology("1-to-many", "A relationship between two tables where each record in the first table may correspond to one or more records in the second table.", "2"),
                new Terminology("many-to-many", "A relationship between two tables where each record in one table may correspond to one or more records in the other table, and vice versa.", "2"),
                new Terminology("join table", "A table used to represent a many-to-many relationship between two other tables.", "2"),
                new Terminology("LEFT / RIGHT JOIN", "A type of SQL join that returns all rows from the left/right table and matching rows from the right/left table.", "2"),


        new Terminology("Natural Key", "A key composed of one or more existing data attributes that uniquely identify a record in a database without requiring a separate identifier.", "2"),
        new Terminology("FULL OUTER JOIN", "A type of SQL join that returns all rows from both tables, with NULL values where there is no match.", "2"),
        new Terminology("Surrogate Key", "A unique identifier assigned to each record in a table to ensure that each record can be uniquely identified, typically used in place of a natural key.", "2"),
        new Terminology("Composite Primary Key", "A primary key composed of multiple columns, used when no single column uniquely identifies a record.", "2"),
        new Terminology("UNION", "A SQL operator used to combine the result sets of two or more SELECT statements into a single result set.", "2"),
        new Terminology("INSERT", "A SQL statement used to add new rows of data into a database table.", "2"),
        new Terminology("UPDATE", "A SQL statement used to modify existing rows of data in a database table.", "2"),
        new Terminology("DELETE", "A SQL statement used to remove existing rows of data from a database table.", "2"),
        new Terminology("Transaction", "A sequence of one or more SQL operations treated as a single unit of work.", "2"),
        new Terminology("COMMIT", "A SQL statement that finalizes a transaction, making its changes permanent.", "2"),
        new Terminology("ROLLBACK", "A SQL statement that cancels a transaction, undoing its changes.", "2"),
        new Terminology("The ACID test", "A set of properties that guarantee the reliability of database transactions: Atomicity, Consistency, Isolation, Durability.", "2"),
        new Terminology("CRUD", "An acronym for Create, Read, Update, Delete, representing the four basic operations of persistent storage.", "2"),
        new Terminology("Constraint", "A rule that restricts the values allowed in a database column.", "2"),
        new Terminology("Referential Integrity", "A database concept that ensures relationships between tables remain consistent.", "2"),
        new Terminology("Connection", "A link between a database and an application.", "2"),
        new Terminology("normalization", "The process of organizing data in a database to reduce redundancy and improve data integrity.", "2"),
        new Terminology("schema", "A collection of database objects associated with a particular database user.", "2"),
        new Terminology("1st normal form", "The first step in database normalization, ensuring that each column contains atomic values and there are no repeating groups of columns.", "2"),
        new Terminology("denormalization", "The process of intentionally adding redundancy to a database for performance reasons.", "2"),
        new Terminology("unnormalized", "A state where a database does not follow normalization rules.", "2"),
        new Terminology("sequence", "A database object used to generate unique numeric values.", "2"),
        new Terminology("CREATE TABLE | DATABASE", "A SQL statement used to create a new table or database.", "2"),
        new Terminology("DROP TABLE | DATABASE", "A SQL statement used to delete an existing table or database.", "2"),
        new Terminology("GRANT", "A SQL statement used to give specific privileges to a database user.", "2"),
        new Terminology("REVOKE", "A SQL statement used to take back specific privileges from a database user.", "2"),
        new Terminology("BasicDataSource", "A connection pool implementation provided by Apache Commons DBCP.", "2"),
        new Terminology("connection pool", "A cache of database connections maintained so that the connections can be reused when future requests to the database are required.", "2"),
        new Terminology("SpringJDBC", "A module in the Spring Framework that provides JDBC abstractions and helper classes.", "2"),
        new Terminology("JDBC", "Java Database Connectivity, an API for Java that allows Java programs to interact with databases.", "2"),
        new Terminology("SqlRowSet", "An interface in Spring JDBC that represents a set of database rows.", "2"),
        new Terminology("JdbcTemplate", "A class in Spring JDBC that simplifies the use of JDBC and helps to avoid common errors.", "2"),
        new Terminology("DAO (Data Access Object) Pattern", "A design pattern that separates the data access logic from the business logic.", "2"),


        new Terminology("SQL Injection", "A type of security exploit in which an attacker injects SQL commands into input fields to manipulate the database.", "2"),
        new Terminology("connection string", "A string used to connect to a database, typically containing information such as the database server name, database name, and authentication credentials.", "2"),
        new Terminology("sql random() function", "A function in SQL used to generate random numbers.", "2"),
        new Terminology("jdbcTemplate.queryForRowSet()", "A method in Spring JDBC used to execute a query and return the results as a RowSet.", "2"),
        new Terminology("vendor supplied JDBC driver", "A JDBC driver provided by the vendor of the database software.", "2"),
        new Terminology("library vs framework", "A library is a collection of reusable code that can be called by other programs, while a framework is a pre-built structure that provides a foundation for building applications.", "2"),
        new Terminology("jdbcTemplate.queryForObject()", "A method in Spring JDBC used to execute a query and return a single result object.", "2"),
        new Terminology("BadSqlGrammarException", "An exception in Spring JDBC thrown when an invalid SQL statement is encountered.", "2"),
        new Terminology("DataIntegrityViolationException", "An exception in Spring JDBC thrown when a data integrity violation occurs, such as a duplicate key or foreign key constraint violation.", "2"),
        new Terminology("CannotGetJdbcConnectionException", "An exception in Spring JDBC thrown when a connection to the database cannot be established.", "2"),
        new Terminology("Hashing", "A process of converting input data into a fixed-size string of characters, typically used for password storage.", "2"),
        new Terminology("Encryption", "A process of encoding data in such a way that only authorized parties can access it.", "2"),
        new Terminology("Asymmetric Encryption", "A type of encryption that uses two keys, a public key for encryption and a private key for decryption.", "2"),
        new Terminology("Public Key", "A key in asymmetric encryption that is shared with others for encrypting data.", "2"),
        new Terminology("Private Key", "A key in asymmetric encryption that is kept secret and used for decrypting data encrypted with the corresponding public key.", "2"),
        new Terminology("Symmetric Encryption", "A type of encryption that uses a single key for both encryption and decryption.", "2"),
        new Terminology("TLS (Transport Layer Security)", "A protocol that provides secure communication over a computer network.", "2"),
        new Terminology("man in the middle attack", "An attack where a malicious actor intercepts and possibly alters communication between two parties without their knowledge.", "2"),
        new Terminology("jdbcTemplate.update()", "A method in Spring JDBC used to execute an update, insert, or delete SQL statement.", "2"),
        new Terminology("integration testing", "Testing performed to verify that different parts of a system work together as expected.", "2"),
        new Terminology("mock", "An object used in testing to simulate the behavior of real objects in controlled ways.", "2"),
        new Terminology("shared database", "A database used by multiple applications or users.", "2"),
        new Terminology("local database", "A database installed and running on the same machine as the application.", "2"),
        new Terminology("embedded database", "A database that runs within the same process as the application.", "2"),
        new Terminology("Java Bean", "A reusable software component written in Java.", "2"),
        new Terminology("transaction scope", "The duration of a database transaction, typically starting with the first SQL statement and ending with a COMMIT or ROLLBACK.", "2"),
        new Terminology("autocommit", "A mode in databases where each SQL statement is automatically committed after it is executed.", "2"),
        new Terminology("@Autowired", "An annotation in Spring used to automatically inject dependencies into a Spring bean.", "2"),
        new Terminology("integration test lifecycle", "The series of steps involved in running integration tests, including setup, execution, and teardown.", "2"),
        new Terminology("Single connection datasource", "A datasource implementation that manages a single database connection per thread.", "2"),
        new Terminology("Server", "A computer program or device that provides functionality to other programs or devices, known as clients.", "2"),


        new Terminology("client", "A computer or program that requests services or resources from a server.", "2"),
        new Terminology("request", "A message sent from a client to a server, typically to request a resource or perform an action.", "2"),
        new Terminology("response", "A message sent from a server to a client in response to a request.", "2"),
        new Terminology("stateless", "A characteristic of systems where each request from a client to a server is independent and not reliant on previous requests.", "2"),
        new Terminology("Protocol / Application Protocol", "A set of rules governing the exchange of data between systems or components.", "2"),
        new Terminology("HTTP", "Hypertext Transfer Protocol, a protocol used for transmitting data over the internet.", "2"),
        new Terminology("HTTPS", "Hypertext Transfer Protocol Secure, a secure version of HTTP that encrypts data transmitted over the internet.", "2"),
        new Terminology("Top domain", "The highest level domain in a hierarchical domain naming system, such as .com, .net, or .org.", "2"),
        new Terminology("Domain", "A unique name that identifies a website or server on the internet.", "2"),
        new Terminology("Subdomain", "A subdivision of a domain, typically used to organize and navigate to different sections of a website.", "2"),
        new Terminology("registar", "An organization that manages the reservation of domain names on the internet.", "2"),
        new Terminology("ip address", "A numerical label assigned to each device connected to a computer network that uses the Internet Protocol for communication.", "2"),
        new Terminology("IPv4", "Internet Protocol version 4, the fourth version of the Internet Protocol that uses 32-bit addresses.", "2"),
        new Terminology("IPv6", "Internet Protocol version 6, the most recent version of the Internet Protocol that uses 128-bit addresses.", "2"),
        new Terminology("DNS (Domain Name System)", "A hierarchical and decentralized naming system for computers, services, or other resources connected to the internet.", "2"),
        new Terminology("Port", "A communication endpoint in a computer network, typically associated with a specific process or service.", "2"),
        new Terminology("URL", "Uniform Resource Locator, a reference to a web resource that specifies its location on a computer network and the mechanism for retrieving it.", "2"),
        new Terminology("Query", "A request for information from a database or search engine.", "2"),
        new Terminology("Query String", "A part of a URL that contains data to be passed to a web server as part of a request.", "2"),
        new Terminology("Anchor / Fragment", "A reference within a web page that links to another section of the same page or a different page.", "2"),
        new Terminology("Web Method / HTTP Method / Verb", "A standard way to indicate the desired action to be performed on a resource, such as GET, POST, PUT, DELETE.", "2"),
        new Terminology("Header", "Additional information sent along with a message, typically used to provide metadata or control information.", "2"),
        new Terminology("Request Header", "Headers sent from a client to a server as part of an HTTP request.", "2"),
        new Terminology("Response Header", "Headers sent from a server to a client as part of an HTTP response.", "2"),
        new Terminology("HTTP Status Code", "A three-digit code returned by a server in response to an HTTP request, indicating the outcome of the request.", "2"),

        new Terminology("Content Type", "Specifies the media type of the resource.", "1"),
        new Terminology("Response Body / Message Body / Content Body", "Contains the data or payload of a response or message.", "1"),
        new Terminology("API", "Application Programming Interface - a set of rules and protocols for building and integrating application software.", "1"),
        new Terminology("Web Service / Web API", "A service or interface offered by an application to communicate with other applications over the web.", "1"),
        new Terminology("REST", "Representational State Transfer - an architectural style for designing networked applications.", "1"),
        new Terminology("RESTful Web Service / API", "A web service that follows the principles of REST architecture.", "1"),
        new Terminology("Messaging Format", "Specifies how messages are formatted and transmitted between applications.", "1"),
        new Terminology("JSON", "JavaScript Object Notation - a lightweight data-interchange format.", "1"),
        new Terminology("Spring", "An application framework and inversion of control container for the Java platform.", "1"),
        new Terminology("Spring Boot", "A framework for creating stand-alone, production-grade Spring-based applications.", "1"),
        new Terminology("Web Server", "A software or hardware that serves web content.", "1"),
        new Terminology("Application Server", "A server program that hosts and manages other software applications.", "1"),
        new Terminology("Tomcat", "An open-source implementation of the Java Servlet, JavaServer Pages, Java Expression Language, and WebSocket technologies.", "1"),
        new Terminology("NPM", "Node Package Manager - a package manager for the JavaScript programming language.", "1"),
        new Terminology("GET", "A HTTP method used to request data from a server.", "1"),
        new Terminology("Endpoint / Route", "A URL pattern that specifies the location of a resource in a RESTful API.", "1"),
        new Terminology("Service", "A component that performs specific functions in a software system.", "1"),
        new Terminology("RestTemplate", "A class in Spring that simplifies the interaction with RESTful web services.", "1"),
        new Terminology("Path Parameter", "A parameter in the URL path segment of a RESTful API.", "1"),
        new Terminology("Query String Parameter", "A parameter passed in the URL query string of a request.", "1"),
        new Terminology("Service Class", "A class that contains the business logic of a service in an application.", "1"),
        new Terminology("serialization", "The process of converting an object into a stream of bytes to store or transmit it.", "1"),
        new Terminology("deserialization", "The process of reconstructing an object from its serialized form.", "1"),
        new Terminology("idempotent", "An operation that produces the same result regardless of how many times it is called.", "1"),
        new Terminology("safe", "An operation that does not modify the state of the server.", "1"),
        new Terminology("POST", "A HTTP method used to submit data to be processed by a server.", "1"),


        new Terminology("PUT", "A HTTP method used to update or replace a resource on the server.", "1"),
        new Terminology("DELETE", "A HTTP method used to delete a resource on the server.", "1"),
        new Terminology("ResourceAccessException", "An exception thrown when a REST client fails to access a resource.", "1"),
        new Terminology("RestClientResponseException", "An exception thrown when a REST client receives an error response from the server.", "1"),
        new Terminology("HttpEntity", "Represents an HTTP request or response entity, consisting of headers and body.", "1"),
        new Terminology("Request", "An HTTP request sent by a client to a server.", "1"),
        new Terminology("Response", "An HTTP response sent by a server to a client.", "1"),
        new Terminology("@RestController", "An annotation used to define RESTful controller classes in Spring MVC.", "1"),
        new Terminology("@RequestParam", "An annotation used to bind request parameters to method parameters in Spring MVC.", "1"),
        new Terminology("MVC Pattern", "Model-View-Controller - an architectural pattern for organizing code in web applications.", "1"),
        new Terminology("Controller", "A component responsible for handling user requests and returning appropriate responses in an MVC architecture.", "1"),
        new Terminology("Model", "Represents the data of an application and manages its state.", "1"),
        new Terminology("View", "Represents the presentation layer of an application, responsible for rendering data to the user.", "1"),
        new Terminology("@RequestBody", "An annotation used to bind the body of a HTTP request to a method parameter in Spring MVC.", "1"),
        new Terminology("Request Body", "The data sent as part of the body of a HTTP request.", "1"),
        new Terminology("@RequestMapping", "An annotation used to map HTTP requests to handler methods in Spring MVC.", "1"),
        new Terminology("@PathVariable", "An annotation used to extract values from the URI path in Spring MVC.", "1"),
        new Terminology("Endpoint", "A specific URL that represents a resource or service in a web API.", "1"),
        new Terminology("Enumerator / Enum", "A data type consisting of a set of named values called elements or members.", "1"),
        new Terminology("Dependency Injection", "A design pattern where components are given their dependencies rather than creating or looking for them.", "1"),
        new Terminology("Inversion of Control", "A design principle where control of object creation and lifecycle is inverted from the application to a container or framework.", "1"),
        new Terminology("@Component", "An annotation used to mark a Java class as a Spring component.", "1"),
        new Terminology("@Autowired", "An annotation used for automatic dependency injection in Spring.", "1"),
        new Terminology("Java Bean", "A reusable software component that follows specific conventions for property accessor methods.", "1"),
        new Terminology("@PreAuthorize", "An annotation used to apply authorization rules to methods or classes in Spring Security.", "1"),
        new Terminology("Authorization", "The process of determining whether a user or system has permission to access a resource.", "1"),
        new Terminology("Authentication", "The process of verifying the identity of a user or system.", "1"),
        new Terminology("Entropy", "A measure of the randomness or disorder in a system.", "1"),
        new Terminology("Role Based Authorization", "An authorization approach where access is granted based on the roles assigned to a user.", "1"),
        new Terminology("Permission Based Authorization", "An authorization approach where access is granted based on specific permissions assigned to a user.", "1"),
        new Terminology("Knowledge Factor", "An authentication factor based on something the user knows, such as a password or PIN.", "1"),
        new Terminology("Ownership Factor", "An authentication factor based on something the user possesses, such as a physical token.", "1"),
        new Terminology("Inherence Factor", "An authentication factor based on something inherent to the user, such as biometric data.", "1"),
        new Terminology("Multi-Factor Authentication", "An authentication method that requires two or more authentication factors for access.", "1"),
        new Terminology("@PermitAll", "An annotation used to specify that a method or class should be accessible to all users without authentication.", "1"),
        new Terminology("hasRole()", "A method in Spring Security used to check if the current user has a specific role.", "1"),
        new Terminology("hasAnyRole()", "A method in Spring Security used to check if the current user has any of the specified roles.", "1"),
        new Terminology("Principle of Least Privilege", "A security principle stating that users should only be given the minimum level of access required to perform their tasks.", "1"),
        new Terminology("JSON Web Token (JWT)", "A compact, URL-safe means of representing claims to be transferred between two parties.", "1"),
        new Terminology("Token Signature", "A cryptographic signature used to verify the authenticity and integrity of a JWT.", "1"),
        new Terminology("Principal", "An entity representing the identity of a user or system in an authentication context.", "1"),

//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());
//        terminologyBank.addTerminology(new Terminology());

            // Start study session
//        StudySession studySession = new StudySession(terminologyBank);
//        studySession.runStudySession();
        };
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // Prepare INSERT statement
                String insertQuery = "INSERT INTO Terminology (term, definition, chapter) VALUES (?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(insertQuery);

                // Insert data for each Terminology object
                for (Terminology terminology : terminologies) {
                    statement.setString(1, terminology.getTerm());
                    statement.setString(2, terminology.getDefinition());
                    statement.setString(3, terminology.getChapter());
                    statement.executeUpdate();
                }

                System.out.println("Data inserted successfully.");
            } catch (SQLException e) {
                System.out.println("Failed to insert data into database: " + e.getMessage());
        }
    }
}