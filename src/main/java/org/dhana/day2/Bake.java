int x = 10;

void doSomething() {
    System.out.println("something");
}

class Dog {

}

static String message = "Hello";

void main() {
    System.out.println("Hello World!!!");
    doSomething();
    System.out.println(x);
    System.out.println(message);
    System.out.println("class name is " + this.getClass().getName());

    var x1 = 10;
}
