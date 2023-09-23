package architecture.notes.presentation.queries.views;

import architecture.notes.core.domain.Note;

import java.util.Collection;

public interface Presenter {

    void printAll(Collection<Note> notes);

}
