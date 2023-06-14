package inheritance.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Entity {

    protected String id = UUID.randomUUID().toString();

    protected LocalDateTime dateCreated = LocalDateTime.now();

    protected LocalDateTime dateDeactivated;

    protected boolean active = true;

    public String getId() {
        return id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateDeactivated() {
        return dateDeactivated;
    }

    public boolean isActive() {
        return active;
    }

    public final void deactivate() {
        active = false;
        dateDeactivated = LocalDateTime.now();
    }

}
