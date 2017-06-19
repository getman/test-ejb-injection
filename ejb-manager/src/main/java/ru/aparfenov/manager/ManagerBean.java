package ru.aparfenov.manager;

import ru.aparfenov.model.ChildBLocal;
import ru.aparfenov.model.ParentLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by ArtemParfenov on 15.06.2017.
 */
@Stateless
public class ManagerBean implements ManagerLocal {
    /**инжектирование компонента с использованием родительского интерфейса
     * через указание Local интерфейса*/
    @EJB(beanInterface = ru.aparfenov.model.ChildALocal.class)
    ParentLocal annotatedChildBean;

    @EJB
    ChildBLocal childBeanUsingDeploymentDesrciptor;

//    @EJB
//    ChildALocal childAInjectedRef;

    /*@Override
    public String getChildAName() {
        return childAInjectedRef.getName();
    }

    @Override
    public String getChildBName() {
        return childBeanUsingDeploymentDesrciptor.getName();
    }*/

    @Override
    public String getName() {
        return "Manager";
    }

    @Override
    public String getAnnotatedChildName() {
        return annotatedChildBean.getName();
    }

    @Override
    public String getChildNameUsedDeploymentDescriptor() {
        return childBeanUsingDeploymentDesrciptor.getName();
    }


}
