(ns express-sample.core
  (:require [hiccups.runtime :as hiccupstr]))

(def express (js/require "express"))
(def app (express))

(.get app "/"
      (fn [req res]
        (.send res (hiccupstr/render-html
                    [:div
                     [:p "Hello world."]
                     [:a {:href "/sample"} "sample"]]))))

(.get app "/sample"
      (fn [req res]
        (.send res (hiccupstr/render-html
                    [:div
                     [:p "sample page"]
                     [:a {:href "/"} "home"]]))))

(.listen app 3000
         (fn []
           (js/console.log "started-express")))
