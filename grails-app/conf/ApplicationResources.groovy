modules = {
    application {
        dependsOn "angular"

        resource url: "/js/kanban.js"
    }

    angular {
        resource url: "/js/angular/angular.min.js"
        resource url: "/js/angular/angular-resource.min.js"
    }
}