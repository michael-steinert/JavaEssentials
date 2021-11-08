## JavaEssentials

### Primitive Type vs. Reference Type
![PrimitiveTypeVsReferenceType](https://user-images.githubusercontent.com/29623199/108357462-bef75480-71ed-11eb-9b1f-4a171f36216c.png)

* There are two different data regardless of the programming language:
1) Reference types
1) Value types

* If you access a data type from a program, the first access leads into the stack.
  * If the data type is one with fixed size, its value is directly on the stack - you read it and you are done (fast access).
  * (All values, which have fixed sizes and can be stored directly on the stack are Value Types)
  *However, if the data type is one with a variable size, its pointer is on the stack, which points to its value in the heap and can thus be read out (more complex and takes longer).
  * (All values that can have variable sizes and have their pointer on the stack as well as their data on the heap are called reference types).
 
* For the Heap a Garbage Collection is necessary, which works against the fragmentation of the Heap, since on the Heap the data to be stored can be stored at random places, arise unused place, since these are too small for storing and contribute to fill the Heap
* The stack is subject to the requirements of the operating system, which allows the memory (RAM) of the stack to be filled only linearly

* Parameters of a function are stored on the stack, therefore from a technical point of view they can only be called with value types - because only value types can be stored in the stack - a pointer is also a data type with a fixed size (value type)
* The called parameters are stored in the stack - a copy of them is created, so the called function has a copy of the caller's parameters - so the stack can change its copy without affecting the caller, because the stack works on its independent copy (Call-by-Value)
* Call-by-Value copies datatypes with fixed size (this also includes pointers - Call-by-Rerference) - so there is a copy of the pointers, but they still point to the same place in the heap - so changes to data in the heap are always referenced correctly, but this behavior is not desirable, because this could always change the same object in different function calls

* A string is an immutable datatype - a new datatype is always created when updating strings - interning allows the same string to be used over and over again instead of creating new strings (saving memory but making changes more difficult - as potentially multiple locations in the stack need to change at the same time)
