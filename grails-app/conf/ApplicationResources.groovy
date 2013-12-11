modules = {
    application {
        dependsOn "angular", "angular-resource"

        resource url: "/js/kanban.js"
    }

    angular {
        resource url: "/js/angular/angular.min.js"
    }

    "angular-resource" {
        dependsOn "angular"

        resource url: "/js/angular/angular-resource.min.js"
    }
}