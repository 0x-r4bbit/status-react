(ns status-im.react-native.js-dependencies)

(def config                 (js/require "react-native-config"))
(def fs                     (js/require "react-native-fs"))
(def keychain               (js/require "react-native-keychain"))
(def qr-code                (js/require "qrcode"))
(def react-native           (js/require "react-native"))
(def webview-bridge         (js/require "react-native-webview-bridge"))
(def webview                #js {:WebView #js {}})
(def EventEmmiter           #js {})
(def fetch-polyfill         (js/require "react-native-fetch-polyfill"))
(def fetch                  (.-default fetch-polyfill))
(def i18n                   (js/require "i18n-js"))
(def react-native-languages (.-default (js/require "react-native-languages")))
(def desktop-linking        (.-DesktopLinking (.-NativeModules react-native)))
(def desktop-menu           (js/require "react-native-desktop-menu"))
(def desktop-config         (js/require "react-native-desktop-config"))
(def desktop-shortcuts      (js/require "react-native-desktop-shortcuts"))
(def touchid                #js {})
(def camera                 #js {:RNCamera #js {:constants #js {:Aspect "Portrait"}}})
(def status-keycard         #js {:default #js {}})
(def dialogs                #js {})
(def dismiss-keyboard       #())
(def image-crop-picker      #js {})
(def image-resizer          #js {})
(def svg                    #js {})
(def snoopy                 #js {})
(def snoopy-filter          #js {})
(def snoopy-bars            #js {})
(def snoopy-buffer          #js {})
(def react-native-screens   #js {})
(def background-timer       #js {:setTimeout (fn [cb ms] (js/setTimeout cb ms))})
(def react-navigation       (js/require "react-navigation"))
(def react-native-navigation-twopane  (js/require "react-native-navigation-twopane"))
(def react-native-shake     #js {})
(def net-info               #js {:default #js {}})
(def react-native-mail      #js {:mail (fn [])})
(def async-storage          #js {})
(def back-handler           #js {:addEventListener (fn [])})
(def safe-area-context      #js {})
(def react-native-install-referrer  #js {})
