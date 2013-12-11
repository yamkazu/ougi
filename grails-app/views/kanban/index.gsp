<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <title>Ougi - Kanban</title>
    <meta name="layout" content="main"/>
    <r:require modules="application"/>
</head>

<body>
<div ng-app="kanban" ng-init="ticketUrl = '${createLink(resource: 'ticket')}'">

    <div ng-controller="TicketController">
        <input type="text" ng-model="ticket.title"/>
        <button ng-click="add()">Add</button>

        <hr/>

        <div>
            <li ng-repeat="ticket in tickets">
                <ul>{{ ticket.title }}</ul>
            </li>
        </div>
    </div>

</div>
</body>
</html>