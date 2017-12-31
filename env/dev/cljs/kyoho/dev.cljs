(ns ^:figwheel-no-load kyoho.dev
  (:require
    [kyoho.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
