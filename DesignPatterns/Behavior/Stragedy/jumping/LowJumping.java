package DesignPatterns.Behavior.Stragedy.jumping;

public class LowJumping implements JumpingBehavior{

    @Override
    public void jump() {
        System.out.println("Jumping low!");
    }

}
