;; Define template options here
; @layout  default
; @title   home

(defn page-header [[fs & rs]]
  [:div {:class "page-header"}
   [:h1 [:span fs] rs]])

(defn article-item [{:keys [title abstract journal year authors]}]
  [:li
   [:p [:h5 (link-to (first title) (second title))] [:em journal] " (" year ")"]
   [:p authors]
   [:p [:h6 "Abstract: "] abstract]
   [:p]])

(defn article-list [items]
  [:ul
   (map article-item items)])

(def articles (read-string
               (slurp
                "/home/david/clojure/misaki/DASpringate_blog/public/resources/papers.clj")))

[:h1 "Research articles"]
(article-list articles)
                                        ; hello



