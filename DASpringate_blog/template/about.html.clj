;; Define template options here
; @layout  default
; @title   home


;; Sample posts
[:h1 "About me"]
[:div.row-fluid
 [:div.span4
  (image {:HEIGHT 365 :WIDTH 339} "img/me_crop_bw.jpg")]
 [:div.span8
  (markdown "
I am a biostatistician and informatician in the [Primary Care Research Group](http://www.medicine.manchester.ac.uk/primarycare/) at the University of Manchester.  In 2011 I completed a PhD in evolutionary biology, studying plastic and genetic responses to environmental changes. My previous work has covered a range of topics including evolutionary genetics, artificial life, machine learning, computational biology and bioinformatics.

I have been programming seriously for over four years and am proficient in R and Python and am becoming so with Clojure, which is rapidly becoming my favourite language of all. I also have some experience with Common Lisp, Scheme, Haskell, Processing, bash scripting, SQL and Stata programming. I have skills and experience in acquiring, processing, modelling and visualising large and complicated datasets.

I am a dad of two girls, an avid reader, connoisseur of lo-fi indie pop and very occasional flamenco guitarist.

You can contact me on [twitter](http://twitter.com/datajujitsu) or by email at daspringate `in or near the location of`  gmail  `a very small circular shape` com")]]


[:h1 "About this blog"]

(markdown "
This blog is concerned with my various interests, in and outside of academia.  In particular, data programming, informatics, text-mining and biostatistics. I am interested in open source, open access and open data in academia, bio- and health informatics and distilling complex datasets from a range of sources into meaningful information.

The blog itself was built in Clojure using the [Misaki](http://github.com/liquidz/misaki) Static site generator, (which I [edited slightly](http://github.com/DASpringate/misaki) to meet my needs) and [Twitter Bootstrap](http://twitter.github.com/bootstrap/). It is hosted on [Github pages](http://pages.github.com/). My previous Blogger blog can be found at [www.datajujitsu.co.uk](http://www.datajujitsu.co.uk).")

                                        ; about

