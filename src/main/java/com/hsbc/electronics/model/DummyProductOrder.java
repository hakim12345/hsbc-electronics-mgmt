package com.hsbc.electronics.model;


import javax.persistence.*;

@Entity
@Table(name = "DummyProductOrder")
public class DummyProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dummyProductOrder_id")
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

    @Column(name = "numberOfOrder", nullable = false)
    private Integer numberOfOrder;

    @Column(name = "orderStatus", nullable = false)
    private Boolean orderStatus;

    public DummyProductOrder() {
    }

    public DummyProductOrder(Integer id, String category, String company, String product, String color, String description, Integer numberOfOrder, Boolean orderStatus) {
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
