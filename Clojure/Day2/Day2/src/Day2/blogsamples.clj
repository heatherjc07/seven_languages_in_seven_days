(ns Day2.blogsamples)
(defn size [v]
(if (empty? v)
0
(inc (size (rest v)))))

(println (size [1 2 3]))

(defn size2 [v]
(loop [l v, c 0]
(if (empty? l)
c
(recur (rest l) (inc c)))))

(println (size2 [1 2 3]))


(defn total [v]
 (if (empty? v)
  0
 (+ (first v) (total (rest v)))))

(total [1 2 3])


(println (total [1 2 3]))

(defn total2 [v]
 (loop [l v, c 0]
  (if (empty? l)
   c
  (recur (rest l) (+ (first l) c)))))

(println (total2 [1 2 3]))


(println (every? number? [1 2 3 :four]))
; false as :four is not a number

(println (some nil? [1 2 nil]))
; true as at least one value is nil

(println (not-every? odd? [1 3 5]))
; false as all are odd

(println (not-any? number? [:one :two :three]))
; true as none are numbers

(def words ["luke" "stephen" "heather"])

;create a sequence of values in collection which meet criteria
(println (filter (fn [word] (> (count word) 4)) words))
;("stephen" "heather")

;call a function on items in a collectionand returns the results. 
(println (map (fn [x] (* x x)) [1 1 2 3 5]))
; (1 1 4 9 25)

(def colors ["red" "blue"])
(def toys ["block" "car"])

; we're binding x to each string in list
(println (for [x colors] (str "I like " x)))
; returns ("I like red" "I like blue")

;binding multiple lists
;all possible combinations
(println (for [x colors, y toys] (str "I like " x " " y "s")))
;("I like red blocks" "I like red cars"
;"I like blue blocks" "I like blue cars")

;function to determine of a word is less than 4 chars
(defn small-word? [w] (< (count w) 4))

;only use toys values that are less than 4 chars 
(for [x colors, y toys, :when (small-word? y)]
 (str "I like " x " " y "s"))
;("I like red cars" "I like blue cars")

;summing values in a list
(println (reduce + [1 2 3 4]))
;10

;muliplying values in a list
(println (reduce * [1 2 3 4 5]))
;120

;basic sort
(println (sort [3 1 2 4]))
; returns (1 2 3 4)

;sort on the result of a function:
(defn abs [x] (if (< x 0) (- x) x))

;sorting on absolute value
(println (sort-by abs [-1 -4 3 2]))
;(-1 2 3 -4)

(println (range 1 10))
;returns (1 2 3 4 5 6 7 8 9)

;increment of 3
(println (range 1 10 3))
;returns (1 4 7)

;default lower bound of 0
(println (range 10))
;returns (0 1 2 3 4 5 6 7 8 9)

(println (take 3 (repeat "Hello")))
; ("Hello" "Hello" "Hello")

(println (take 5 (cycle [:cat :lion :tiger])))
; returns (:cat :lion :tiger :cat :lion)

;inside out
(println (take 5 (drop 2 (cycle [:cat :lion :tiger]))))
;(:tiger :cat :lion :tiger :cat)

;left to right
(println (->> [:cat :lion :tiger] (cycle) (drop 2) (take 5)))
;(:tiger :cat :lion :tiger :cat)

; add separator of "and"
(println (take 5 (interpose :and (cycle [:cat :lion :tiger]))))
;(:cat :and :lion :and :tiger)

;combining values from two sequences
(println (take 20 (interleave (cycle (range 2)) (cycle (range 3)))))
;(0 0 1 1 0 2 1 0 0 1 1 2 0 0 1 1 0 2 1 0)

(println (take 5 (iterate inc 1)))
;(1 2 3 4 5)

(println (take 5 (iterate dec 0)))
;(0 -1 -2 -3 -4)

;calculate consecutive pairs in the Fibonacci sequence
(defn fib-pair [[a b]] [b (+ a b)])

(println (take 5 (map first (iterate fib-pair [1 1]))))
; (1 1 2 3 5)

(println (nth (map first (iterate fib-pair [1 1]))50))
; returns (20365011074)

; Broken unless
(defn unless [test body] (if (not test) body))
(println(unless true (println "Danger, danger Will Robinson")))

(defmacro unless [test body]
(list 'if (list 'not test) body))

(println (macroexpand '(unless condition body)))
;(if (not condition) body)

(unless true (println "No more danger, Will."))
; nil
(unless false (println "Now, THIS is The FORCE."))
;Now, THIS is The FORCE.


                        
                            