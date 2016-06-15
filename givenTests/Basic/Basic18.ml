let x = ref 1
 in !x
;;
(* - : int = 1 *)

let y = ref 1
 in y := 10;
    !y
;;
(* - : int = 10 *)
