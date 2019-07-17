package pti.models;

public class Teacher {
    int id;
    String username;
    String description;
    String image;
    Teacher(
            int id,
            String username,
            String description,
            String image)
    {
        this.id = id;
        this.username=username;
        this.description=description;
        this.image=image;
    }
}
