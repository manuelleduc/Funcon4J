let p = ([], ([] : 'a list)) ;;
(* p : 'a list * 'b list = [], [] *)

match p with
  (x,y) -> (1 :: x, true :: y) ;;
(* - : int list * bool list = [1], [true] *)
