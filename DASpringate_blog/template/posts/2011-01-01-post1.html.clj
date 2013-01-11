; @layout  post
; @title   A scheme interpreter
; @tag     markdown testing

[:h2 "link to things..."]
[:p "Sometimes it is worth noting just how important is is to be aware, to be in the moment..."]

(markdown "
# This is a markdown heading

  * hello
  * goodbye

[Google](www.google.com) is a good place to look for things...

    ```clojure
    (here (is (some (code))))
    (+ 1 2)
    ```
1. testing
2. 1-2-3
3. a-b-c

`and some more code`

```
lm (people~flies * hospitals)
summary()
(cat(woopas , nada, ping))
```
# FIN
## FIN
### FIN
#### FIN
##### FIN
  ")

#-CLJ
(link "label" "http://localhost/")
(link "http://localhost/")
(link "`code`" "http://localhost/")
CLJ
(link "label" "http://localhost/")
[:br]
(link "http://localhost/")
[:br]
(link "`code`" "http://localhost/")

(h2 "Unordered list")
#-CLJ
(ul (range 3))
(ul #(str "[" % "]") (range 3))
CLJ
(ul (range 3))
(ul #(str "[" % "]") (range 3))

(h2 "Definition list")
#-CLJ
(dl {:a 1, :b 2})
(dl [:hello "world" :foo "`bar`"])
CLJ
(dl {:a 1, :b 2})
(dl [:hello "world" :foo "`bar`"])

(h2 "Block quote")
#-CLJ
(blockquote
  "foo
  bar"
  [:a {:href "#"} "baz"])
CLJ
(blockquote
  "foo
  bar"
  [:a {:href "#"} "baz"])

(h2 "Inline code")
#-CLJ
(code "clojure.core/+")
CLJ
(code "clojure.core/+")

(h2 "Source code")
[:p "Comment out following code."]
#-CLOJURE
#-CLJ
(let [msg "world"]
  (println "hello," msg))
CLJ
CLOJURE

#-CLJ
(let [msg "world"]
  (println "hello," msg))
CLJ

(h2 "Paragraph")
#-CLJ
(p "hello, world")
(p "paragraph with `inline` code")
CLJ
(p "hello, world")
(p "paragraph with `inline` code")

(h2 "JavaScript")
#-CLJ
(js "a.js" "b.js")
CLJ

(h2 "Style Sheet")
#-CLJ
(css "a.css" "b.css")
CLJ
