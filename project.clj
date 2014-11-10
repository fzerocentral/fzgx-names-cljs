(defproject fzgx-names-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2234"]
                 [org.clojure/core.logic "0.8.9"]]

  :plugins [[lein-git-deps "0.0.2-SNAPSHOT"]
            [lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "fzgx-names-cljs"
              :source-paths ["src"]
              :compiler {
                :output-to "fzgx_names_cljs.js"
                :output-dir "out"
                :optimizations :advanced
                :pretty-print false}}]})
