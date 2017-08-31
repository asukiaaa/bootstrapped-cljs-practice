(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'express-sample.core
   :output-to "index_express_sample.js"
   :optimizations :simple
   :target :nodejs})
