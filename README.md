# CarsTrading

1. What is the proposed name for your Web application?
    - CarsTrading
2. Who is the target audience for your Web application?
    - People who want to sell their used car to others.
3. What problem is it intended to solve for the target audience?
    - This applicaiton provides an easy way for people to sell their used cars. Users can create their own acount and put information of their cars into my web applicaion. Besides, they can also search cars' information if they want to buy cars.
4. How will it meet the minimum project requirements?
    - Most of the content will be freely accessible without a login. If users want to interact with each other, a login will be required which I'll store in my database. I'll use PayPal for payments. All public data will be accessible through RESTful services. All RESTful services will data in both JSON and XML formats.
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site will have a reputation system. Customer can review each transaction and rate the credit of the seller. Therefore,sellers will have thier own reputation. More over, my site will provide users with a disscsion board where users can share their opinions and experience.
    
## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-jim37.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-jim37)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[CarsTrading](https://shrouded-temple-81279.herokuapp.com/)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.