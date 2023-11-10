package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import entity.UserFactory;

import java.io.IOException;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearUserDataAccessInterface;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor (ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearPresenter) {
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
        this.clearPresenter = clearPresenter;
    }

    public void execute() {
        clearUserDataAccessInterface.clear();
        clearPresenter.prepareView();
    }
}
