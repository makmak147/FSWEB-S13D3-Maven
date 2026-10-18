package org.example;

public class Wall {
    // Sınıf değişkenleri
    double width;
    double height;

    // Constructor (Yapıcı metot)
    public Wall(double width, double height) {
        // Değerler 0'dan küçükse 0'a eşitliyoruz
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    // Metotlar
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}