(* Value restriction test. *)

let fst (a,b) = a ;;
(* fst : 'a * 'b -> 'a = <fun> *)

let pair = ([], 7) ;;
(* pair : 'a list * int = [], 7 *)

(true :: fst pair, `X` :: fst pair) ;;
(* - : bool list * char list = [true], [`X`] *)
