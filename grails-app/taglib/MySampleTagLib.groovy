import com.opensymphony.module.sitemesh.HTMLPage

class MySampleTagLib {
    static namespace = "sample";
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def allPageProperties = { attrs ->
        HTMLPage page = request.getAttribute("__sitemesh__page");
        log.info "page classs: ${page.getClass().getName()}"
        page.getPropertyKeys().each { key ->
            out << "<div>${key}</div>"
        }
    }

}
