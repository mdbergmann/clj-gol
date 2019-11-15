(ns clj-gol.core-test
  (:require [clojure.test :refer :all]
            [clj-gol.core :refer :all]
            [clj-fakes.core :as f]))

(defn bar [bar]
  bar)

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest mock-test
  (f/with-fakes
    (let [bar (f/recorded-fake [["bar"] "bar2"
                                ["buzz"] "buzz2"])]
      (is (= (bar "bar") "bar2"))
      (is (f/was-called bar ["bar"])))))
