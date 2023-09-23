package architecture.notes.core.application.interfaces;

import architecture.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();

    void addNote();
}
