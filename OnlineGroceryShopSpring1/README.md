
# Online Grocery Shop (Spring Boot)

This is a full-featured Java Spring Boot web application for an online grocery store, including:

✅ Inventory CRUD via REST  
✅ Order placement with bot route calculation  
✅ Database persistence (JPA, H2/MySQL/Postgres)  
✅ Web UI (HTML/CSS/JS) for interacting with the system  
✅ User Registration & Login (Spring Security – optional)

## Structure

- `Product` entity (name, price, quantity, x, y)
- `Order` entity (list of product + qty, status)
- `Route` entity (list of visited coordinates)

## Endpoints

### Products
- `POST /products` – Add product  
- `GET /products` – List all  
- `PUT /products/{id}` – Update  
- `DELETE /products/{id}` – Delete  

### Orders
- `POST /orders` – Place order  
- `GET /orders/{id}` – Order status  
- `GET /routes?orderId=123` – Bot route for order  

## Bonus UI
- Simple frontend using Thymeleaf or HTML/JS to manage products and orders
- Login/Register screen

Run with:
```
./mvnw spring-boot:run
```

