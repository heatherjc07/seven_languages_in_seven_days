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