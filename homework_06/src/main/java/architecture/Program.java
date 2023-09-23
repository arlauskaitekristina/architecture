package architecture;

import architecture.database.NotesDatabase;
import architecture.notes.core.application.ConcreteNoteEditor;
import architecture.notes.infrastructure.persistance.NotesDbContext;
import architecture.notes.presentation.queries.controllers.NotesController;
import architecture.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));

        controller.routeGetAll();
        controller.routeAddNote();
        System.out.println();
        controller.routeGetAll();

    }
}