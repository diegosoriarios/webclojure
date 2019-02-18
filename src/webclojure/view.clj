(ns webclojure.view
  (:use hiccup.page hiccup.element))

(defn index-page []
  (html5
    [:html
     [:head]
     [:body 
      [:h1 "Diga olá para o Diego"]
      [:button] "Olá Diego"]]))
    
