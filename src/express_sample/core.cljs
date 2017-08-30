(ns express-sample.core)

(def express (js/require "express"))
(def app (express))

(.get app "/"
      (fn [req res]
        (.send res "Hello world!")))

(.get app "/sample"
      (fn [req res]
        (.send res "sample page")))

(.listen app 3000
         (fn []
           (prn "started-express")))
