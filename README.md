# TSW-HeadersBean

# Premessa:
Così come è possibile estrarre, da una richiesta, i valori inseriti in
un form, tramite `request.getParameter(nome_elemento_input)`, così è
possibile anche estrarre i valori inseriti dal browser nei campi header
della richiesta tramite `request.getHeader(nome_header)`.

Poichè non è possibile sapere quali headers invia il browser (perché
ogni browser ne usa un sottoinsieme) si possono avere i nomi degli
headers inviati dal browser con la chiamata `request.getHeaderNames()` che
resituisce una enumeration di stringhe.

# Esercizio:
Scrivere un'applicazione web, secondo il modello **MVC**, che crei una
risposta contenente una pagina html con i nomi ed i valori degli headers
del messaggio di richiesta inviata dal browser. Mostri inoltre il
protocollo http utilizzato.

In seguito si danno indicazioni (nei punti A, B e C) sui 3 file da creare.


## A.(Model) 
Da inserire in `src/main/java/Model`
Scrivere una classe java (un bean) HeadersBean che abbia come attributi le due
liste di stringhe headerNames ed headerValues con i getters e setters. La prima
dovrà contenere i nomi degli header inviati nella request e l’altra, in
corrispondenza, i valori per tali header.


## B. (Controller) 
Da inserire in `src/main/java/Controller`
Scrivere una servlet `ServletRequestHeaders` che abbia nome esterno `index.html` tramite l’uso di `@WebServlet("/index.html");` tale Servlet
dovrá estrarre gli header creare un oggetto HeadersBean, e poi ridirezionare verso `showHeaders.jsp`

## C. (View)
Da inserire in src/main/webapp/WEB-INF/results
Scrivere una jsp showHeaders.jsp che produca in response una pagina web dal
titolo "Headers" ed il cui corpo, tramite HTML, java e la variabile request
(senza re-dichiarazione) produca la sequenza di coppie "nome = valore" per
ciascun header.
.
