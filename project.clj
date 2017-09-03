(defproject lumo-practice "0.1.0-SNAPSHOT"
  :description "A project for my practice how to use bootstrapped cljs."
  :license {:name "MIT license"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[hiccups "0.3.0"]
                 #_[crate "0.2.5"]
                 #_[andare "0.7.0"]
                 #_[org.clojure/clojurescript "1.9.854"]]
  :cljsbuild {:builds
              [{:id "dev-hello-world"
                :source-paths ["src"]
                :compiler {:output-to "out/main-hello-world.js"
                           :main hello-world.core
                           :optimizations :advanced
                           :target :nodejs}}
               {:id "dev-express-sample"
                :source-paths ["src"]
                :compiler {:output-to "out/main-express-sample.js"
                           :main express-sample.core
                           :optimizations :simple
                           :target :nodejs}}]})
