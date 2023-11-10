package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {
    final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareView() {
        System.out.println("Success");
        ClearState clearState = this.clearViewModel.getState();
        clearState.setSuccessPrompt("Clear Success");
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }
}
