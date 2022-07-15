/**
 
 * 01. Create an abstract class with abstract and non-abstract methods.
 * 02. Create a subclass for an abstract class. Create an object in the child class for the
 * abstract class and access the non-abstract methods
 * 03. Create an instance for the child class in child class and call abstract methods
 * 04. Create an instance for the child class in child class and call non-abstract methods
 */

abstract class Animal {
        abstract void bark_sound();

        //non-abstract method
        void eat() {
            System.out.println("Animals are eating");
        }
    }
    
    //subclass for an abstract class
  class Lion extends Animal {
        //provide implementation of abstract method
        void bark_sound() {
            System.out.println("Lion roars like king");
        }
    
        public static void main(String[] args) {
            Animal Al = new Lion();
            //accessing the non-abstract methods
            Al.eat();
    
            //instance for the child class
            Lion Li = new Lion();
            //calling abstract methods
            Li.bark_sound();
            //calling non-abstract methods
            Li.eat();
        }   
        
}
