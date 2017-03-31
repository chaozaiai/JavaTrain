package design_pattern.factory.carfactory;

import common.LogOut;

/**
 * Created by zchao on 2017/3/31.
 */
public class SeniorBrake implements IBrake {

    @Override
    public void brake() {
        LogOut.print("SeniorBrake");
    }
}
