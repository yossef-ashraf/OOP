<?php
// Single responsibility principle
// Open/closed principle
// Liskov substitution principle
// Interface segregation principle
// Dependency inversion principle 

  
// single resposbility
// this is rong method
// class food
// {
//   public function Pizza()
//   {
//        // The expensive process
//   }

//   public function chocolate()
//   {
//        // The expensive process
//   }
  
// }

class Pizza
{
  public function Pizza()
  {
       // The expensive process
   }
}

class chocolate
{
  public function chocolate()
  {
       // The expensive process
   }
}





// opc
// Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification
// abstract - interface 


interface Deliverable
{
    public function deliver();
}

class Car implements Deliverable
{
   public function deliver()
    {
        $prepare = 'place pizza in car';
        $travel = ' and drive down the road';
        $customer = ' then give pizza to happy customer';
        return $prepare . $travel . $customer;
}
}
  
class Boat implements Deliverable
{
    public function deliver()
    {
        $prepare = 'Place pizza in Boat';
        $travel  =' and sail across the bay';
        $customer= ' then give pizza to happy customer on the island';
     
        return $prepare. $travel . $customer;
    }
}
class PizzaDelivery
{
   protected $transporter;
   public function __construct(Deliverable $transporter)
  {
        $this->transporter = $transporter;
  }
   public function deliver()
  {
        return $this->transporter->deliver();
   }
}

$pizza = new PizzaDelivery(new Boat);
echo $pizza->deliver()."<br>";
// place pizza in Boat and sail across the bay then give pizza to happy customer on the island

$pizza = new PizzaDelivery( new Car);
echo $pizza->deliver()."<br>";
// place pizza in car and drive down the road then give pizza to happy customer


// Liskov Substitution Principle

// In a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S without altering any of the desirable properties of the program (correctness, task performed, etc.)

interface Animal {}
class Dog implements Animal {}
class GermanShepherd extends Dog {}
// A class implementing an interface is considered to be a subclass of said interface.
is subclass of(Dog::class, Animal::class);
// bool(true)
// 1/ A class extending another class is a subclass of said parent class.
is subclass_of( GermanShepherd::class, Dog::class); // bool(true)
// By extension, the child class is also considered to be a subclass of the interfaces
// implemented by its parent class.
is_subclass_of(GermanShepherd::class, Animal::class); // bool(true)


class Parent {
    public function process(int|float $value);{}
}
class Child extends Parent {
    public function process(int|float|string $value){};
  
    }


// Interface Segregation


interface Worker {
  public function takeBreak(){}
 public function getPaid(){}
}
interface Coder {
  public function code(){}
interface ClientFacer {
  public function callToClient(){}
  public function attendMeet ings(){}
}

class Developer implements Worker, Coder {}
class Manager tmplements Worker, ClientFacer {}


// Dependency Inversion Principle
// (A) High level classes should not depend upon low level classes, both should depend on abstractions
// (B) Abstractions should not depend on details, details should depend on abstractions

interface DeviceInterface {
   public function turnOn();
   public function turn0ff();}
class Lamp implements DeviceInterface {
   // /TRUE = on, FALSE = Off
    protected bool $currentState = FALSE;
   public function turnOn() {
        $this->currentState = TRUE};
   public function turnoff() {
        $this->currentState= FALSE;{}
   public function getState() {
        return $this->currentState;}
   public function getstatestring(): string {
       if ($this->currentState) {
            return 'On';
         } else {
            return 'Off';}
   }
   }



interface ButtonInterface {
    public function On();
    public function Off();}
class Button implements ButtonInterface {
   protected DeviceInterface $di;
  public function construct(DeviceInterface $di) {
        $this->di = $di;}
  public function On() {
        $this->di->turnOn( );}
    public function Off() {
        $this->di->turn0ff();}
  }
