try (function _ -> 1) = (function _ -> 2)
with Match_failure _    -> false
   | Division_by_zero   -> false
   | Invalid_argument _ -> true
   | _                  -> false ;;
(* - : bool = true *)
