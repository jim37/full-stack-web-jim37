# CarsTrading

1. What is the proposed name for your Web application?
    - CarsTrading
2. Who is the target audience for your Web application?
    - People who want to sell their used car to others.
3. What problem is it intended to solve for the target audience?
    - This application provides an easy way for people to sell their used cars. Users can create their own account and put information of their cars into my web application. Besides, they can also search cars' information if they want to buy cars.
4. How will it meet the minimum project requirements?
    - Most of the content will be freely accessible without a login. If users want to interact with each other, a login will be required which I'll store in my database. All public data will be accessible through RESTful services. All RESTful services will data in both JSON and XML formats.
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site will have a reputation system. Customer can review each transaction and rate the credit of the seller. Therefore,sellers will have their own reputation. More over, my site will provide users with a discussion board where users can share their opinions and experience.
    
## Build status

[![Build Status](https://travis-ci.org/jim37/full-stack-web-jim37.svg?branch=master)](https://travis-ci.org/jim37/full-stack-web-jim37)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[CarsTrading](https://intense-beach-76008.herokuapp.com/)

## Key Features

 * User sign in & sign up
 * Search cars according to different car types
 * View cars’ information
 * Add new car
 * Edit or delete car’s information
 * Buy cars
 * View orders


## Project Details

### Landing Page

 (https://github.com/jim37/full-stack-web-jim37/blob/master/landing.jpg)

### User Input Form

 (https://github.com/jim37/full-stack-web-jim37/blob/master/Signin.jpg)
 (https://github.com/jim37/full-stack-web-jim37/blob/master/cars%20page.jpg)
 (https://github.com/jim37/full-stack-web-jim37/blob/master/Add%20Car.jpg)
 (https://github.com/jim37/full-stack-web-jim37/blob/master/Search.jpg)

## API

### API Method: addCarForm

    POST /cars/add

#### Parameters

- **title**_(required)_ — Car's brand.
- **carType** _(required)_ — Car's type.
- **price** _(required)_ — Car's price.
- **description** _(required)_ — A description about user's car.

#### Response

##### JSON Response

```json
{
    "title": "BMW",
    "carType": "SUV",
    "price": "10000",
    "description": "Nice car!"
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<addCarForm>
    <title>BMW</title>
    <carType>SUV</carType>
    <price>10000</price>
    <description>Nice car!</description>
</addCarForm>
```

#### Errors

- **404 Not Found** — The carType was not found.


## Technologies Used

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
- [Bootstrap] - a popular HTML, CSS, and JS framework for developing responsive, mobile first projects on the web.
