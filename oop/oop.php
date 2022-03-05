<?php
// namespace use in first file 
// if have many funtion have same name but in same file 
// namespace home
// $n= new home\person();

// make class 
class car{
// public/private/protected is access modifiers
// propertys
public $color ="red";
private $high ="800cm";
protected $w ="66pw";

// methods
// can dont use access modifier in function coz be deault a public
// The following method names are considered magical: 
//__construct(), __destruct(), __call(), __callStatic(),
//__get(), __set(), __isset(), __unset(), __sleep(),
//__wakeup(), __serialize(), __unserialize(), __toString(),
//__invoke(), __set_state(), __clone(), and __debugInfo().
//__construct() the most useing in classes 

public function color(){echo $this->color;}
// $this-> mention for porperty or method include the class 
private  function high(){echo"800cm";}
protected   function w(){echo"66pw";}

// encapsulation 
public function sethigh($h){
$this->$high=$h;
// change property high and make some process 
}
public function gethigh(){
return $this->$high;
// return naw value for high property 
}
};

// new object
$bmw=new car;

// print object
print_r($bmw);
var_dump($bmw);

// call method 
$bmw->color();

// call properte 
$bmw->color;


class cars extends car{
// this is inheritance 
}


// abstraction 
abstract class car3 {
abstract function move();
// dont write function body coz this is definition
};

// $tyota_obj= new car3; 
// can not instantiate abstract class car3 to object

class toyta extends car3{
// this is inheritance 
// must write definitions coz the extend is from abstract class  
public function move(){
echo "abstract";}
};

// poiymorphism
interface car_poly {
public function color();
// dont write function body coz this is definition
};
// $tyota_obj= new car_poly; 
// can not instantiate poiymorphism class car_poly to object
interface car_poly2 {
public function color2();
// dont write function body coz this is definition
};
class car_inherit_from_poly implements car_poly,car_poly2{
// support multi inheritance
public function color(){
echo "poiymorphism";
}
public function color2(){
echo "poiymorphism";
}
};
//overlod not support in php but it meaning
class poly_overlod{
public function __call($n, $a){
if($n == 'name'){
if(count($a)==1){
return $this->name1($a[0]);
}elseif(count($a) == 2){
return $this->name2($a[0],$a[1]);}
}}
public static function name1($n){}
public static function name2($n,$n2){}
};
$bmw=new poly_overlod();
$bmw->name(0);
$bmw->name(0,1);
//duplicate method but never once have a different in argument
//override
class car_override{
function move($n){
echo $n;
}
final function move2($n){
echo $n;
}
// when use final key word cant do override 
};
class bmw_override extends car{
function move($n){
echo 10 + $n;
}}; 

// static access modifier
class car_sta {

public static $name;
const con = "ll" ;
// const data and use self to
public static function move(){
echo 'move'.self::$name.self::con;
// self::$name; == $this->$name;
// but can not use $this->$name; 
}
};
// call property without object
car_sta::$name;
// call method without object
car_sta::move();

class st {
public static $pp="dd";
};
echo st::$pp; 
st::$pp="<br>"."hhgh";
echo st::$pp; 
// trait is a solution to multi inheritance and not instanted object
trait pone{
public function ponef(){
echo 'ponef';
}};
trait ptwo{
public function ptwof(){
echo 'ptwof';
}};

class person{
use pone, ptwo;
// multi inheritance class
}

$n= new person();
$n->ponef ();
$n->ptwof();

trait Hello {
    public function sayHello() {
        echo 'Hello ';
    }
}

trait World {
    public function sayWorld() {
        echo 'World';
    }
}

class MyHelloWorld {
    use Hello, World;
    public function sayExclamationMark() {
        echo '!';
    }
}


class Wke {

    public $type;
    public $errno;
    public $msg;
    public $page;

    public $template = $this;

    public function notify(){
        return $this;
    }

    public function errorno($error){
        $this->errno = $error;
        return $this; // returning same object so you can call the another function in sequence by just ->
    }
    public function type($type){
        $this->type = $type;
        return $this;
    }
    public function msg($msg){
        $this->msg = $msg;
        return $this;
    }
    public function page($page){
        $this->page = $page;
        return $this;
    }
}
$Wke= new Wke();

$Wke->errorno()->msg()

//////////////////////
// oop mysql
// $con = new mysqli("localhost","root","","api");
// $q=$con->query("SELECT * FROM users");
// $all=[];
// while($d=$q->fetch_assoc()){
// $all[] = $d;};
// echo '<pre>';
// print_r($all);



