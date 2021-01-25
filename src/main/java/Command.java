public abstract class Command {
    /** User command that is split by spaces */
    String[] commandSplit;

    public Command(String[] commandSplit) {
        this.commandSplit = commandSplit;
    }

    public boolean isExit() {
        return this.commandSplit.length == 1 && this.commandSplit[0].equals("bye");
    }

    abstract void execute(TaskList list) throws DukeException;
}
