# SINGLETON PATTERN

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

For most Java applications, we obviously need to ensure that the Singleton works in the presence of multiple threads. 
But, it looks fairly expensive to synchronize the getInstance() method, so what do we do?
Well, we have a few options...

1. Do nothing if the performance of getInstance() isn’t critical to
   your application
2. Move to an eagerly created instance rather than a lazily
   created one
3. Use “double-checked locking” to reduce the use of synchronization in getInstance()





Q: I’ve always been taught that a class should do one thing and one thing only. For a class to do two things is considered bad OO design. 
Isn’t a Singleton violating this? 

A: You would be referring to the “One Class, One Responsibility” principle,and yes,you are correct, 
the Singleton is not only responsible for managing its one instance (and providing global access), it is also responsible for whatever its main role is in your application. 
So, certainly it can be argued it is taking on two responsibilities. Nevertheless,it isn’t hard to see that there is utility in a class managing its own instance;
it certainly makes the overall design simpler. In addition, many developers are familiar with the Singleton pattern as it is in wide use. 
That said, some developers do feel the need to abstract out the Singleton functionality.
