package zulus.lab3.abstractFabric.diplomas;

import zulus.lab3.abstractFabric.Participant;

/**
 * Created by zulus on 23.02.18
 */
public class DiplomaB extends IDiploma {

    @Override
    public String getInfo() {
        return "Diploma, type B";
    }

    public DiplomaB(Participant target) {
        super(target);
    }

    @Override
    public String toString() {
        return String.format("%s, for %s", getInfo(), _target);
    }
}
