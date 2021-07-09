# OopShowcase
Showcase of OOP concepts with basic Java command line application

**Description:**

The purpose of this application is to help a company called Java Burgers manage the process of selling their hamburgers. And in order to match Java's menu, we created three(3) classes, Hamburger, DeluxeBurger, and HealthyBurger. 

For the base Hamburger class, there are four variables to represent the four basic ingredients of the hamburger, name, meat, price, and breadRollType. The price variable is of type double, while the other three are of type String. A constructor is created to accept these four values as parameters when creating a new hamburger.

There are also separate variables for four(4) possible additions to the hamburger. Those are declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price. The name variables are of type String and the price variables are of type double.

Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to four additions to the hamburger and one(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price. A name and price must be accepted as parameters in the first four methods so that the price of the hamburger is adjusted accordingly. These methods are named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger. The first four methods do not return values, but the last method does return the total price of the hamburger of type double, which includes the base price of the hamburger plus any additional items. 

For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters. Instead, the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10. In this class, the four(4) methods defined in the Hamburger class for including additional toppings are overridden so that a message is printed stating that no additional items can be added to a deluxe burger.

And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price. The names are type String and the prices are type double. The constructor for this class accepts two(2) parameters for meat and price. Those are set in the constructor along with an appropriate name for the type of burger. 

Two methods, addHealthyAddition1 and addHealthyAddition2 are created that each accept a name and price for the addition, allowing for up to two(2) addons to the basic healthy burger. And finally the itemizeHamburger method created in the Hamburger class is overridden to generate a message appropriate to the type of burger along with any addons. The method also returns the total price of the healthy burger of type double.
