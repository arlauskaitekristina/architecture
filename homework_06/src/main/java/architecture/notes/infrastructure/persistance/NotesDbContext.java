package architecture.notes.infrastructure.persistance;

        import architecture.database.NotesDatabase;
        import architecture.database.NotesRecord;
        import architecture.notes.core.application.interfaces.NotesDatabaseContext;
        import architecture.notes.core.domain.Note;
        import architecture.notes.infrastructure.persistance.configurations.NoteConfiguration;

        import java.util.ArrayList;
        import java.util.Collection;

public class NotesDbContext extends DbContext implements NotesDatabaseContext {

    private NotesDatabase notesDatabase;

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: Этого кастинга быть не должно, тут доджен работать внутренний механизм фреймворка
        if (this.notesDatabase == null) {
            this.notesDatabase = new NotesDatabase();
            this.notesDatabase.getNotesTable().setRecords(((NotesDatabase) database).getNotesTable().getRecords());
        }
        for (NotesRecord record: notesDatabase.getNotesTable().getRecords()) {
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }

    @Override
    public void addNote() {
        this.notesDatabase.getNotesTable().addRecord();
    }

    public NotesDbContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

}
