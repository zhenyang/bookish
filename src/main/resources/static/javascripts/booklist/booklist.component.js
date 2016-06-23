angular.module('bookList').component(
    'bookList', {
        templateUrl: 'javascripts/booklist/booklist.template.html',
        controller: ['Book',
            function BookListController(Book) {
                var self = this;
                Book.query(function (response) {
                    self.books = response.content;
                });
            }]
    }
);