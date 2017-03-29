(defproject lein-aot-order "0.1.0-SNAPSHOT"
  :description "This leiningen plugin provides commands to work around
  problems of clojure ahead-of-time compilation, by determining a
  suitable compilation order via clojure.tools.namespace.
  The following tasks are provided:
    lein aot-order     which just prints the determines order,
    lein aot-jar       which invokes the jar tasks, with a suitable :aot setting."
  
  :url "https://github.com/active-group/lein-aot-order"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "0.3.0-alpha3"]]
  :eval-in-leiningen true)