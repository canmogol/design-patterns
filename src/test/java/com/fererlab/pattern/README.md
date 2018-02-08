# Real Life Examples

## Creational Design Patterns


### Singleton 

The Singleton pattern ensures that a class has only one instance and 
provides a global point of access to that instance. It is named after the 
singleton set, which is defined to be a set containing one element. 

The office of the President of the United States is a Singleton. The 
United States Constitution specifies the means by which a president is 
elected, limits the term of office, and defines the order of succession. As 
a result, there can be at most one active president at any given time. 
Regardless of the personal identity of the active president, the title, "The 
President of the United States" is a global point of access that identifies 
the person in the office. 


### Builder 

The Builder pattern separates the construction of a complex object 
from its representation so that the same construction process can create 
different representations. 

This pattern is used by fast food restaurants to construct children's 
meals. Children's meals typically consist of a main item, a side item, a 
drink, and a toy (e.g., a hamburger, fries, Coke, and toy dinosaur). Note 
that there can be variation in the content of the children's meal, but the 
construction process is the same. 
Whether a customer orders a hamburger, cheeseburger, or chicken, 
the process is the same. The employee at the counter directs the crew to 
assemble a main item, side item, and toy. These items are then placed in 
a bag. The drink is placed in a cup and remains outside of the bag. This 
same process is used at competing restaurants. 


### Prototype  

The Prototype pattern specifies the kind of objects to create using a 
prototypical instance. Prototypes of new products are often built prior to 
full production, but in this example, the prototype is passive and does 
not participate in copying itself. 

The mitotic division of a cell - resulting in two identical cells - is an 
example of a prototype that plays an active role in copying itself and 
thus, demonstrates the Prototype pattern. When a cell splits, two cells of 
identical genotvpe result. In other words, the cell clones itself. 


### Factory Method 

The Factory Method defines an interface for creating objects, but lets 
subclasses decide which classes to instantiate. 

Injection molding presses demonstrate this pattern. Manufacturers of 
plastic toys process plastic molding powder, and inject the plastic into 
molds of the desired shapes. The class of toy (car, action figure, etc.) is 
determined by the mold. 


### Abstract Factory 

The purpose of the Abstract Factory is to provide an interface for 
creating families of related objects, without specifying concrete classes. 

This pattern is found in the sheet metal stamping equipment used in 
the manufacture of Japanese automobiles. The stamping equipment is 
an Abstract Factory which creates auto body parts. The same machinery 
is used to stamp right hand doors, left hand doors, right front fenders, 
left front fenders, hoods, etc. for different models of cars. Through the 
use of rollers to change the stamping dies, the concrete classes produced 
by the machinery can be changed within three minutes. 


## Structural Design Patterns


### Adapter 

The Adapter pattern allows otherwise incompatible classes to work 
together by converting the interface of one class into an interface 
expected by the clients. 

Socket wrenches provide an example of the Adapter. A socket 
attaches to a ratchet, provided that the size of the drive is the same. 
Typical drive sizes in the United States are 1/2" and 1/4". 
Obviously, a 1/2" drive ratchet will not fit into a 1/4" drive socket 
unless an adapter is used. A 1/2" to 1/4" adapter has a 1/2" female 
connection to fit on the 1/2" drive ratchet, and a 1/4" male connection to 
fit in the 1/4" drive socket. 


### Bridge 

The Bridge pattern decouples an abstraction from its 
implementation, so that the two can vary independently. 

A household switch controlling lights, ceiling fans, etc. is an 
example of the Bridge. The purpose of the switch is to turn a device on 
or off. The actual switch can be implemented as a pull chain, simple 
two position switch, or a variety of dimmer switches. 


### Composite 

The Composite composes objects into tree structures and lets clients 
treat individual objects and compositions uniformly. 

Although the example is abstract, arithmetic expressions are 
Composites. An arithmetic expression consists of an operand, an 
operator (+ - * /), and another operand. The operand can be a number, 
or another arithmetic expresssion. Thus, 2 + 3 and (2 + 3) + (4 * 6) are 
both valid expressions. 


### Decorator 

The Decorator attaches additional responsibilities to an object 
dynamically. 

The ornaments that are added to pine or fir trees are examples of 
Decorators. Lights, garland, candy canes, glass ornaments, etc., can be 
added to a tree to give it a festive look. The ornaments do not change 
the tree itself which is recognizable as a Christmas tree regardless of 
particular ornaments used. As an example of additional functionality, 
the addition of lights allows one to "light up" a Christmas tree.
    

### Facade 

The Facade defines a unified, higher level interface to a subsystem 
that makes it easier to use. 

Consumers encounter a Facade when ordering from a catalog. The 
consumer calls one number and speaks with a customer service 
representative. The customer service representative acts as a Facade, 
providing an interface to the order fulfillment department, the billing 
department, and the shipping department.  


### Flyweight 

The Flyweight uses sharing to support large numbers of objects 
efficiently.

The public switched telephone network is an example of a 
Flyweight. There are several resources such as dial tone generators, 
ringing generators, and digit receivers that must be shared between all 
subscribers. A subscriber is unaware of how many resources are in the 
pool when he or she lifts the handset to make a call. All that matters to 
subscribers is that a dial tone is provided, digits are received, and the 
call is completed.  
    
    
### Proxy 

The Proxy provides a surrogate or place holder to provide access to 
an object. 

A check or bank draft is a proxy for funds in an account. A check 
can be used in place of cash for making purchases and ultimately 
controls access to cash in the issuer's account.


## Behavioral Design Patterns


### Chain of Responsibility 

The Chain of Responsibility pattern avoids coupling the sender of a 
request to the receiver by giving more than one object a chance to 
handle the request. ATM use the Chain of Responsibility in money 
giving mechanism. 


### Command 

The Command pattern allows requests to be encapsulated as objects, 
thereby allowing clients to be parameterized with different requests. 

The "check" at a diner is an example of a Command pattern. The 
waiter or waitress takes an order or command from a customer and 
encapsulates that order by writing it on the check. The order is then 
queued for a short order cook. Note that the pad of "checks" used by 
each waiter is not dependent on the menu, and therefore they can 
support commands to cook many different items.  


### Interpreter 

The Intepreter pattern defines a grammatical representation for a 
language and an interpreter to interpret the grammar. 

Musicians are examples of Interpreters. The pitch of a sound and its 
duration can be represented in musical notation on a staff. This notation 
provides the language of music. Musicians playing the music from the 
score are able to reproduce the original pitch and duration of each sound 
represented.  


### Iterator 

The Iterator provides ways to access elements of an aggregate object 
sequentially without exposing the underlying structure of the object. 

Files are aggregate objects. In office settings where access to files is 
made through administrative or secretarial staff, the Iterator pattern is 
demonstrated with the secretary acting as the Iterator. Several television 
comedy skits have been developed around the premise of an executive 
trying to understand the secretary's filing system. To the executive, the 
filing system is confusing and illogical, but the secretary is able to 
access files quickly and efficiently.  

On early television sets, a dial was used to change channels. When 
channel surfing, the viewer was required to move the dial through each 
channel position, regardless of whether or not that channel had 
reception. On modern television sets, a next and previous button are 
used. When the viewer selects the "next" button, the next tuned channel 
will be displayed. 

Consider watching television in a hotel room in a strange city. When 
surfing through channels, the channel number is not important, but the 
programming is. If the programming on one channel is not of interest, 
the viewer can request the next channel, without knowing its number. 


### Mediator 

The Mediator defines an object that controls how a set of objects 
interact. Loose coupling between colleague objects is achieved by 
having colleagues communicate with the Mediator, rather than with 
each other. 

The control tower at a controlled airport demonstrates this pattern 
very well. The pilots of the planes approaching or departing the terminal 
area communicate with the tower rather than explicitly communicating 
with one another. The constraints on who can take off or land are 
enforced by the tower. It is important to note that the tower does not 
control the whole flight. It exists only to enforce constraints in the 
terminal area. 


### Memento 

The Memento captures and externalizes an object's internal state so 
that the object can later be restored to that state. 

This pattern is common among do-it-yourself mechanics repairing 
drum brakes on their cars. The drums are removed from both sides, 
exposing both the right and left brakes. Only one side is disassembled 
and the other serves as a Memento of how the brake parts fit together. 
Only after the job has been completed on one side is the other side 
disassembled. When the second side is disassembled, the first side acts 
as the Memento.  


### Object Pool 

Do you like bowling? If you do, you probably know that you should 
change your shoes when you getting the bowling club. Shoe shelf is 
wonderful example of Object Pool. Once you want to play, you'll get 
your pair (aquireReusable) from it. After the game, you'll return shoes 
back to the shelf (releaseReusable). 


### Observer 

The Observer defines a one-to-many relationship so that when one 
object changes state, the others are notified and updated automatically. 

Some auctions demonstrate this pattern. Each bidder possesses a 
numbered paddle that is used to indicate a bid. The auctioneer starts the 
bidding, and "observes" when a paddle is raised to accept the bid. The 
acceptance of the bid changes the bid price which is broadcast to all of 
the bidders in the form of a new bid.  


### State 

The State pattern allows an object to change its behavior when its 
internal state changes. 

This pattern can be observed in a vending machine. Vending 
machines have states based on the inventory, amount of currency 


### Strategy 

A Strategy defines a set of algorithms that can be used 
interchangeably. 

Modes of transportation to an airport is an example of a Strategy. 
Several options exist such as driving one's own car, taking a taxi, an 
airport shuttle, a city bus, or a limousine service. For some airports, 
subways and helicopters are also available as a mode of transportation 
to the airport. Any of these modes of transportation will get a traveler to 
the airport, and they can be used interchangeably. The traveler must 
chose the Strategy based on tradeoffs between cost, convenience, and 
time. 


### Template Method 

The Template Method defines a skeleton of an algorithm in an 
operation, and defers some steps to subclasses. 

Home builders use the Template Method when developing a new 
subdivision. A typical subdivision consists of a limited number of floor 
plans with different variations available for each. Variation is 
introduced in the later stages of construction to produce a wider variety 
of models.  


### Visitor 

The Visitor pattern represents an operation to be performed on the 
elements of an object structure without changing the classes on which it 
operates. 

This pattern can be observed in the operation of a taxi company. 
When a person calls a taxi company (accepting a visitor), the company 
dispatches a cab to the customer. Upon entering the taxi the customer, 
or Visitor, is no longer in control of his or her own transportation, the 
taxi (driver) is.  


