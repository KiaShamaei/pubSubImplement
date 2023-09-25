package org.example;

public class Topic {
    private String name ;
    private Long id ;
    private String description;

    public Topic(String name, Long id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Topic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
