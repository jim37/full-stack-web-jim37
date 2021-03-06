# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## [Unreleased]
### Added
- TBD.


## [v1.5] - 2017-04-22
### Added
- Added some web pages: carEdit.html, order.html, caradd.html
- Created additional entities: Rating.java, RatingPK.java
- Created additional controller: CarEditController.java
- Created additional repository: RatingRepository.java
- added new functions in CarsController.java
- Changed the style of Home Page

## [v1.4] - 2017-03-25
### Added
- Create 3 additional Entities: Manager.java, Sales.java, Transactions.java
- Create 3 additional Repositories: ManagerRepository.java, SalesRepository.java, TransactionReponsitory.java
- Create 3 additional RESTful services that return JSON: ManagerService.java, SalesService.java, TransactionService.java
- Create 3 additional MVC controllers: ManagerController.java, SalesController.java, TransactionController.java
- Create 3 additional MVC pages: cars.html,register.html, manager.html
  In login page, I added a register link. register.html leverages a RESTful service using AJAX through Manager.java and ManagerRepository.java


## [v1.3] - 2017-02-16
### Added
- Created an Entity: Car.java
- Created a Repository: CarRepository.java
- Created a RESTful web service and return JSON: CarsService.java
- Created a MVC Controller and implement get and post methods: CarsController.java
- Created a MVC Page and wire it to Repository: cars.html

## [v1.2] - 2017-01-28
### Added
- Answered in README.md
    - What is the proposed name for your Web application?
    - Who is the target audience for your Web application?
    - What problem is it intended to solve for the target audience?
    - How will it meet the minimum project requirements?
    - Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?

## [v1.1] - 2017-01-28
### Added
- Cloned, configured, and compiled the scaffold project.
- Configured developer workspace.
- Deployed to Heroku.

[Unreleased]: https://github.com/jim37/full-stack-web-jim37/compare/v1.2...HEAD
[v1.5]: https://github.com/jim37/full-stack-web-jim37/compare/v1.4...v1.5
[v1.4]: https://github.com/jim37/full-stack-web-jim37/compare/v1.3...v1.4
[v1.3]: https://github.com/jim37/full-stack-web-jim37/compare/v1.2...v1.3
[v1.2]: https://github.com/jim37/full-stack-web-jim37/compare/v1.1...v1.2
[v1.1]: https://github.com/jim37/full-stack-web-jim37/compare/...v1.1
