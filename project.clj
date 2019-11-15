(defproject clj-gol "0.1.0-SNAPSHOT"
  :description "Game of Life"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-fakes "0.12.0"]]
  :repl-options {:init-ns clj-gol.core})
