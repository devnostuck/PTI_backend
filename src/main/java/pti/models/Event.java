package pti.models;

public class Event {
    int id;
    String name;
    String description;
    String image;

    Event(
            int id,
            String name,
            String description,
            String image)
    {
        this.id=id;
        this.name=name;
        this.description=description;
        this.image=image;
    }
}
