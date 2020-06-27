package ru.shumilova.mvp_application.presenter;

import ru.shumilova.mvp_application.model.MainModel;
import ru.shumilova.mvp_application.view.MainView;

public class MainPresenter {
    private MainModel mainModel = new MainModel();

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

    private MainView mainView;

    public void updateTextData(String text) {
        String newText = mainModel.getText().concat(text);
        mainModel.setText(newText);
        mainView.showTextData(newText);
    }

}
