(ns express-sample.core)

(def express (js/require "express"))
(def app (express))

(.get app "/"
      (fn [req res]
        (.send res "Hello world! <a href=\"/sample\">sample</a>")))

(.get app "/sample"
      (fn [req res]
        (.send res "sample page <a href=\"/\">home</a>")))

(.listen app 3000
         (fn []
           (js/console.log "started-express")))
