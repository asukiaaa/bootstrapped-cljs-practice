(ns hello-world.core
  #_(:require [cljs.nodejs :as nodejs]))

#_(nodejs/enable-util-print!)

(defn greeting []
  (js/console.log "Hello world.")
  #_(prn "Hello world."))

(defn -main []
  (greeting))

(set! *main-cli-fn* -main)
