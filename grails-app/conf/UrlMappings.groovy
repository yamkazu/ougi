class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.${format})?" {
            constraints {
                // apply constraints here
            }
        }

        "/tickets"(resources: "ticket")

        "/"(view: "/index")
        "500"(view: '/error')
    }
}
