package architecture.notes.presentation.queries.controllers;

import architecture.notes.presentation.queries.views.Presenter;

public abstract class Controller {
    public <T extends Presenter> void view(T presenter){
    }
}
