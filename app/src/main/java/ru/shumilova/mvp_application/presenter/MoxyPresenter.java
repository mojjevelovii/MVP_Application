package ru.shumilova.mvp_application.presenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.shumilova.mvp_application.model.MainModel;
import ru.shumilova.mvp_application.view.MoxyView;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyView> {
    private MainModel mainModel = new MainModel();

    public void updateTextData(String text) {
        String newText = mainModel.getText().concat(text);
        mainModel.setText(newText);
        getViewState().showTextData(newText);
    }
}
