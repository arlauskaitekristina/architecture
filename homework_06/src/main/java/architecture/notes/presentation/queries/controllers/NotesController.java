package architecture.notes.presentation.queries.controllers;

import architecture.notes.core.domain.Note;
import architecture.notes.core.application.interfaces.NoteEditor;

import java.util.Scanner;

public class NotesController extends Controller{

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    public void routeAddNote() {
        this.noteEditor.addNote();
    }

    public void routeRemoveNote(Note note) {
        this.noteEditor.remove(note);
    }

    public void routeGetAll() {
        this.noteEditor.printAll();
    }


}