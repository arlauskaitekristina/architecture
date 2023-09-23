package architecture.notes.core.application.interfaces;

import architecture.notes.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();

    void addNote();

    boolean saveChanges();

}
