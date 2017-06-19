package ru.aparfenov.children;

import ru.aparfenov.model.ChildBLocal;
import ru.aparfenov.model.GrandChildB;

import javax.ejb.Stateless;

/**
 * Created by ArtemParfenov on 16.06.2017.
 */
@Stateless
public class GrandChildBBean implements GrandChildB {
    @Override
    public String getName() {
        return "GrandChildB";
    }
}
