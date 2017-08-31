(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'hello-world.core
   :output-to "index_hello_world.js"
   :optimizations :advanced
   :target :nodejs})
