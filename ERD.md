# Ecommerce application backend

## Design database

### Entity Relationship Diagrams (ERDs)

```mermaid
---
title: Ecommerce application
---
erDiagram
    User{
        string id PK
        string password
        string email
        string phone
        string role
        string gender
        date date_of_birth
    }
    Address{
        string id PK
        ushort unit_number
        string street
        string ward
        string district
        string city
    }
    user-address{
        string id PK
        string user_id FK
        string address_id FK
        bool is_default
    }
    User ||--|{ user-address : "user_id"
    Address ||--|{ user-address : "address_id"
    Category{
        string id PK
        string name
        int left
        int right
        string parent_id
    }
    Product{
        string id PK
        string name
        string thumb
        string desc
        int price
        int quantity
        string owner_id FK
    }
    product-category{
       string id PK
       string cat_id FK 
       string product_id FK 
    }
    Product ||--|{ product-category : "product_id"
    Category ||--|{ product-category : "cat_id"
    User ||--|{ Product : "owner_id"
    Attributes{
        string id
        string abc
    }
    product-detail{
        string id PK
        string product_id FK 
        string attributes_id FK
    }
    Product ||--|| product-detail : "product_id"
    Attributes ||--|| product-detail : "attributes_id"
    Payment{
        string id PK
        string user_id FK
        string acc_num
        string type
        bool is_default
    }
    User ||--|{ Payment : "user_id"
    Comment{
        string id PK
        string user_id FK
        string content
        int left
        int right
        bool is_del
        string parent_id
    }
    User ||--|{ Comment : "user_id"
    Comment ||--|{ Comment : "parent_id"
    Comment ||--|{ Product : "parent_id"
    Notification{
        string id PK
        string noti_type
        string sender_id FK
        string recieve_id FK
        string content
        string option
    }
    Review{
        string id PK
        string user_id FK
        string product_id FK
        string content
        string[] image
        float rating_value
    }
    User ||--|{ Review : "user_id"
    Product ||--|{ Review : "product_id"
    Coupon{
        string id PK
        number discount_rate
        date start_at
        date end_at
        string from_id FK
    }
    User ||--|{ Coupon : "from_id"
    Order{
        string id PK
        string coupon_id FK
        string[] detail_id FK
        int total_price
        int final_price 
    }
    Order-detail{
        string id PK
        string detail_id FK
        string coupon_id FK
        int total_price
        int final_price
    }
    Order ||--|{ Order-detail : "detail_id"
    Order-detail ||--|| Detail : ""
    user-payment{
        string id PK
        string user_id FK
        string order_id FK
        string pay_id FK
    }
    User ||--|{ user-payment : ""
    Order ||--|{ user-payment : ""
    Cart{
        string id PK
        string user_id FK
        string[] detail_id FK
    }
    Detail{
        string id PK
        string product_id FK
        short quantity
    }
    Cart ||--|{ Detail : ""
    User ||--|| Cart : ""
    Search{
        string id PK
        string user_id FK
        string txt
    }
    User ||--o| Search : ""
    Follow{
        string id PK
        string subcribe_id
        string entity_id
    }
    User ||--o|Follow : ""
```

#### Note

parent_id --> parent_id

### Class Diagram

```mermaid
---
title: Ecommerce application
---
classDiagram
    note "($) hash"
    
    class User{
        + String id
        + String $pwd
        + String eml
        + String phn
        + String rle
        + String gdr
        + Date dob

        + create()
    }
    class Address{
        + String id
        + ushort unit_number
        + String street
        + String ward
        + String district
        + String city
    }
```

## Overview

Nested set model for:

[x] Category

[x] Comment

Connect database use Singleton Pattern.

Polymorphic Pattern for product attributes.
