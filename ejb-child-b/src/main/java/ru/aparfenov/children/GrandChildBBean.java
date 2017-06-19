package ru.aparfenov.children;

import ru.aparfenov.model.GrandChildB;

import javax.ejb.Stateless;

/**
 * Created by ArtemParfenov on 16.06.2017.
 */
@Stateless//(name = "GrandChildBImpl")
public class GrandChildBBean implements GrandChildB {
    @Override
    public String getName() {
        return "GrandChildB";
    }
}
