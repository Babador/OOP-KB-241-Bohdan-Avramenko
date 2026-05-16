package lab03;

import java.util.Arrays;

public class UserStory extends Ticket {
    private final UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory[] dependencies) {
        super(id, name, estimate);
        this.dependencies = (dependencies != null) ? dependencies : new UserStory[0];
    }

    public UserStory[] getDependencies() {
        return Arrays.copyOf(dependencies, dependencies.length);
    }

    @Override
    public void complete() {
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {

                return;
            }
        }

        super.complete();
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}