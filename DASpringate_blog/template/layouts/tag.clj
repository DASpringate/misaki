; @layout  default
; @title   tag default title


[:article
 [:div
  [:h1 (:tag-name site)]]
 
 (ul #(link (:title %) (:url %))
     (:posts site))]

