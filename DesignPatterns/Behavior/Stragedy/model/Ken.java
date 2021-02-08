package DesignPatterns.Behavior.Stragedy.model;

import DesignPatterns.Behavior.Stragedy.jumping.JumpingBehavior;
import DesignPatterns.Behavior.Stragedy.punching.PunchingBehavior;

public class Ken extends Fighter {

    public Ken(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        //can have extra logic
        super(punchingBehavior, jumpingBehavior);

    }
}
