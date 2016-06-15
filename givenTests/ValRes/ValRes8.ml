let e1 = [] ;;
(* e : forall a. 'a list *)

let e2 = (e1 : 'a list) ;;
(* e2 : forall a. 'a list *)

1 :: e2 ;;
(* - : int list = [1] *)

true :: e2 ;;
(* - : bool list = [true] *)
