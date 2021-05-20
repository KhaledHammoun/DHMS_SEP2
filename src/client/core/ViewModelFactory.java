package client.core;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ViewModelFactory
{
    private static ViewModelFactory viewModelFactory;
    private static Lock lock = new ReentrantLock();

    private ViewModelFactory()
    {
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
}
