angular.module('book').factory('Book', ['$resource',
    function ($resource) {
        return $resource('/books/:bookId', {}, {
            query: {
                isArray: false
            }
        });
    }
]);