package DesignPatterns.Behavior.Stragedy.model;

//superclass
//can be abstract or interface as well. Depends on your approach and design.

import DesignPatterns.Behavior.Stragedy.jumping.JumpingBehavior;
import DesignPatterns.Behavior.Stragedy.punching.PunchingBehavior;

public class Fighter {

    //Fighter can jump or punch
    PunchingBehavior punchingBehavior;
    JumpingBehavior jumpingBehavior;

    public Fighter(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        this.punchingBehavior = punchingBehavior;
        this.jumpingBehavior = jumpingBehavior;
    }

    public Fighter(PunchingBehavior punchingBehavior) {
        this.punchingBehavior = punchingBehavior;
    }

    public void punch(){
        punchingBehavior.punch(); //If implementation StrongPunch - it will hit hard
    }

    public void jump(){
        jumpingBehavior.jump();
    }

    public PunchingBehavior getPunchingBehavior() {
        return punchingBehavior;
    }

    public void setPunchingBehavior(PunchingBehavior punchingBehavior) {
        this.punchingBehavior = punchingBehavior;
    }

    public JumpingBehavior getJumpingBehavior() {
        return jumpingBehavior;
    }

    public void setJumpingBehavior(JumpingBehavior jumpingBehavior) {
        this.jumpingBehavior = jumpingBehavior;
    }
}
