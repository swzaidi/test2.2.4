import com.opensymphony.module.sitemesh.HTMLPage

class MySampleTagLib {
    static namespace = "sample";
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def allPageProperties = { attrs ->
        def msg = attrs.msg

        out << "<div>In:${msg}</div>"

        HTMLPage page = request.getAttribute("__sitemesh__page");
        System.out.println "In:${msg} "
        System.out.println "  ${(page) ? 'found sitemesh' : 'no sitemesh'}"
        if(page) {
            //System.out.println "page classs: ${page.getClass().getName()}"

            page.getPropertyKeys().each { key ->
                out << "<div>&nbsp;&nbsp;${key}</div>"
                System.out.println  "  ${key}"
            }
        } else {
            out << "<div>&nbsp;&nbsp;no sitemesh page</div>"
        }

    }

}
