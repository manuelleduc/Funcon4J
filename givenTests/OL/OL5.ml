let not1 x = not x;;

let compose f g = function x -> (f (g x));;
(* compose : ('a -> 'b) -> ('c -> 'a) -> 'c -> 'b = <fun> *)

compose not1 not1 true;;
(* - : bool = true *)