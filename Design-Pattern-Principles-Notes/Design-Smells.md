# Design Smells

## Rigidity
* the tendency of software to be difficult to change
* a single change causes a cascade of subsequent changes in dependent modules
* the more modules that must be changed, the more rigid the system

## Fragility
* the tendency of the software to break in many places when a single change is made
* the problems occur to many locations which are not related to the place the change has been made
* as the fragility of a module increases, the likelihood that a change will introduce unexpected problems rise


## Immobility
* contains parts that can be useful to other systems, but the risk associated with the separation of them is quite higher.

## Viscosity
* a system has a high viscosity if a design preserving task is quite tedious and more difficult to do than bypassing that task and implement the logic using a hack.

## Needless copy and pasting
* Copy and pasting throughout the system
* this happens when necessary abstractions have not been made

## Opacity 
* the tendency of a module to be difficult to understand
* when the code is not written a clear and cohesive manner, it is said to be opaque.
* code that evolves over time tends to be difficult to manage and understand over time 

## Needless complexity
* this happens as a result of over-designing; attempt to keep account of all possible changes in the future.
* In an effort to avoid all possible smells, developers introduce small levels of abstraction and preparations for potential changes in the future. There is no need to keep account of all possible changes which might occur in the future. By doing so, the structure becomes unnecessarily rigid. 


## Common Smells in Java coding
* several classes that duplicate 80-90% of each other. We can use interface or inheritance to remove duplication. 
* too many public classes, members, and methods; this indicates the violation of encapsulation.
* classes that are too large; this usually occurs when you try to combine every concept into one single class.