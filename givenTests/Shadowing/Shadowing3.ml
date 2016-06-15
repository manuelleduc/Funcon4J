exception Match_failure of char ;;
(* Exception Match_failure defined. *)

try (function 0 -> `A`) 1
with Match_failure c -> c
   | _               -> `R` ;;
(* - : char = `R` *)
