package fr.tetemh;

import com.github.javafaker.Name;
import lombok.Data;

@Data
public class Student {
    private String name;
    private int age = 18;

    public Student(String name) {
        this.setName(name.toString());
    }
}
