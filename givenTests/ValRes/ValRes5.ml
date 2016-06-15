(* See also StaticFail48 *)

let e = [] ;;
(* e : forall a. 'a list *)

let nil = function _ -> e ;;
(* nil : forall a b. 'a -> 'b list *)

1 :: nil () ;;
(* - : int list = [1] *)

true :: nil () ;;
(* - : bool list = [true] *)
