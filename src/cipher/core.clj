  (ns cipher.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn true-or-false?
  "Given op, return true or false"
  [op]
  (let [x true
        y false]
    (cond
      (= op :and) (and x y)
      :else false)))

  (defn correct?
    "Given op and ans, returns message whether ans was correct or not"
    [op ans]
    (if (= ans (true-or-false? op))
      "You won"
      "You lost"))

