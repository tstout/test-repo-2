(ns plugin-b.core
  (:require [clojure.tools.cli :refer [parse-opts]]))

(defn init []
  (println "--->>> plugin-b loaded <<<------"))

(defn -main [& args] (println "hello world"))
