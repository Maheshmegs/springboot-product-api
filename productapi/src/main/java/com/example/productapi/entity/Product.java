package com.example.productapi.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "products")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank
@Size(max = 100)
@Column(nullable = false, length = 100)
private String name;


@Size(max = 500)
@Column(length = 500)
private String description;


@NotNull
@DecimalMin(value = "0.0", inclusive = false, message = "Price must be > 0")
@Digits(integer = 10, fraction = 2)
@Column(nullable = false, precision = 12, scale = 2)
private BigDecimal price;


@Column(name = "created_at", nullable = false)
private LocalDateTime createdAt;


@PrePersist
public void prePersist() {
if (createdAt == null) {
createdAt = LocalDateTime.now();
}
}


// Getters and setters
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }


public String getName() { return name; }
public void setName(String name) { this.name = name; }


public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }


public BigDecimal getPrice() { return price; }
public void setPrice(BigDecimal price) { this.price = price; }


public LocalDateTime getCreatedAt() { return createdAt; }
public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
