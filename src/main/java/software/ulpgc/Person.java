package software.ulpgc;

public record Person(
        int index,
        String id,
        String name,
        String surName,
        String sex,
        String email,
        String phone,
        String birthday,
        String title
) {

    @Override
    public String toString() {
        return "Person{" +
                "index=" + index +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", Sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}