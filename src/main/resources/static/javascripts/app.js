var bookishApp = angular.module('bookishApp', [
    'ngRoute',
    'bookList',
    'bookDetail'
]);

bookishApp.config(['$locationProvider', '$routeProvider',
    function config($locationProvider, $routeProvider) {
        $locationProvider.hashPrefix('!');

        $routeProvider
            .when('/books', {
                template: '<book-list></book-list>'
            })
            .when('/books/:id', {
                template: '<book-detail></book-detail>'
            })
            .otherwise('/books');
    }]);
