package ougi

import grails.rest.RestfulController

class TicketController extends RestfulController {

    static responseFormats = ["json", "xml"]

    TicketController() {
        super(Ticket)
    }
}
