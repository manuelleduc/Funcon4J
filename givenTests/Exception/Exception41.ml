try 7 / 0
with Division_by_zero -> 1
   | Match_failure _  -> 2
   | _                -> 3
;;
(* - : int = 1 *)
 