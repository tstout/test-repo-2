(ns plugin-b.core
  (:require [clojure.tools.cli :refer [parse-opts]]
            [taoensso.timbre :as log]))

(defn init [_]
  (log/info "--->>> plugin-b loaded <<<------"))

(defn -main [& args] (println "hello world"))
