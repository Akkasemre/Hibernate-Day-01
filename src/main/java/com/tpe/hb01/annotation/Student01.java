package com.tpe.hb01.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // bu class dan olusturdugumuz object leri kalıcı (persist) hale getirmek icin DB de bir tablo olusturulur.
//db de Student01 isimli table olusturur.
//farklı isimde olusturmak istersek
@Table(name = "t_student01")//tabloya custom bir isim vermemizi sağlar.:opsiyonel

public class Student01 {
    @Id//entity annotasyonu kullanıldıgında kullanimi zorunludur. Pk stununun olusturulmasını saglar. !!!!neyi pk yapmak istersek onun üzerinde kullanıyoruz
    private int id;
    @Column(name = "std_name",length = 100,nullable = false,unique = true)//opsiyonel
    private String name;
    private int grade;

    //getter -setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //toString
    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

}
