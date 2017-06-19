package ru.aparfenov.children;

import ru.aparfenov.model.ChildALocal;

import javax.ejb.Stateless;

/**
 * Created by ArtemParfenov on 16.06.2017.
 */
@Stateless
public class ChildABean implements ChildALocal {
    @Override
    public String getName() {
        return "ChildA";
    }
}
