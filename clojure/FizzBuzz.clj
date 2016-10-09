(defn fizzbuzz [end]
    (doseq
        [s (map
            (fn [n]
                (cond
                    (zero? (mod n 15)) "FizzBuzz"
                    (zero? (mod n 3)) "Fizz"
                    (zero? (mod n 5)) "Buzz"
                    :else n
                )
            )
            (range 1 (+ end 1))
        )]
        (println s)
    )
)

(fizzbuzz 100)