(defn maze-builer [maze-fn])

(defn make-wood-maze [])
(defn make-iron-maze [])

(def wood-maze-builder (partial maze-builder make-wood-maze))
(def iron-maze-builder (partial maze-builder make-iron-maze))
