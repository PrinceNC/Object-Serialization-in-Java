# Object-Serialization-in-Java
An example of Object Serialization in Java.

This project demonstrates the basics of Object Serialization in Java. 

## Why Serialize Objects
If a single object needs to be stored to a file or sent over a network, it can be serialized and stored without  
storing each attribute of the object individually.

In Java, arrays are considered as objects. Therefore, instead of storing each element from  
an array to a file individually with multiple write operations, the entire array can be serialized  
and stored in a file with just one write operation to the file.

##### Note
All objects and its attributes must implement the "serializable" Java interface to be serializable.
