(ns frontend.keyboards
  (:require [frontend.handler :as handler]
            [frontend.handler.editor :as editor-handler]
            [frontend.handler.history :as history-handler]
            [frontend.handler.ui :as ui-handler]
            [frontend.handler.route :as route-handler]
            [frontend.state :as state]
            [goog.events.KeyCodes :as codes]))

;; KeyCodes.QUESTION_MARK

;; Credits to roamresearch

;; Triggers
;; Slash Autocomplete /
;; Block Insert Autocomplete <
;; Page reference Autocomplete [[]]
;; Block Reference Autocomplete (())

;; Key Commands (working with lists)
;; Indent Block Tab
;; Unindent Block Shift-Tab
;; Create New Block Enter
;; New Line in Block Shift-Enter
;; Undo Ctrl-z
;; Redo Ctrl-y
;; Zoom In Alt-Right
;; Zoom out Alt-left
;; Follow link under cursor Ctrl-o
;; Open link in Sidebar Ctrl-shift-o
;; Select Block Above Shift-Up
;; Select Block Below Shift-Down
;; Select All Blocks Ctrl-Shift-a

;; General
;; Full Text Search
;; Open Link in Sidebar
;; Context Menu
;; Jump to Journals

;; Formatting
;; Bold Ctrl-b
;; Italics Ctrl-i
;; Html Link Ctrl-k
;; Highlight Ctrl-h

;; Markdown
;; Block

(defonce keyboards
  {
   "tab" editor-handler/cycle-collapse!
   "ctrl+alt+d" state/toggle-document-mode!
   "ctrl+z" history-handler/undo!
   "ctrl+y" history-handler/redo!
   "ctrl+alt+r" ui-handler/toggle-right-sidebar!
   "ctrl+u" route-handler/go-to-search!
   "alt+j" route-handler/go-to-journals!
   "alt+right" editor-handler/zoom-in!
   "ctrl+o" editor-handler/follow-link-under-cursor!
   "ctrl+shift+o" editor-handler/open-link-in-sidebar!
   "ctrl+b" editor-handler/bold-format!
   "ctrl+i" editor-handler/italics-format!
   "ctrl+k" editor-handler/html-link-format!
   "ctrl+h" editor-handler/highlight-format!})