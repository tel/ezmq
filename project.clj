(defproject ezmq "0.0.1"
  :description "Yet another Clojure ZMQ wrapper for JZMQ."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [jspha/zmq-native "2.0.10.4"]
                 [slingshot "0.10.1"]
                 [cascalog/carbonite "1.0.5"]]
  :native-path "native"
  :resource-paths ["native"])
