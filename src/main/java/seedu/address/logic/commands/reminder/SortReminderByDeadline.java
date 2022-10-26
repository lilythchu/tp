package seedu.address.logic.commands.reminder;

import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

import static java.util.Objects.requireNonNull;

/**
 * Sorts reminder by their deadline. Reminders with same deadline will be sorted lexicographically by their names.
 */
public class SortReminderByDeadline {
    
    public static final String COMMAND_WORD = "sort reminder deadline";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sort reminders by their deadline ";

    public static final String MESSAGE_SUCCESS = "Reminders sorted by deadline";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.sortReminderByDeadline();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
