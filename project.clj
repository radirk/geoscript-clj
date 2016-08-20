(defproject geoscript "1.0.0"
  :description "Clojure version of the geoscript project"
  :repositories { "OpenGeo Maven Repository" "https://repo.boundlessgeo.com/main"}
  :url "http://geoscript.org/"
  :main geoscript.core
  :dependencies [[org.clojure/clojure "1.2.1"]
     	         [org.clojure/data.json "0.1.1"]
                 [org.geotools/gt-main "15.1"]
                 [org.geotools/gt-swing "15.1"]                 
                 [org.geotools/gt-epsg-hsql "15.1"]
                 [org.geotools/gt-referencing "15.1"]
                 [org.geotools.jdbc/gt-jdbc-postgis "15.1"] 
                 [org.geotools.jdbc/gt-jdbc-h2 "15.1"]                 
                 [org.geotools/gt-geojson "15.1"]
                 [org.geotools/gt-charts "15.1"]
                 [org.geotools/gt-render "15.1"]
                 [org.geotools/gt-shapefile "15.1"]])
