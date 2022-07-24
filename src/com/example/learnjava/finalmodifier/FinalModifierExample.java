package com.example.learnjava.finalmodifier;

public class FinalModifierExample {
    public static void main(String[] args) {

    }
}

// DEMO 1 - Final Classes
final class Tata {

}

//class TCS extends Tata {      // Compilation Error
//
//}

// DEMO 2 - Final Methods
class BiCycle {

    public void applyBrake() {

    }

    public final void startPedalling() {

    }
}

class MotorCycle extends BiCycle{

    public void applyBrake() {

    }

//    public void startPedalling() {      // Compilation Error !
//
//    }
}

// DEMO 3 - Final Variables

class CalculateIncomeTax {
    private final long taxPercentage = 5L;
    private long salary;

    public long calculate() {
//        taxPercentage = 0L;    // Compiler Error !
        return salary*taxPercentage;
    }
}