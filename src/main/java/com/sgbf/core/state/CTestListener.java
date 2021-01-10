package com.sgbf.core.state;

import com.sgbf.gladiators.CGladiatorState;

public class CTestListener implements IStateListener {
    public CTestListener() {
        CStateManager.instance().registerListener(this);
    }

    @Override
    public void onStateChange(CState newState, CState oldState) {
        if (CGladiatorState.class.isInstance(newState)){
            CGladiatorState gladiatorState = (CGladiatorState) newState;
            if (gladiatorState.getName().equals("Blank")){
                CStateManager.instance().setState(
                        new CGladiatorState("Nothing",0)
                );
            }
        }
    }
}
