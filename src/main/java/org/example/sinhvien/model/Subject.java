package org.example.sinhvien.model;

public class Subject {
    private String id;
    private String name;
    private Integer soTrinh;

    public Subject() {
    }

    public Subject(String id, String name, Integer soTrinh) {
        this.id = id;
        this.name = name;
        this.soTrinh = soTrinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSoTrinh() {
        return soTrinh;
    }

    public void setSoTrinh(Integer soTrinh) {
        this.soTrinh = soTrinh;
    }
}

