package com.example.mahmayar.virtualshelfbrowser;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {
    private String isbn;
    private String title;
    private float price;
    private String releaseDate;
    private String description;
    private String category;
    private String author;
    private String image_url;
    private String currency = "";

    public Book() {}

    protected Book(Parcel in) {
        image_url = in.readString();
        title = in.readString();
        price = (float) in.readDouble();
        isbn = in.readString();
        releaseDate = in.readString();
        category = in.readString();
        author = in.readString();
        description = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(image_url);
        dest.writeString(title);
        dest.writeDouble(price);
        dest.writeString(isbn);
        dest.writeString(releaseDate);
        dest.writeString(category);
        dest.writeString(author);
        dest.writeString(description);
    }
}