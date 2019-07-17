package pti.models;

public class News {
    int id;
    String name;
    String description;
    String image;
    News(
            int id,
            String name,
            String description,
            String image)
    {
        this.id = id;
        this.name=name;
        this.description=description;
        this.image=image;
    }
}
