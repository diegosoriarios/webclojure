(ns webclojure.core
  (:gen-class :main true)
  (:use compojure.core
        ring.middleware.json
        ring.util.response
        ring.adapter.jetty)
  (:require [compojure.route :as route]
            [webclojure.view :as view]))

(defroutes my_routes
  (GET "/" [] (view/index-page))
  (GET "/rest" [] (response {:email "diegosoriarios@gmail.com"}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))

(defn -main [& args] (run-jetty app {:port 9001}))
