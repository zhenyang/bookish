angular.module('bookDetail')
    .component('bookDetail', {
        templateUrl: 'javascripts/bookdetail/bookdetail.template.html',
        controller: ['$routeParams', 'Book',
            function BookDetailController($routeParams, Book) {
                var self = this;
                console.log("in controller");
                Book.get({bookId: $routeParams.id}, function (book) {
                    console.log("fetch back");
                    self.book = book;
                });
            }]
    });