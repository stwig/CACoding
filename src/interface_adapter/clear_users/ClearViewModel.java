package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;
import interface_adapter.signup.SignupState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear");
    }
    public void setState(ClearState state) {
        this.state = state;
    }

    public void firePropertyChanged() {
        support.firePropertyChange("state2", null, this.state);
        System.out.println("state change");
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public ClearState getState() {
        return state;
    }

}
