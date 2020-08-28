package com.hsbc.electronics.model.pojo;

public class DummyProductOrderDTO {

    private Integer id;

    private String category;

    private String company;

    private String product;

    private String color;

    private String description;

    private Integer numberOfOrder;

    private Boolean orderStatus;

    public DummyProductOrderDTO() {
    }

    public DummyProductOrderDTO(Integer id, String category, String company, String product, String color, String description, Integer numberOfOrder, Boolean orderStatus) {
        this.id = id;
        this.category = category;
        this.company = company;
        this.product = product;
        this.color = color;
        this.description = description;
        this.numberOfOrder = numberOfOrder;
        this.orderStatus = orderStatus;
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

    public Integer getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(Integer numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
}
