package web.headers.Model;

import java.util.List;

public class HeadersBean {
    private List<String> headerNames;
    private List<String> headerValues;

    // Costruttore vuoto (richiesto per JavaBean)
    public HeadersBean() {
    }

    // Getter e setter per headerNames
    public List<String> getHeaderNames() {
        return headerNames;
    }

    public void setHeaderNames(List<String> headerNames) {
        this.headerNames = headerNames;
    }

    // Getter e setter per headerValues
    public List<String> getHeaderValues() {
        return headerValues;
    }

    public void setHeaderValues(List<String> headerValues) {
        this.headerValues = headerValues;
    }
}


