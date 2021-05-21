package client.core;

import client.view.LoginViewModel;
import client.view.View;
import client.view.manager_view.EmployeeViewModel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ViewModelFactory
{
    private Map<View, Object> viewModels;
    private static ViewModelFactory viewModelFactory;
    private static final Lock lock = new ReentrantLock();
    private ModelFactory modelFactory;

    private ViewModelFactory()
    {
        this.modelFactory = ModelFactory.getModelFactory();
        viewModels = new HashMap<>();
        createLoginViewModels();
        createManagerViewModels();
        createDoctorViewModels();
        createNurseViewModels();
    }

    public static ViewModelFactory getViewModelFactory()
    {
        if (viewModelFactory == null)
        {
            synchronized (lock)
            {
                if (viewModelFactory == null)
                {
                    viewModelFactory = new ViewModelFactory();
                }
            }
        }
        return viewModelFactory;
    }

    public Object getViewModel(View view)
    {
        return viewModels.get(view);
    }

    private void createLoginViewModels()
    {
        viewModels.put(View.LOGIN, new LoginViewModel(modelFactory.getModel(InterfaceEnum.LOGIN)));
    }

    private void createManagerViewModels()
    {
        viewModels.put(View.EMPLOYEE, new EmployeeViewModel(modelFactory.getModel(InterfaceEnum.MANAGER_EMPLOYEE)));
    }

    private void createDoctorViewModels()
    {
    }

    private void createNurseViewModels()
    {
    }
}
