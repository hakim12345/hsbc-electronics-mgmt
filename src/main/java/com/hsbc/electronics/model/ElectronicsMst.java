package com.hsbc.electronics.model;

import javax.persistence.*;

@Entity
@Table(name = "electronics_mst")
public class ElectronicsMst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "electronics_id")
    private Integer id;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "product", nullable = false)
    private String product;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "discount", nullable = false)
    private Double discount;

    @Column(name = "items_in_stock", nullable = false)
    private Integer ItemsInStock;

    public ElectronicsMst() {
    }

    public ElectronicsMst(Integer id, String category, String company, String product, String color, String description, Double price, Double discount, Integer itemsInStock) {
        this.id = id;
        this.category = category;
        this.company = company;
        this.product = product;
        this.color = color;
        this.description = description;
        this.price = price;
        this.discount = discount;
        ItemsInStock = itemsInStock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getItemsInStock() {
        return ItemsInStock;
    }

    public void setItemsInStock(Integer itemsInStock) {
        ItemsInStock = itemsInStock;
    }
}
