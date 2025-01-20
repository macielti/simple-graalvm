(ns leiningen.new.simple-graalvm
  (:require [leiningen.new.templates :as tmpl]
            [leiningen.core.main :as main]))

(def render (tmpl/renderer "simple_graalvm"))

(defn simple-graalvm
  "FIXME: write documentation"
  [name]
  (let [data {:name      name
              :sanitized (tmpl/name-to-path name)}]
    (main/info "Generating fresh 'lein new' net.clojars.macielti/simple-graalvm project.")
    (tmpl/->files data
                  ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)]
                  ["project.clj" (render "project.clj" data)])))
