let f0 = fun a b -> (match (a,b) with (0, 1) -> `A`
           | (1, 2) -> `B`);;
(* f0 : int -> int -> char = <fun> *)

f0 1 2;;
(* - : char = `B` *)

let f1 = function a -> (match `B` with
                           `A` -> 1
                         | _   -> 2);;
(* f1 : 'a -> int *)

f1 `A`;;
(* - : int = 2 *)
