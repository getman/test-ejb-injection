package ru.aparfenov.manager;

import javax.ejb.Local;

/**
 * Created by ArtemParfenov on 15.06.2017.
 */
@Local
public interface ManagerLocal {
//    public String getChildAName();
//    public String getChildBName();
    public String getName();
    public String getAnnotatedChildName();
    public String getChildNameUsedDeploymentDescriptor();
}
