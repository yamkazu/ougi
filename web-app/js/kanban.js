(function (angular) {

    var kanban = angular.module("kanban", ["ngResource"]);

    kanban.controller("TicketController", ["$scope", "$resource", function ($scope, $resource) {

        $scope.ticket = {};

        var Ticket = $resource($scope.ticketUrl + "/:id", {ticket: '@id'}, {
            save: {method: 'POST', headers: {'Accept': 'application/json'}}
        });

        $scope.add = function () {
            var newTicket = new Ticket($scope.ticket);
            newTicket.$save(function (tikcet) {
                $scope.tickets.push(tikcet);
            });
        }

        $scope.tickets = Ticket.query();
    }]);

})(angular);
