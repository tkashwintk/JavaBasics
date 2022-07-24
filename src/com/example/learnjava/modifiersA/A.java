package com.example.learnjava.modifiersA;

class Car {

    // Classes in same package - Access Fine!
    Engine engine;

    // Classes in another package - Access not Fine!
    // Wheel wheel;  // Compiler Error
}

class Engine {

}


