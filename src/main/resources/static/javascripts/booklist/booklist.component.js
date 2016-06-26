angular.module('bookList').component('bookList', {
    templateUrl: 'javascripts/booklist/booklist.template.html',
    controller: ['$routeParams', 'Book',
        function BookListController($routeParams, Book) {
            var self = this;
            self.pageIndex = $routeParams.page || 1;
            self.pageSize = 12;
            Book.query(
                {page: self.pageIndex, size: self.pageSize},
                function (response) {
                    self.pages = range(response.totalPages);
                    self.books = response.content;
                });

            function range(n) {
                var res = [];
                for (var i = 0; i < n; i++) {
                    res.push(i);
                }
                return res;
            }

        }]
});