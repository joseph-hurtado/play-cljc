(ns play-cljc.instances
  (:refer-clojure :exclude [assoc dissoc]))

(defprotocol IInstance
  (->instanced-entity [entity]))

(defprotocol IInstanced
  (assoc [instanced-entity i entity])
  (dissoc [instanced-entity i]))

