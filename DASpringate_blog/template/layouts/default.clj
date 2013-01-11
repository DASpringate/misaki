; @title  default title
; @format html5

[:head
 [:meta {:charset (:charset site)}]
 [:meta {:name    "viewport"
         :content "width=device-width, initiali-scale=1.0, user-scalable=yes"}]

 [:title
  (if (= (:title site) "home")
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:div.container-fluid.well
  [:h1 "What is this?"]
  [:p "David Springate's personal blog on programming, data, informatics, biostatistics and evolution"]]

 [:div.subnav
  [:ul.nav.nav-pills
   [:li (link-to "/index.html" "Home")]
   [:li (link-to "/about.html" "About")]
   [:li (link-to "/research.html" "Research")]
   [:li (link-to "/papers.html" "Papers")]
   [:li (link-to "https://github.com/DASpringate" "Github")]]]
 
 (absolute-css ["/css/bootstrap.min.css"(:css site ())])
 (absolute-css {:media "only screen and (max-device-width:480px)"} (:device-css site))]
; /head

[:body
 [:div.container-fluid
  [:div.row-fluid
   [:div.span1]
   [:div.span10
    contents]
   [:div.span1]]
  [:div.span12
   [:div.span2]
   [:div.span8
    (footer
     (link (str "@" (:twitter site))
           (str "http://twitter.com/"
                (:twitter site)))
     "&nbsp; 2012")]]
  (absolute-js ["/js/prettify.js"
                "/js/lang-clj.js"
                (:js site ())])]]
 
; /body
