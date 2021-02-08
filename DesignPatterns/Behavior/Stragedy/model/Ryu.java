package DesignPatterns.Behavior.Stragedy.model;

import DesignPatterns.Behavior.Stragedy.jumping.JumpingBehavior;
import DesignPatterns.Behavior.Stragedy.punching.PunchingBehavior;

public class Ryu extends Fighter {

    public Ryu(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        super(punchingBehavior, jumpingBehavior);

    }
}
