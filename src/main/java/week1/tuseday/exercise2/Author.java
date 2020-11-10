package week1.tuseday.exercise2;

import java.util.Objects;

public class Author {
    private String surName;
    private String secondName;
    private Integer age;
    private Gender gender;

    public Author(String surName, String secondName, Integer age, Gender gender) {
        this.surName = surName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public String getSurName() {
        return surName;
    }

    public void setSureName(String sureName) {
        this.surName = sureName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surName, author.surName) &&
                Objects.equals(secondName, author.secondName) &&
                Objects.equals(age, author.age) &&
                gender == author.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, secondName, age, gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "surName='" + surName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
