package DesignPatterns.Behavior.Stragedy;

import DesignPatterns.Behavior.Stragedy.jumping.HighJumping;
import DesignPatterns.Behavior.Stragedy.jumping.LowJumping;
import DesignPatterns.Behavior.Stragedy.model.Fighter;
import DesignPatterns.Behavior.Stragedy.model.Ryu;
import DesignPatterns.Behavior.Stragedy.punching.StrongPunching;
import DesignPatterns.Behavior.Stragedy.punching.WeakPunching;

/**
 * Strategy pattern defines a family of algorithms.
 * Eg. Jumping and punching are the main actions for the fighter.
 * Those actions should be interchangable. It means that we can modify those actions easily.
 *
 *In that case we can change the behavior without affecting the client.
 */
public class StrategyMain {

    public static void main(String[] args) {
        //imagine we choose fighter from menu
        //Fight starts - fight

        Fighter fighter = new Fighter(new StrongPunching(), new LowJumping());

        //we push bottom punch
        fighter.punch();

        fighter.setJumpingBehavior(new HighJumping());

        //now fighter jumps high
        fighter.jump();
        fighter.punch(); //punching is same as before

        Fighter ryu = new Ryu(new WeakPunching(), new LowJumping());
        System.out.println("Rye fighter behavior");
        ryu.punch();
        ryu.jump();

    }

}
