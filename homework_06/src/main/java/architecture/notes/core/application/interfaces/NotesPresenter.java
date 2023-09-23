package architecture.notes.core.application.interfaces;

import architecture.notes.core.domain.Note;
import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

}
