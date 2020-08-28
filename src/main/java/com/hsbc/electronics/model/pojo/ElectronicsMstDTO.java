package com.hsbc.electronics.model.pojo;

public class ElectronicsMstDTO {

    private Integer id;

    private String category;

    private String company;

    private String product;

    private String color;

    private String description;

    private Double price;

    private Double discount;

    private String ItemsInStock;

    public ElectronicsMstDTO() {
    }

    public ElectronicsMstDTO(Integer id, String category, String company, String product, String color, String description, Double price, Double discount, String itemsInStock) {
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

    public String getItemsInStock() {
        return ItemsInStock;
    }

    public void setItemsInStock(String itemsInStock) {
        ItemsInStock = itemsInStock;
    }
}
